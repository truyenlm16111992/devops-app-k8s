FROM openjdk:17-jdk-slim

ENV APP_HOME /app
ENV JAR_FILE demo-0.0.1-SNAPSHOT.jar

RUN mkdir -p $APP_HOME

COPY target/$JAR_FILE $APP_HOME/

WORKDIR $APP_HOME

EXPOSE 80

CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar", "--server.port=80"]