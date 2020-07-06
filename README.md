# gina_site

## run the app locally
using docker:

```docker run -p 8080:8080 gholden3/gina-java```

## building and tagging a new image
```./gradlew build && java -jar build/libs/gs-spring-boot-docker-0.1.1.jar```
```docker build --build-arg JAR_FILE="build/libs/gina-0.1.1.jar" -t gholden3/gina-java:0.1.1 -t gholden3/gina-java:latest .```

## push the new image to dockerhub
```docker push gholden3/gina-java:latest```

## restarting deployment service (and therefore fetching a new image from dockerhub)
kubectl rollout restart deployment/gina

## Prod
http://a4bccf68fc7664a06a1976f08f048e8d-1538739663.us-west-2.elb.amazonaws.com/

