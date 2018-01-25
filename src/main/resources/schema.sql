CREATE TABLE faculty (
  faculty_id  INT PRIMARY KEY,
  name        VARCHAR(80),
  description VARCHAR(255)
);

CREATE TABLE teacher (
  teacher_id IDENTITY PRIMARY KEY,
  name       VARCHAR(40),
  moniker    VARCHAR(40)
);

CREATE TABLE groups (
  group_id   IDENTITY PRIMARY KEY,
  name       VARCHAR(40),
  faculty_id INT,
  FOREIGN KEY (faculty_id) REFERENCES faculty (faculty_id)
);

CREATE TABLE human (
  human_id     IDENTITY PRIMARY KEY,
  first_name   VARCHAR(40),
  second_name  VARCHAR(40),
  address      VARCHAR(200),
  phone_number BIGINT,
  email        VARCHAR(40)
);

CREATE TABLE student (
  student_id          IDENTITY PRIMARY KEY,
  student_card_number BIGINT,
  course_number       INT,
  group_id            INT,
  human_id            INT,
  FOREIGN KEY (group_id) REFERENCES groups (group_id),
  FOREIGN KEY (human_id) REFERENCES human (human_id)
);

CREATE TABLE groups_teacher (
  group_id   INT,
  teacher_id INT
);

INSERT INTO faculty (faculty_id, name, description) VALUES (1, 'CC&IT', 'Faculty computer science and IT');
INSERT INTO faculty (faculty_id, name, description) VALUES (2, 'MaM', 'Mechanical and Mathematics');

INSERT INTO teacher (name, moniker) VALUES ('Obe Van Kanobe', 'Uchitel');
INSERT INTO teacher (name, moniker) VALUES ('Yoda', 'Yoda');
INSERT INTO teacher (name, moniker) VALUES ('Walter White', 'Mr Heisenberg');

INSERT INTO groups (name, faculty_id) VALUES ('441', 1);
INSERT INTO groups (name, faculty_id) VALUES ('411', 2);

INSERT INTO groups_teacher (group_id, teacher_id) VALUES (1, 1);
INSERT INTO groups_teacher (group_id, teacher_id) VALUES (1, 2);
INSERT INTO groups_teacher (group_id, teacher_id) VALUES (1, 3);
INSERT INTO groups_teacher (group_id, teacher_id) VALUES (2, 1);
INSERT INTO groups_teacher (group_id, teacher_id) VALUES (2, 3);

INSERT INTO human (first_name, second_name, address, phone_number, email)
VALUES ('Jon', 'Snow', 'Vesteros', 8945231985, 'uknownothingjs@martin.com');
INSERT INTO human (first_name, second_name, address, phone_number, email)
VALUES ('Luke', 'Skywalker', 'Tatuin', 89421232234, 'lule@starwars.com');
INSERT INTO human (first_name, second_name, address, phone_number, email)
VALUES ('Hannibal', 'Lecter', 'USA', 89123452123, 'thesilenceofthelambs@human.com');
INSERT INTO human (first_name, second_name, address, phone_number, email)
VALUES ('John', 'Constantine', 'Liverpool', 89243231912, 'constantine@john.com');
INSERT INTO human (first_name, second_name, address, phone_number, email)
VALUES ('Gendalf', 'White', 'Middle Earth', 89231234910, 'hobbits@thebest.com');

INSERT INTO student (human_id, student_card_number, course_number, group_id)
VALUES (1, 3921832123, 0, 1);
INSERT INTO student (human_id, student_card_number, course_number, group_id)
VALUES (2, 133212313, 2, 1);
INSERT INTO student (human_id, student_card_number, course_number, group_id)
VALUES (3, 312321231, 2, 1);
INSERT INTO student (human_id, student_card_number, course_number, group_id)
VALUES (4, 23456932, 3, 2);