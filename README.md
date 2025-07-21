# Employee Management System

A web-based Employee Management System using Java, JSP, Servlets, JDBC, and MySQL.

## 🧰 Tech Stack Used

- **Frontend**: HTML, CSS, JSP
- **Backend**: Java, Servlets, JDBC
- **Database**: MySQL
- **Build Tool**: Maven
- **Server**: Apache Tomcat (v9 or v10)
- **IDE**: Eclipse

## 📌 Features

- Add new employees  
- View all employee records  
- Update employee details  
- Delete employee records  

## 🗂️ Project Structure
## 📁 Folder Structure

```bash
Employee-Management-System/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/ems/
│       │       ├── controller/       # Servlets (AddEmployee, DeleteEmployee, etc.)
│       │       ├── dao/              # DAO layer (DBConnection, EmpDao)
│       │       ├── model/            # Employee model
│       │       └── service/          # Business logic (Addingservice, SearchandUpdate)
│       └── webapp/
│           ├── WEB-INF/
│           │   └── web.xml           # Deployment descriptor
│           ├── addemployee.html
│           ├── delete.html
│           ├── employee.html
│           ├── manage.html
│           ├── success.jsp
│           ├── update.html
│           ├── updateemployee.jsp
│           └── viewemployee.jsp     # JSP & HTML pages
├── pom.xml
└── README.md
```
