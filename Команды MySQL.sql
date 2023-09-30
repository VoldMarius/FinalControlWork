CREATE DATABASE IF NOT EXISTS FriendsOfMan;
USE FriendsOfMan;

CREATE TABLE IF NOT EXISTS animal_classes
(
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Class_name VARCHAR(100)
);

INSERT IGNORE INTO animal_classes (id , Class_name)
VALUES (1,'вьючные'), (2,'домашние');

CREATE TABLE IF NOT EXISTS pack_animals (
  Id INT AUTO_INCREMENT PRIMARY KEY,
  typeOfanimal VARCHAR(100),
  Class_id INT,
  FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT IGNORE INTO pack_animals (id, typeOfanimal, Class_id) VALUES 
(1,'Лошади', 1),
(2,'Ослы', 1),
(3,'Верблюды', 1);

CREATE TABLE IF NOT EXISTS pets (
  Id INT AUTO_INCREMENT PRIMARY KEY,
  typeOfanimal VARCHAR(100),
  Class_id INT,
  FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT IGNORE INTO pets (id, typeOfanimal, Class_id) VALUES 
(1,'Коты', 2),
(2,'Собаки', 2),
(3,'Хомяки', 2);


CREATE TABLE IF NOT EXISTS  cats  (       
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(50),
  Birthday DATE,
  Commands VARCHAR(100),
  typeOfanimal int,
  Foreign KEY (typeOfanimal) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
  );

  INSERT IGNORE INTO cats (id,Name, Birthday, Commands, typeOfanimal)
  VALUES (1,'Мурка',  '2022-02-05', 'Спать!',  1),
         (2,'Жулька', '2020-12-12', 'Танцуй',  1),  
         (3,'Рыська', '2019-08-08', 'Але Оп!', 1);
         



CREATE TABLE IF NOT EXISTS  dogs  (       
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(50),
  Birthday DATE,
  Commands VARCHAR(100),
  typeOfanimal int,
  Foreign KEY (typeOfanimal) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
  );


  INSERT IGNORE INTO dogs (id,Name, Birthday, Commands, typeOfanimal)
  VALUES (1,'Мухтар', '2021-05-05', 'Аппорт!,Рядом!, Место!, Фу!', 2),
         (2,'Зевс',   '2018-03-10', 'Барьер!,След!,Взять!',        2),  
         (3,'Матис',  '2020-09-11', 'Жди!,Вперед!,Лежать!,Сидеть!',2);
         
 
 CREATE TABLE IF NOT EXISTS  hamsters  (       
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(50),
  Birthday DATE,
  Commands VARCHAR(100),
  typeOfanimal int,
  Foreign KEY (typeOfanimal) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
  );


  INSERT IGNORE INTO hamsters (id,Name, Birthday, Commands, typeOfanimal)
  VALUES   (1,'Чип',  '2022-01-12', 'Все!!',         3),
           (2,'Дейл', '2022-01-12', 'Нет  не Все!!', 3); 

 
CREATE TABLE IF NOT EXISTS  horses
  (       
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(20),
  Birthday DATE,
  Commands VARCHAR(50),
  typeOfanimal int,
  Foreign KEY (typeOfanimal) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
  );

  INSERT IGNORE INTO horses (id,Name, Birthday, Commands, typeOfanimal)
  VALUES (1,'Грей',   '2016-05-15', 'Аллюр!,Рысь!',           1),
         (2,'Апал',   '2019-07-16', 'Аллюр!,Рысь!,Яблоко!',   1),  
         (3,'Стелс',  '2020-09-19', 'Вперед!,Ногу!,Але!',     1),
         (4,'Тесла',  '2018-01-30', 'Вперед!,Аллюр!,Рысь!',   1);
         
-- DROP TABLE donkeys;
       
  
  CREATE TABLE IF NOT EXISTS  donkeys
  (       
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(50),
  Birthday DATE,
  Commands VARCHAR(100),
  typeOfanimal int,
  Foreign KEY (typeOfanimal) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
  );
  INSERT IGNORE INTO donkeys (id,Name, Birthday, Commands, typeOfanimal)
  VALUES  (1,'Гриша', '2010-04-12', 'Тупой ..',         2),
          (2,'Вася',  '2011-03-13', 'Ужас какой Тупой', 2),  
          (3,'Федя',  '2023-07-14', 'Тайна! ',          2);
        
  
 CREATE TABLE IF NOT EXISTS  camels
  (       
  Id INT AUTO_INCREMENT PRIMARY KEY,
  Name VARCHAR(20),
  Birthday DATE,
  Commands VARCHAR(50),
  typeOfanimal int,
  Foreign KEY (typeOfanimal) REFERENCES pack_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
  );
  INSERT IGNORE INTO camels (id,Name, Birthday, Commands, typeOfanimal)
  VALUES     (1,'Cammel',        '2020-01-01', 'Встань!', 3),
             (2,'Cammel-Trophy', '2020-02-02', 'Ляж!',    3);  
 
-- Задание 10.
-- Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
 
  SET SQL_SAFE_UPDATES = 0; -- => команд устанавливает значение переменной SQL_SAFE_UPDATES в 0, 
                            --   что позволяет выполнить операцию DELETE без использования ключевого слова WHERE. 													
  DELETE FROM camels;       -- => удаление всех записей из таблицы "camels".   
  SELECT Name, Birthday, Commands FROM horses       --  ==>  выполняется запрос, который объединяет данные из
														--   таблиц "horses" и "donkeys"												
  UNION SELECT  Name, Birthday, Commands FROM donkeys; -- =>  и выводит их столбцы "Name", "Birthday" и "Commands". 
  
  
--  Задание 11.
-- Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце
-- с точностью до месяца подсчитать возраст животных в новой таблице
DROP TABLE animals;
DROP TABLE yang_animal;  
CREATE TEMPORARY TABLE IF NOT EXISTS  animals AS 

SELECT *, 'Лошади' as genus FROM horses
UNION SELECT *, 'Ослы' AS genus FROM donkeys
UNION SELECT *, 'Собаки' AS genus FROM dogs
UNION SELECT *, 'Кошки' AS genus FROM cats
UNION SELECT *, 'Хомяки' AS genus FROM hamsters;

CREATE TABLE IF NOT EXISTS yang_animal AS
SELECT Name, Birthday, Commands, genus, TIMESTAMPDIFF(MONTH, Birthday, CURDATE()) AS Age_in_month
FROM animals WHERE Birthday BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);
 
SELECT * FROM yang_animal;   

-- Задание 12.
-- Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.


SELECT h.Name, h.Birthday, h.Commands, pa.typeOfanimal, ya.Age_in_month 
FROM horses h
LEFT JOIN yang_animal ya ON ya.Name = h.Name
LEFT JOIN pack_animals pa ON pa.Id = h.typeOfanimal
UNION 
SELECT d.Name, d.Birthday, d.Commands, pa.typeOfanimal, ya.Age_in_month 
FROM donkeys d 
LEFT JOIN yang_animal ya ON ya.Name = d.Name
LEFT JOIN pack_animals pa ON pa.Id = d.typeOfanimal
UNION
SELECT c.Name, c.Birthday, c.Commands, ha.typeOfanimal, ya.Age_in_month 
FROM cats c
LEFT JOIN yang_animal ya ON ya.Name = c.Name
LEFT JOIN pets ha ON ha.Id = c.typeOfanimal
UNION
SELECT d.Name, d.Birthday, d.Commands, ha.typeOfanimal, ya.Age_in_month 
FROM dogs d
LEFT JOIN yang_animal ya ON ya.Name = d.Name
LEFT JOIN pets ha ON ha.Id = d.typeOfanimal
UNION
SELECT hm.Name, hm.Birthday, hm.Commands, ha.typeOfanimal, ya.Age_in_month 
FROM hamsters hm
LEFT JOIN yang_animal ya ON ya.Name = hm.Name
LEFT JOIN pets ha ON ha.Id = hm.typeOfanimal;

   