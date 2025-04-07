# Open Telmetry Java Demo
This is an incremental project in which I will start documenting my journey through Amazon EKS, Kubernetes and MOnitoring with Open Telemetry

- [Repository](https://github.com/uliseslarraga/eks-opentofu) with Opentofu template to deploy EKS infraestructure on AWS

- [Repository](https://github.com/uliseslarraga/open-telemetry-demo-k8s) with K8s Objects 

The stack is composed basically by two services; product-service who consumes price services. Those services are writen in java and are used to create metrics, logs and traces with Open Telemetry Zero Code Instrumentation.

# Requirements 
- Java 21
- Maven 
- Docker 
- Docker compose

<!--"
# Setup Project locally

First step is deploy docker compose stack with the next command

```
docker-compose up
```

TODO Add screenshots and docs how to use Jagger, Prometheus and Grafana" -->

# Contribuition guidelines
Trunk base development aproach for price and product services, docker images are build ondemand based on path modified files

## Next Steps
- Add Java services examples with spring boot ✅
- Add docker compose stack ✅
- Add Grafana service to docker compose ✅
- Create separate repository for Kubernetes resources for java and python services ✅
- Deploy EKS Cluster on AWS with terrafor or Open Tofu ✅
- Add python service with Otel implementation 
- Create grafana dashboards from scrach
- Deploy ArgoCD into EKS
- Migrate K8s objects to Helm Charts

## References
- https://opentelemetry.io/docs/zero-code/java/spring-boot-starter/
- https://www.baeldung.com/spring-boot-opentelemetry-setup
- https://medium.com/@yangli136/how-opentelemetry-is-integrated-with-spring-boot-application-7e309efc0011
- https://medium.com/@blackhorseya/deploying-opentelemetry-collector-jaeger-and-prometheus-with-docker-compose-for-observability-fedd7c0898b5
- https://www.youtube.com/watch?v=gEEOxYOxZ9w&list=PLuGgUSyG_H9lgnnWcb8nrhkRmDeRJGyRZ&index=3