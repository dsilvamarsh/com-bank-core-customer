docker rm --force com-bank-core-customer
docker rm $(docker ps --filter status=exited -q)
docker build -t com-bank-core-customer .
#docker run -p 8080:8080 com-bank-core-customer