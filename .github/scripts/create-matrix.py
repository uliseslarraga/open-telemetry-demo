import json
import subprocess
import os

def folder_contains_dockerfile(folder_path):
    try:
        return "Dockerfile" in os.listdir(folder_path)
    except FileNotFoundError:
        print(f"Folder not found: {folder_path}")
        return False
    
def get_directories():
    full_command=f"git diff --name-only HEAD^1 HEAD | while read f; do dirname \"$f\"; done | sort -u"
    try:
        return subprocess.run(full_command, shell=True, capture_output=True, text=True)
    except subprocess.CalledProcessError:
        print("Failed to execute command")
        return []

def run():
    modified_dirs = get_directories().stdout.strip().splitlines()
    for dir in modified_dirs:
        if not folder_contains_dockerfile(dir):
            modified_dirs.remove(dir)
    json_data = json.dumps({"response": modified_dirs})
    print(json_data)

    with open("output.json", "w") as f:
         json.dump({"response": modified_dirs}, f, indent=2)
         
if __name__ == "__main__":
    run()