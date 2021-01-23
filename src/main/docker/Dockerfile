# From java image, version : 8
FROM java:8

# 挂载app目录
VOLUME /app

# COPY or ADD to image
COPY demo-1.0-SNAPSHOT.jar demo.jar

RUN bash -c "touch /demo.jar"
EXPOSE 8001
ENTRYPOINT ["java", "-jar", "demo.jar"]