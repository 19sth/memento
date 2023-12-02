cd ../memento
./mvnw clean package -DskipTests
docker build -t mujdecisy/19sth-memento:$1 .
