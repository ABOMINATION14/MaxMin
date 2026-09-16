FROM openjdk:17-jdk-slim
WORKDIR /app
COPY MaxMin.java .
RUN javac MaxMin.java
CMD ["java", "MaxMin"]