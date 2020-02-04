#build docker image 
sudo docker build -f Dockerfile -t spring-boot-docker .

#run docker image 
sudo docker run --name spring-boot-docker -d -p 8079:8079 spring-boot-docker

#tagging docker
sudo docker image tag spring-boot-docker mahadi791/spring-boot-docker-200204-1

#push image to docker hub
sudo docker push mahadi791/spring-boot-docker-200204-1