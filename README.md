# gina_site

## building and tagging a new image
```docker build --build-arg JAR_FILE="build/libs/gina-0.1.0.jar" -t gina-docker .```

## run the app 
using docker:

```docker run -p 8080:8080 gina-docker```

