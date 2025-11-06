# Employee Management System

A web-based Employee Management System using Java, JSP, Servlets, JDBC, and MySQL.

## 🧰 Tech Stack Used

- **Frontend**: HTML, CSS, JSP
- **Backend**: Java, Servlets, JDBC
- **Database**: MySQL
- **Build Tool**: Maven
- **Server**: Apache Tomcat 
- **IDE**: Eclipse

## 📌 Features

- Add new employees  
- View all employee records  
- Update employee details  
- Delete employee records  

## 🗂️ Project Structure

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

---

## 🚀 How to Run

1. Clone the repository  
   ```bash
   git clone https://github.com/Prakruthi-G-H/Employee-Management-System.git
2. Open the project in Eclipse IDE

3. Set up the MySQL database
   - Create a database: ems_db
   - Create employee table manually 

4. Configure DB connection in your Java code 

5. Add and configure Apache Tomcat Server
   - Right-click project → Run on Server
   - Choose Apache Tomcat v9 or v10

6.Open the browser and go to: http://localhost:8080/Employee-Management-System/


## 🔮 Future Enhancements

## 👩‍💻 Developed by

**Prakruthi G H**  
📍 Bangalore, India  
📧 prakruthigh28@gmail.com  
🔗 [LinkedIn Profile](https://www.linkedin.com/in/prakruthi-g-h)
