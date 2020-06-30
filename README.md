# gina_site

## building and tagging a new image
```docker build --build-arg JAR_FILE="build/libs/gina-0.1.0.jar" -t gholden3/gina-java:1.0.1 -t gholden3/gina-java:latest .```

## run the app 
using docker:

```docker run -p 8080:8080 gholden3/gina-java```

