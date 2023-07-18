# URL Hit Counter App

A simple Spring Boot application that tracks the number of visitors to a specific URL.


## Introduction

This project is a basic URL hit counter implemented using Spring Boot. It provides an endpoint that returns the number of visitors who have accessed a specific URL.

## Technologies

The project is created with:

- Java
- Spring Boot
- Spring Web

## Setup

To run this project locally, you need to have Java and Maven installed on your system. Follow these steps to get started:

1. Clone the repository:

```bash
git clone <repository_url>
cd url-hit-counter-app

mvn clean package

mvn spring-boot:run

The application will be accessible at http://localhost:8080/api/v1/visitor-count-app.

GET http://localhost:8080/api/v1/visitor-count-app/count

