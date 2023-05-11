docker rm --force com-bank-core-currency
docker rm $(docker ps --filter status=exited -q)
docker build -t com-bank-core-currency .
docker run -p 8080:8080 com-bank-core-currency