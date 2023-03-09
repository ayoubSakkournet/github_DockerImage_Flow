FROM openjdk:8
EXPOSE 8072
ADD target/docker_image_springboot.jar docker_image_springboot.jar
ENTRYPOINT [ "java","-jar","/docker_image_springboot.jar" ]