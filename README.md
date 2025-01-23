# Prodify - Product Management System

**Prodify** is a robust and efficient product management system built using **Spring Boot**, **JSP**, **JDBC**, and **MySQL**. The system allows users to perform CRUD operations on product data, providing a user-friendly interface and seamless functionality.

---

## Features

- **Add Product**: Add new products with details such as name, price, quantity, and category.
- **View All Products**: Display all products in a structured table format.
- **Update Product**: Modify existing product details.
- **Delete Product**: Remove products from the system.
- **Search Products**: Filter and search for products by category, name, or other attributes.

---

## Tech Stack

- **Backend**: Spring Boot
- **Frontend**: JSP (Java Server Pages) with custom CSS
- **Database**: MySQL
- **Database Interaction**: JDBC
- **Design**: Clean and modern UI with an external CSS file for styling

---

## Project Structure

```plaintext
Prodify/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.prodify/
│   │   │   │   ├── controller/   # Controllers to handle requests
│   │   │   │   ├── service/      # Business logic layer
│   │   │   │   ├── dao/          # Data Access Objects
│   │   │   │   ├── model/        # Entity classes
│   │   ├── resources/
│   │   │   ├── application.properties  # Database and app configurations
│   │   ├── webapp/
│   │   │   ├── WEB-INF/
│   │   │   │   ├── jsp/          # JSP files (Frontend pages)
│   │   │   ├── css/              # External CSS files
│   ├── test/
├── pom.xml                        # Maven dependencies
```

---

## Database Schema

The project uses a MySQL database with the following schema for the `product` table:

| Column    | Data Type | Description           |
|-----------|-----------|-----------------------|
| `pid`     | INT       | Primary key (Auto-incremented) |
| `name`    | VARCHAR   | Name of the product   |
| `price`   | DECIMAL   | Price of the product  |
| `qty`     | INT       | Quantity in stock     |
| `category`| VARCHAR   | Category of the product |

---

## Setup and Installation

1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/prodify.git
   cd prodify
   ```

2. Import the project into your IDE as a Maven project.

3. Configure the database connection in `application.properties`:  
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/prodify_db
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

4. Create the `prodify_db` database and import the provided SQL script to create the `product` table.

5. Run the application:  
   ```bash
   mvn spring-boot:run
   ```

6. Access the application at:  
   `http://localhost:8080`

---


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Screenshots

Home Page:

![Screenshot (92)](https://github.com/user-attachments/assets/2ce10749-fde0-4723-a04f-1f3d345675da)

Add Product page:

![Screenshot (93)](https://github.com/user-attachments/assets/c7649692-8502-4a19-b397-c6b4c0a1c60f)

Display All product page:

![Screenshot (94)](https://github.com/user-attachments/assets/6ed70fb5-076c-4ddb-8cff-78cb3c676b6c)



---

## Contact

For questions or feedback, feel free to reach out:

- **Email**: atharvajadhav451311@gmail.com
- **GitHub**: [atharva1311](https://github.com/atharva1311)

---

### Happy Coding! 🚀
