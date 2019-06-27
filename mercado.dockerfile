FROM java

MAINTAINER Lucas Paixao

COPY App.jar /var/www/

WORKDIR /var/www/

ENTRYPOINT ["java" ,"-jar", "App.jar"]
