EmbarkX | Learn Programming
Java Spring Boot Microservices Project with k8s, Docker, AWS | Monolithic to Microservices [PART 1]
https://www.youtube.com/watch?v=BLlEgtp2_i8

TIME STAMPS:
00:00 INTRODUCTION

0:02:43 INTRODUCTION TO SPRING BOOT AND BASICS OF API
Basics of API
Status Codes in API
Types of API requests
What is a Web Framework?
Introduction to Spring Framework
What is Spring Boot?
Spring Boot Architecture

1:00:16 Spring Boot 101: Building Our First REST API
Spring Initializer
Setting up and understanding the Spring Boot Project in Intellij
Let’s discuss Dependencies in Spring Boot
Designing our First Hello World API
How did our API work?
Understanding Spring Boot Auto-Configuration
Introduction to application.properties
Creating a POST request
Project Overview
Setting up the Project
Structuring thoughts
Fetching All Jobs
Adding New Jobs
Setting Up PostMan
Introduction and Setup for POSTMAN

1:41:34 Level up with Spring Boot: Building Our SECOND Project
Setting up Job Service
Challenge: Managing ID's
Getting Single Job
ResponseEntity Class
Challenge: Delete Job
Challenge: Update Job
@RequestMapping Annotation

03:26:11 Getting started with JPA
What is JPA?
Let’s understand Data Layer
H2 database
Configuring our Project for JPA
Understanding Entities in JPA
Defining JPA Repositories
Making Jobs Persistent

4:17:57 Finishing our application
Whats Next?
Setting up Company Controller, Service and Repository
Getting All Companies
Challenge: Update Companies
CRUD on Company
Challenge Defining Review Controller, Service and Repository
Company and Review Relationship
Getting All Reviews Of a Specific Company
Add a review for a specific company
Get a review by review ID for a specific company
Update a review by review ID for a specific company
Delete a review by review ID for a specific company

06:10:32 SPRING BOOT ACTUATOR
Section Introduction
Introduction to Spring Boot Actuator
Setting up Spring Boot Actuator
Enabling all endpoints
Understanding Actuator Endpoints
Exploring /health endpoint
Exploring /info endpoint
Exploring /metrics endpoint
Exploring /loggers endpoint
Exploring /beans endpoint
Exploring /shutdown endpoint
Section Summary

06:56:44 DOCKER WITH SPRING BOOT
Section Introduction
Introduction to Docker
Docker Architecture
Concepts in Docker
Installing Docker on Windows
Installing Docker on Mac
Docker Registry
Docker and Spring Boot
Containerizing Our Spring Boot Application
Docker Commands
Running our Spring Boot Project with Docker
Testing Our Application
Section Summary

08:03:28 MIGRATING TO POSGRESQL
Section Introduction
What Is PostgreSQL and Why Use It?
Understand dependencies
Configuring our app to work with PostgreSQL
Intro to Docker Networks
Running PostgreSQL locally with Docker
Docker Compose for Multi-Container Spring Boot Applications
Creating Databases using PGAdmin
Testing app

08:53:36 INTRO TO MICROSERVICES
Before Microservices
Problems with Monolithic Architecture
What are Microservices and their need
Overcoming Monolithic Architecture Challenges

09:16:13 MICROSERVICES: RESTRUCTURING OUR APPLICATION
Planning our changes
How are we going to structure our microservices
Creating Job Service
Refactoring Job Service
Creating Company Service
Refactoring Company Service
Creating Review Service
Refactoring Review Service
Unifying the view in Intellij
Migrating to PostgreSQL
Creating docker-compose.yml
Testing changes

10:35:44 SYNCHRONOUS COMMUNICATION: INTER-SERVICE COMMUNICATION USING REST TEMPLATE
Introduction to InterService communication
What is REST Template and why do you need it?
Communicating via RestTemplate
DTO Pattern
Testing Changes in PostMan