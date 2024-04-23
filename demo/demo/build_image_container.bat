docker build -t microservice-image:latest .
docker run -it --name microservice-container -p 9797:9797 microservice-image:latest