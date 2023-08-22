# CSV to RDBMS Data Reconciliation Project

This project demonstrates how to read data from a CSV file and insert it into a relational database using Spring Boot.

## Table of Contents

- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Project Structure

The project is organized as follows:

- `src/main/java/com/csv_to_rdbms`: Contains the Java source code.
  - `controller`: Handles HTTP requests and interacts with the service layer.
  - `entity`: Defines JPA entities representing the data model.
  - `repository`: Contains JPA repositories for interacting with the database.
  - `service`: Contains the business logic and CSV-to-database conversion.
- `src/main/resources`: Contains application configuration and resources.
  - `data.csv`: Sample CSV file containing data to be inserted into the database.
- `pom.xml`: Maven configuration file for project dependencies.

## Getting Started

To run this project on your machine, you need to have Java, Maven, and a relational database (e.g., MySQL) set up.

1. Clone this repository to your local machine.
2. Open the project in your preferred IDE.
3. Configure the database connection in `src/main/resources/application.properties`.
4. Run the Spring Boot application.

## Usage

1. Start the Spring Boot application.
2. Access the `/rdbms/update-data` endpoint using your preferred API client (e.g., Postman).
3. The CSV data will be read and inserted into the database.

## Contributing

Contributions are welcome! If you have any suggestions, improvements, or bug fixes, feel free to create an issue or a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

---

*This project was created by [Eric Maniraguha](https://github.com/ericmaniraguha/update_rdbms_from_csv.git).*

## Screenshoot images: 

![image](https://github.com/ericmaniraguha/update_rdbms_from_csv/assets/44385819/0578ea7b-c62c-4c4f-bb0c-6b05e616a698)
![image](https://github.com/ericmaniraguha/update_rdbms_from_csv/assets/44385819/109f3fb0-a1b6-48e8-b64c-0f6c620fc2af)

