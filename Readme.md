# Employee Management System

A full-stack web application for managing employee records with CRUD (Create, Read, Update, Delete) operations.

## Technology Stack

### Backend
- **Java 17**
- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **Spring Web**
- **Lombok**
- **H2 Database** (for development)
- **MySQL** (for production)
- **Maven** (build tool)

### Frontend
- **React 18.2.0**
- **React Router DOM 6.3.0**
- **Axios 0.27.2**
- **CSS3**

## Features

- ✅ View all employees in a table format
- ✅ Add new employees
- ✅ Edit existing employee information
- ✅ Delete employees with confirmation
- ✅ Responsive web design
- ✅ RESTful API architecture
- ✅ Cross-origin resource sharing (CORS) enabled

## Project Structure

```
em-proj/
├── src/main/java/com/example/employee/em_proj/
│   ├── EmProjApplication.java          # Main Spring Boot application
│   ├── Employee.java                   # Employee DTO/Model
│   ├── EmployeeEntity.java             # JPA Entity
│   ├── EmployeeRepository.java         # JPA Repository
│   ├── EmployeeService.java            # Service Interface
│   ├── EmployeeServiceImpl.java        # Service Implementation
│   └── EmpController.java              # REST Controller
├── src/main/resources/
│   └── application.properties          # Application configuration
├── frontend/
│   ├── src/
│   │   ├── components/
│   │   │   ├── EmployeeList.js         # Employee listing component
│   │   │   ├── AddEmployee.js          # Add employee form
│   │   │   └── EditEmployee.js         # Edit employee form
│   │   ├── services/
│   │   │   └── EmployeeService.js      # API service layer
│   │   ├── App.js                      # Main React component
│   │   └── App.css                     # Styling
│   └── package.json                    # Frontend dependencies
└── pom.xml                             # Maven configuration
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/employees` | Get all employees |
| GET | `/employees/{id}` | Get employee by ID |
| POST | `/employees` | Create new employee |
| PUT | `/employees/{id}` | Update employee |
| DELETE | `/employees/{id}` | Delete employee |

## Employee Model

```json
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "+1234567890"
}
```

## Setup and Installation

### Prerequisites
- Java 17 or higher
- Node.js 14+ and npm
- Maven 3.6+
- MySQL (optional, for production)

### Backend Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd em-proj
   ```

2. **Configure database** (Optional - uses H2 by default)
   - For MySQL, update `application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build and run the backend**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Backend will start on** `http://localhost:9090`

### Frontend Setup

1. **Navigate to frontend directory**
   ```bash
   cd frontend
   ```

2. **Install dependencies**
   ```bash
   npm install
   ```

3. **Start the React application**
   ```bash
   npm start
   ```

4. **Frontend will start on** `http://localhost:3000`

## Configuration

### Application Properties
- **Server Port**: 9090
- **Server Address**: 0.0.0.0 (accessible from all interfaces)
- **Active Profile**: dev (configurable via ENV variable)

### Database
- **Development**: H2 in-memory database
- **Production**: MySQL database (configure in application.properties)

## Development

### Adding New Features
1. **Backend**: Add new endpoints in `EmpController.java`
2. **Service Layer**: Implement business logic in `EmployeeServiceImpl.java`
3. **Frontend**: Create new components in `src/components/`
4. **API Integration**: Update `EmployeeService.js` for new endpoints

### Testing
- Backend: Use Spring Boot Test framework
- Frontend: Use React Testing Library
- API Testing: Use tools like Postman or curl

## Production Deployment

### Backend
1. Package the application: `mvn clean package`
2. Run the JAR file: `java -jar target/em-proj-0.0.1-SNAPSHOT.jar`

### Frontend
1. Build the React app: `npm run build`
2. Serve the build folder using a web server (nginx, Apache, etc.)

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is open source and available under the [MIT License](LICENSE).

## Contact

For questions or support, please contact the