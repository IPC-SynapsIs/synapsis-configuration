FROM java:8

MAINTAINER Mehdi Alaoui <mohamed.basri@capgemini.com>

ADD *.jar /app/app.jar
ADD docker/run.sh /app/

RUN chmod +x /app/app.jar
RUN chmod +x /app/run.sh

EXPOSE 8888

ENTRYPOINT ["bash","run.sh"]

WORKDIR /app