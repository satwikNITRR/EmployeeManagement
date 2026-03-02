DROP TABLE IF EXISTS employee CASCADE;

CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone_number VARCHAR(50) NOT NULL,
    address VARCHAR(500) NOT NULL,
    date_of_birth DATE NOT NULL,
    joining_date DATE NOT NULL,
    designation VARCHAR(255) NOT NULL,
    department VARCHAR(255) NOT NULL,
    employment_type VARCHAR(100) NOT NULL,
    status VARCHAR(100) NOT NULL
);

INSERT INTO employee (
    name,
    email,
    phone_number,
    address,
    date_of_birth,
    joining_date,
    designation,
    department,
    employment_type,
    status
) VALUES
('Neha Verma', 'neha.verma@company.com', '9123456780', 'Pune, Maharashtra', '1997-08-22', '2024-01-15', 'Backend Developer', 'IT', 'FULL_TIME', 'ACTIVE'),
('Rahul Mehta', 'rahul.mehta@company.com', '9988776655', 'Ahmedabad, Gujarat', '1993-02-10', '2022-09-20', 'Senior Developer', 'IT', 'FULL_TIME', 'ACTIVE'),
('Priya Singh', 'priya.singh@company.com', '9012345678', 'Noida, Uttar Pradesh', '1998-11-05', '2023-07-10', 'HR Executive', 'HR', 'FULL_TIME', 'ACTIVE'),
('Karan Patel', 'karan.patel@company.com', '9090909090', 'Mumbai, Maharashtra', '1996-06-18', '2024-02-01', 'Intern', 'IT', 'INTERN', 'ACTIVE'),
('Sneha Iyer', 'sneha.iyer@company.com', '9345678123', 'Chennai, Tamil Nadu', '1994-01-30', '2021-03-15', 'Team Lead', 'IT', 'FULL_TIME', 'ACTIVE'),
('Rohit Kumar', 'rohit.kumar@company.com', '9876501234', 'Patna, Bihar', '1992-09-09', '2020-11-25', 'DevOps Engineer', 'IT', 'FULL_TIME', 'ACTIVE'),
('Anjali Gupta', 'anjali.gupta@company.com', '9765432109', 'Jaipur, Rajasthan', '1999-12-14', '2024-05-01', 'QA Engineer', 'IT', 'CONTRACT', 'ACTIVE'),
('Vikram Rao', 'vikram.rao@company.com', '9812345670', 'Hyderabad, Telangana', '1989-07-07', '2019-08-12', 'Project Manager', 'Management', 'FULL_TIME', 'ACTIVE'),
('Pooja Nair', 'pooja.nair@company.com', '9900112233', 'Kochi, Kerala', '1991-03-25', '2018-04-05', 'Business Analyst', 'Business', 'FULL_TIME', 'RESIGNED'),
('Amit Sharma', 'satwik.sharma@company.com', '9876543210', 'Pamgarh', '2025-01-20', '2023-06-01', 'Software Engineer', 'Hetch R', 'FULL_TIME', 'ACTIVE'),
('Amit Sharma', 'hello.sharma@company.com', '9876543210', 'Pamgarh', '2025-01-20', '2023-06-01', 'Software Engineer', 'Heloooooooooooooooooooooooooooooooooooo', 'FULL_TIME', 'ACTIVE'),
('Amit Sharma', 'abcddddd.sharma@company.com', '9876543210', 'Pamgarh', '2025-01-20', '2023-06-01', 'Software Engineer', 'hellooo ko kiya bye bye ', 'FULL_TIME', 'ACTIVE'),
('Amit Sharma', 'abcddddd.sharma@company', '9876543210', 'Pamgarh', '2025-01-20', '2023-06-01', 'Software Engineer', 'hellooo ko kiya bye bye ', 'FULL_TIME', 'ACTIVE'),
('Amit Sharma', 'abcddddd.sharma@gmail', '9876543210', 'Pamgarh', '2025-01-20', '2023-06-01', 'Software Engineer', 'hellooo ko kiya bye bye ', 'FULL_TIME', 'ACTIVE'),
('Amit Sharma', 'abcddddd.sharma@yahoo', '9876543210', 'Pamgarh', '2025-01-20', '2023-06-01', 'Software Engineer', 'hellooo ko kiya bye bye ', 'FULL_TIME', 'ACTIVE'),
('Rahul Verma', 'rahul.verma@example.com', '9876543210', '123, MG Road, Bengaluru, Karnataka', '1998-06-15', '2024-01-10', 'Software Engineer', 'Engineering', 'Full-Time', 'ACTIVE');
