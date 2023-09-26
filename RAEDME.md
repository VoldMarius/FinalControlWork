## Информация о проекте
Необходимо организовать систему учета для питомника, в котором живут
домашние и вьючные животные.

## Задание 1.
   Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы), а затем объединить их. Просмотреть содержимое созданного файла.
   Переименовать файл, дав ему новое имя (Друзья человека).

    mkdir Питомник      
    cd Пикошк томник     
    cat > "Домашние животные"    
    кошки собаки хомяки     
    cat > "Вьючные животные"    
    лошади верблюды  ослы    
    cat "Домашние животные" "Вьючные животные" > "Зверье мое"    
    cat "Зверье мое"  
    mv "Зверье мое" "Друзья человека"

![Задание 1.PNG](https://github.com/VoldMarius/FinalControlWork/blob/99c7116391c7d15225380cc9b9911962aead5345/%D0%97%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%201.PNG)

## Задание 2.
   Создать директорию, переместить файл туда

      mkdir Ферма
      mv "Друзья человека" Ферма
      cd Ферма
      ls -l

![Задание 2.PNG](https://github.com/VoldMarius/FinalControlWork/blob/3e878b181514b4e21b6116c1c67340a4d069ffec/%D0%97%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%202.PNG)

## Задание 3.
   Подключить дополнительный репозиторий MySQL. Установить любой пакет
   из этого репозитория.

      sudo wget https://dev.mysql.com/get/mysql-apt-config_0.8.23-1_all.deb
      sudo dpkg -i mysql-apt-config_0.8.23-1_all.deb
      sudo apt-get update
      sudo apt-get install mysql-server


![Задание 3.1.PNG](https://github.com/VoldMarius/FinalControlWork/blob/8d0a29aaf3d25c9cddada872def20efa331ed01e/%D0%97%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%203%20(%D0%9F%D0%B5%D1%80%D0%B2%D1%8B%D0%B9%20%D1%81%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA).PNG)
![Задание 3.2.PNG](https://github.com/VoldMarius/FinalControlWork/blob/8d0a29aaf3d25c9cddada872def20efa331ed01e/%D0%97%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%203%20(%D0%92%D1%82%D0%BE%D1%80%D0%BE%D0%B9%20%D1%81%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA).PNG)
![Задание 3.3.PNG](https://github.com/VoldMarius/FinalControlWork/blob/8d0a29aaf3d25c9cddada872def20efa331ed01e/%D0%97%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%203%20(%D0%A2%D1%80%D0%B5%D1%82%D0%B8%D0%B9%20%D1%81%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA).PNG)
![Задание 3.Настройка.PNG](https://github.com/VoldMarius/FinalControlWork/blob/8d0a29aaf3d25c9cddada872def20efa331ed01e/%D0%97%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%203%20(%D0%9D%D0%B0%D1%81%D1%82%D1%80%D0%BE%D0%B9%D0%BA%D0%B0).PNG)

## Задание 4.
   Установить и удалить deb-пакет с помощью dpkg.
 

      sudo wget https://download.docker.com/linux/ubuntu/dists/jammy/pool/stable/amd64/docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb
      sudo dpkg -i docker-ce-cli_20.10.13~3-0~ubuntu-jammy_amd64.deb.1
      sudo dpkg -r docker-ce-cli

![Задание 4.PNG](https://github.com/VoldMarius/FinalControlWork/blob/d65df8a22de21b98392da7c1bea59bcb74081820/%D0%97%D0%B0%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5%204.PNG)

## Задание 5.

  Выложить историю команд в терминале ubuntu
 
     Все скрины приложены к каждому заданию по ходу выполнения


## Задание 6.

   Нарисовать диаграмму, в которой есть класс родительский класс, домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
   
![Задание 6.PNG](https://github.com/VoldMarius/FinalControlWork/blob/9b6bb3473e9a946443b72e16629d40448c526169/%D0%94%D0%B8%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B0.png)

## Задание 7.

   В подключенном MySQL репозитории создать базу данных “Друзья
   человека”

     CREATE DATABASE Друзья человека;

## Задание 8.

   Создать таблицы с иерархией из диаграммы в БД
      
      USE Друзья человека;

      CREATE TABLE animal_classes
      (Id INT AUTO_INCREMENT PRIMARY KEY,
      Class_name VARCHAR(100));

      INSERT INTO animal_classes (Class_name)
      VALUES ('вьючные'),('домашние');
      
      CREATE TABLE pack_animals(
      Id INT AUTO_INCREMENT PRIMARY KEY,typeOfanimal VARCHAR (100),
      Class_id INT,FOREIGN KEY (Class_id) REFERENCES  animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );

      INSERT INTO pack_animals (typeOfanimal, Class_id)VALUES ('Лошади', 1),
      ('Ослы', 1),  ('Верблюды', 1);

      CREATE TABLE pets
      (Id INT AUTO_INCREMENT PRIMARY KEY,
      typeOfanimal VARCHAR (100),Class_id INT,
      FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE);

      После выполнения данных команд таблицы будут выглядеть следующим образом:
      
         Таблица animal_classes:
         +----+------------+
         | Id | Class_name |
         +----+------------+
         |  1 | вьючные    |
         |  2 | домашние   |
         +----+------------+
         
         Таблица pack_animals:
         +----+--------------+----------+
         | Id | typeOfanimal | Class_id |
         +----+--------------+----------+
         |  1 | Лошади       |        1 |
         |  2 | Ослы         |        1 |
         |  3 | Верблюды     |        1 |
         +----+--------------+----------+
         
         Таблица pets:
         +----+--------------+----------+
         | Id | typeOfanimal | Class_id |
         +----+--------------+----------+
         |  1 | Кошки        |        2 |
         |  2 | Собаки       |        2 |
         |  3 | Хомяки       |        2 |
         +----+--------------+----------+


## Задание 9.

   Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения


      CREATE TABLE cats
      (       
      Id INT AUTO_INCREMENT PRIMARY KEY,
      Name VARCHAR(50),
      Birthday DATE,
      Commands VARCHAR(100),
      typeOfanimal int,
      Foreign KEY (typeOfanimal) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );

      INSERT INTO cats (Name, Birthday, Commands, typeOfanimal)
      VALUES ('Мурка',  '2022-02-05', 'Спать!',  1),
             ('Жулька', '2020-12-12', 'Танцуй',  1),  
             ('Рыська', '2019-08-08', 'Але Оп!', 1);

      
      CREATE TABLE dogs
      (       
      Id INT AUTO_INCREMENT PRIMARY KEY,
      Name VARCHAR(50),
      Birthday DATE,
      Commands VARCHAR(100),
      typeOfanimal int,
      Foreign KEY (typeOfanimal) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );
      INSERT INTO dogs (Name, Birthday, Commands, typeOfanimal)
      VALUES ('Дик', '2020-01-01', 'ко мне, лежать, лапу, голос', 2),
      ('Граф', '2021-06-12', "сидеть, лежать, лапу", 2),  
      ('Шарик', '2018-05-01', "сидеть, лежать, лапу, след, фас", 2),
      ('Босс', '2021-05-10', "сидеть, лежать, фу, место", 2);
      
      CREATE TABLE hamsters
      (       
      Id INT AUTO_INCREMENT PRIMARY KEY,
      Name VARCHAR(20),
      Birthday DATE,
      Commands VARCHAR(50),
      typeOfanimal int,
      Foreign KEY (typeOfanimal) REFERENCES home_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );
      INSERT INTO hamsters (Name, Birthday, Commands, typeOfanimal)
      VALUES ('Малой', '2020-10-12', '', 3),
      ('Медведь', '2021-03-12', "атака сверху", 3),  
      ('Ниндзя', '2022-07-11', NULL, 3),
      ('Бурый', '2022-05-10', NULL, 3);
      
      CREATE TABLE horses
      (       
      Id INT AUTO_INCREMENT PRIMARY KEY,
      Name VARCHAR(20),
      Birthday DATE,
      Commands VARCHAR(50),
      Genus_id int,
      Foreign KEY (Genus_id) REFERENCES packed_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );
      INSERT INTO horses (Name, Birthday, Commands, Genus_id)
      VALUES ('Гром', '2020-01-12', 'бегом, шагом', 1),
      ('Закат', '2017-03-12', "бегом, шагом, хоп", 1),  
      ('Байкал', '2016-07-12', "бегом, шагом, хоп, брр", 1),
      ('Молния', '2020-11-10', "бегом, шагом, хоп", 1);
      
      CREATE TABLE donkeys
      (       
      Id INT AUTO_INCREMENT PRIMARY KEY,
      Name VARCHAR(20),
      Birthday DATE,
      Commands VARCHAR(50),
      Genus_id int,
      Foreign KEY (Genus_id) REFERENCES packed_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );
      INSERT INTO donkeys (Name, Birthday, Commands, Genus_id)
      VALUES ('Первый', '2019-04-10', NULL, 2),
      ('Второй', '2020-03-12', "", 2),  
      ('Третий', '2021-07-12', "", 2),
      ('Четвертый', '2022-12-10', NULL, 2);
      
      CREATE TABLE camels
      (       
      Id INT AUTO_INCREMENT PRIMARY KEY,
      Name VARCHAR(20),
      Birthday DATE,
      Commands VARCHAR(50),
      Genus_id int,
      Foreign KEY (Genus_id) REFERENCES packed_animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );
      INSERT INTO camels (Name, Birthday, Commands, Genus_id)
      VALUES ('Горбатый', '2022-04-10', 'вернись', 3),
      ('Самец', '2019-03-12', "остановись", 3),  
      ('Сифон', '2015-07-12', "повернись", 3),
      ('Борода', '2022-12-10', "улыбнись", 3);