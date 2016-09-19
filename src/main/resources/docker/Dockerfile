FROM java:8

MAINTAINER Mehdi Alaoui <mohamed.basri@capgemini.com>

ADD *.jar /etc/synapsis/synapsis-configuration/synapsis-configuration.jar
ADD docker/run.sh /etc/synapsis/synapsis-configuration

RUN chmod +x /etc/synapsis/synapsis-configuration/synapsis-configuration.jar
RUN chmod +x /etc/synapsis/synapsis-configuration/run.sh

EXPOSE 8888

ENTRYPOINT ["bash","run.sh"]

WORKDIR /etc/synapsis/synapsis-configuration/