**Students Class:**
Attributes: The Students class represents students and includes attributes like firstName, lastName, sex, age,
dateOfBirth, CNP, and address.

Methods: Getter and setter methods allow controlled access to attributes, adhering to encapsulation principles. The
toString method is overridden to provide a formatted representation of student information.

**Professors Class:**
Attributes: Similar to the Students class, the Professors class includes attributes such as firstName, lastName, sex,
age, dateOfBirth, CNP, address, and course.

Methods: Getter and setter methods ensure controlled access to attributes. The toString method provides a formatted
representation of professor information.

**Courses Enum:**
Attributes: The Courses enum defines eight distinct courses with attributes like courseName, schedule and description.

Methods: The getCourseName, getSchedule and getDescription methods allow retrieval of course details. The printCourses
method prints the
course details in a formatted manner.

**CollegeManagementSystem Class:**
Main Method: The main method is the entry point of the application. It demonstrates how to create student and professor
objects, assign courses, and display information.

Data Management: Lists (studentsList and professorsList) store student and professor objects, respectively. Courses are
assigned to professors using setter methods.

Display: Loops iterate through the lists to display student and professor information along with assigned courses and
schedules. A loop also prints details of all available courses.

**Explanation of Technical Decisions:**
Modularity: The implementation uses modular classes to separate concerns and improve maintainability.

Enum for Courses: Using an enum for courses centralizes course information and provides a structured way to manage
course details.

Chaining Setters: Chaining setters in classes like Students and Professors allows for concise and fluid object creation.

Overrides: The toString method is overridden to create a formatted representation of student and professor information.

By following these design decisions and principles, the College Management System demonstrates effective modeling of
real-world entities, encapsulation of data, and adherence to OOP best practices. The note emphasizes the importance of
understanding these principles and explaining technical decisions in the code.