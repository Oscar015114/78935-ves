CREATE DATABASE IF NOT EXISTS saludos;
USE saludos;
CREATE USER 'yo'@'localhost' IDENTIFIED BY 'qwerfdsa12';
CREATE USER 'yo'@'%' IDENTIFIED BY 'qwerfdsa12';
GRANT ALL PRIVILEGES ON saludos.* TO 'yo'@'localhost';
GRANT ALL PRIVILEGES ON saludos.* TO 'yo'@'%';
FLUSH PRIVILEGES;