#build docker image 
sudo docker build -f Dockerfile -t spring-boot-docker .

#run docker image 
sudo docker run --name spring-boot-docker -d -p 8079:8079 spring-boot-docker