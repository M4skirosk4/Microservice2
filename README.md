## Command to create the docker image

docker build -t microservicio1 -f Docker/Dockerfile .

  build
  -t name of the image

  -f ruta al archivo dockerfile

   .

 ##Command to run the container

 docker run -p 8081:8081 microservicio1

   run

   -p external port>:<internal port
 
   name of the container
