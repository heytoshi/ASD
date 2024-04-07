CREATE TABLE Dentist (
    id INT PRIMARY KEY,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    phoneNumber VARCHAR(20),
    email VARCHAR(255),
    specialization VARCHAR(255)
);

CREATE TABLE Patient (
    id INT PRIMARY KEY,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    phoneNumber VARCHAR(20),
    email VARCHAR(255),
    address VARCHAR(255),
    dateOfBirth DATE
);

CREATE TABLE Surgery (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    address VARCHAR(255),
    phoneNumber VARCHAR(20)
);

CREATE TABLE Appointment (
    id INT PRIMARY KEY,
    status VARCHAR(255),
    date Date,
	dentistId INT,
    patientId INT,
    surgeryId INT,
    FOREIGN KEY (dentistId) REFERENCES Dentist(id),
    FOREIGN KEY (patientId) REFERENCES Patient(id),
    FOREIGN KEY (surgeryId) REFERENCES Surgery(id)
);

INSERT INTO Dentist (id, firstName, lastName, phoneNumber, email, specialization) VALUES
(1, 'Test', 'John', '123-456-7890', 'test.john@example.com', 'Dentist'),
(2, 'Bob', 'Smith', '987-654-3210', 'bob.smith@example.com', 'Surgeon');

INSERT INTO Patient (id, firstName, lastName, phoneNumber, email, address, dateOfBirth) VALUES
(1, 'Alice', 'Johnson', '555-123-4567', 'alice.johnson@example.com', 'Fairfield', '1990-05-15'),
(2, 'Bob', 'Williams', '555-987-6543', 'bob.williams@example.com', 'Chicago', '1985-10-20');

INSERT INTO Surgery (id, name, address, phoneNumber) VALUES
(1, 'Test Surgery Clinic', 'New York', '555-222-3333'),
(2, 'Test Surgery Center', 'Boston', '555-777-8888');

INSERT INTO Appointment (id, status, date, dentistId, patientId, surgeryId) VALUES
(1, 'Scheduled', '2024-04-10', 1, 1, 1),
(2, 'Scheduled', '2024-04-15', 2, 2, 2);

SELECT * FROM Dentist ORDER BY lastName ASC;

SELECT  Appointment.id AS appointmentId, Appointment.status, Appointment.date, Patient.*
FROM  Appointment JOIN Patient ON Appointment.patientId = Patient.id WHERE  dentistId = 1;

SELECT * FROM Appointment INNER JOIN Surgery ON Appointment.surgeryId = Surgery.id
WHERE Surgery.address = 'Boston';

SELECT * FROM Appointment WHERE patientId = 1 AND date = '2024-04-10';
