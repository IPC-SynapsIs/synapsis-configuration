FROM java:8

MAINTAINER Mohamed BASRI <mohamed.basri@capgemini.com>

ADD build/libs/*.jar /etc/synapsis/synapsis-configuration/synapsis-configuration.jar
ADD src/main/resources/docker/run.sh /etc/synapsis/synapsis-configuration/run.sh

RUN chmod +x /etc/synapsis/synapsis-configuration/synapsis-configuration.jar
RUN chmod +x /etc/synapsis/synapsis-configuration/run.sh

EXPOSE 8888

ENTRYPOINT ["bash","run.sh"]

WORKDIR /etc/synapsis/synapsis-configuration/