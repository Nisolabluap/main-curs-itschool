Hospital Management System

Design a hospital management system with the following entities:

Patient: Every patient should have a name, age, medical history (a list of strings describing past illnesses or
surgeries), and a unique patient ID. The patient ID should be set using an external system.
Doctor: Every doctor should have a name, specialization (like "Cardiologist", "Dermatologist"), and a list of patients
they are currently treating.
Hospital: The hospital should maintain lists of all registered patients and doctors. It should have methods to admit a
patient, assign a patient to a doctor, and retrieve the list of patients under a specific doctor.