<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
</head>
<body>
  <h1>🔧 Spring Boot CRUD Application</h1>

  <p>This project demonstrates a basic <strong>Spring Boot</strong> application that performs <strong>CRUD operations</strong> using a <strong>RESTful API</strong> and a <strong>MySQL database</strong>.</p>

  <h2>📌 Features</h2>
  <ul>
    <li>Create, Read, Update, Delete operations using REST APIs</li>
    <li>Integration with MySQL using Spring Data JPA</li>
    <li>Clean, layered architecture (Controller, Service, Repository)</li>
    <li>Testable endpoints via Postman or any API client</li>
  </ul>

  <h2>🛠️ Technologies Used</h2>
  <ul>
    <li>Java</li>
    <li>Spring Boot</li>
    <li>Spring Data JPA</li>
    <li>MySQL</li>
    <li>RESTful APIs</li>
    <li>Maven</li>
    <li>Postman</li>
  </ul>

  <h2>📁 Project Structure</h2>
  <pre>
Spring_Boot_CRUD/
├── controller/
├── model/
├── repository/
├── service/
├── resources/
│   └── application.properties
└── pom.xml
  </pre>

  <h2>▶️ How to Run</h2>
  <ol>
    <li>Clone the repo:<br>
      <code>git clone https://github.com/Piyush74987/Spring_Boot_CRUD.git</code>
    </li>
    <li>Configure <code>application.properties</code> with your MySQL credentials</li>
    <li>Run with your IDE or:<br>
      <code>mvn spring-boot:run</code>
    </li>
    <li>Test using Postman at <code>http://localhost:8080</code></li>
  </ol>

  <h2>📃 License</h2>
  <p>MIT License</p>
</body>
</html>
