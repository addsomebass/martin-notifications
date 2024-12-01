#Commands for docker building

docker login
docker buildx build --platform linux/amd64 -t martin-notifications .
docker tag martin-notifications addsomebass/martin-notifications:3
docker push addsomebass/martin-notifications:3


kubectl apply -f kube/deployment.yaml