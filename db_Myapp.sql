CREATE TABLE users_tbl (
  user_id INT PRIMARY KEY,
  user_firstname VARCHAR(40) NOT NULL,
  user_lastname VARCHAR(40) NOT NULL,
  user_email VARCHAR(60) NOT NULL,
  user_password VARBINARY(256)
);
