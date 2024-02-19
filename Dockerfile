FROM registry.access.redhat.com/ubi8/openjdk-17:1.18
ARG APP_HOME=/home/jboss
WORKDIR ${APP_HOME}
COPY target/quarkus-app .
USER root
RUN chown -R jboss:root ${APP_HOME}
USER jboss
EXPOSE 8080
CMD [ "java","-jar","quarkus-run.jar" ]