## Информация о проекте
Необходимо организовать систему учета для питомника, в котором живут
домашние и вьючные животные.

## Задание 1.
   Используя команду cat в терминале операционной системы Linux, создать
   два файла Домашние животные (заполнив файл собаками, кошками,
   хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
   ослы, а затем объединить их. Просмотреть содержимое созданного файла.
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
   Подключить дополнительный репозиторий AnimalTypes. Установить любой пакет
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

   Нарисовать диаграмму, в которой есть родительский класс наследуемый классами домашние
   животные и вьючные животные, в составы которых в случае домашних
   животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
   войдут: Лошади, верблюды и ослы).
   
![Задание 6.PNG](https://github.com/VoldMarius/FinalControlWork/blob/9b6bb3473e9a946443b72e16629d40448c526169/%D0%94%D0%B8%D0%B0%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B0.png)

## Задание 7.

   В подключенном AnimalTypes репозитории создать базу данных “Друзья
   человека”

     CREATE DATABASE IF NOT EXISTS FriendsOfMan;

## Задание 8.

  Создать таблицы с иерархией из диаграммы в БД
      
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
      (1,'Лошади',   1),
      (2,'Ослы',     1),
      (3,'Верблюды', 1);
      
      CREATE TABLE IF NOT EXISTS pets (
      Id INT AUTO_INCREMENT PRIMARY KEY,
      typeOfanimal VARCHAR(100),
      Class_id INT,
      FOREIGN KEY (Class_id) REFERENCES animal_classes (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );
      
      INSERT IGNORE INTO pets (id, typeOfanimal, Class_id) VALUES
      (1,'Коты',   2),
      (2,'Собаки', 2),
      (3,'Хомяки', 2);


## Задание 9.

   Заполнить низкоуровневые таблицы именами(животных), командами
   которые они выполняют и датами рождения

      CREATE TABLE IF NOT EXISTS  cats  (       
      Id INT AUTO_INCREMENT PRIMARY KEY,
      Name VARCHAR(50),
      Birthday DATE,
      Commands VARCHAR(100),
      typeOfanimal int,
      Foreign KEY (typeOfanimal) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE
      );
   
      INSERT IGNORE INTO cats (id,Name, Birthday, Commands, typeOfanimal)
      VALUES 
      (1,'Мурка',  '2022-02-05', 'Спать!',  1),
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
      VALUES 
      (1,'Мухтар', '2021-05-05', 'Аппорт!,Рядом!, Место!, Фу!', 2),
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
      VALUES   
      (1,'Чип',  '2022-01-12', 'Все!!',          3),
      (2,'Дейл', '2022-01-12', 'Нет  не Все!!',  3);
      
      
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
      VALUES
      (1,'Грей',   '2016-05-15', 'Аллюр!,Рысь!',           1),
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
      VALUES 
      (1,'Гриша', '2010-04-12', 'Тупой ..', 2),
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
      VALUES     
      (1,'Cammel',        '2020-01-01', 'Встань!', 3),
      (2,'Cammel-Trophy', '2020-02-02', 'Ляж!',    3);

После выполнения данных команд таблицы будут выглядеть следующим образом:

            Таблица cats:

      | Id | Name    | Birthday   | Commands   | typeOfanimal |
      |----|---------|------------|------------|--------------|
      | 1  | Мурка   | 2022-02-05 | Спать!     | 1            |
      | 2  | Жулька  | 2020-12-12 | Танцуй     | 1            |
      | 3  | Рыська  | 2019-08-08 | Але Оп!    | 1            |
      
      Таблица dogs:

      | Id | Name    | Birthday   | Commands                            | typeOfanimal |
      |----|---------|------------|-------------------------------------|--------------|
      | 1  | Мухтар  | 2021-05-05 | Аппорт!,Рядом!, Место!, Фу!         | 2            |
      | 2  | Зевс    | 2018-03-10 | Барьер!,След!,Взять!                | 2            |
      | 3  | Матис   | 2020-09-11 | Жди!,Вперед!,Лежать!,Сидеть!        | 2            |
      
      Таблица hamsters:

      | Id | Name   | Birthday   | Commands   | typeOfanimal |
      |----|--------|------------|------------|--------------|
      | 1  | Чип    | 2022-01-12 | Все!!      | 3            |
      | 2  | Дейл   | 2022-01-12 | Нет не Все!!| 3           |
      
      Таблица horses:

      | Id | Name   | Birthday   | Commands               | typeOfanimal |
      |----|--------|------------|------------------------|--------------|
      | 1  | Грей   | 2016-05-15 | Аллюр!,Рысь!           | 1            |
      | 2  | Апал   | 2019-07-16 | Аллюр!,Рысь!,Яблоко!   | 1            |
      | 3  | Стелс  | 2020-09-19 | Вперед!,Ногу!,Але!     | 1            |
      | 4  | Тесла  | 2018-01-30 | Вперед!,Аллюр!,Рысь!   | 1            |
      
      Таблица donkeys:
      | Id | Name   | Birthday   | Commands            | typeOfanimal |
      |----|--------|------------|---------------------|--------------|
      | 1  | Гриша  | 2010-04-01 | Тупой ..            | 2            |
      | 2  | Вася   | 2011-03-01 | Ужас какой Тупой    | 2            |
      | 3  | Федя   | 2023-07-01 | Тайна!              | 2            |
      
      Таблица camels:
      | Id | Name          | Birthday   | Commands   | typeOfanimal |
      |----|---------------|------------|------------|--------------|
      | 1  | Cammel        | 2020-01-01 | Всань!     | 3            |
      | 2  | Cammel-Trophy | 2020-02-02 | Ляж!       | 3            |

## Задание 10.

Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку.
Объединить таблицы лошади, и ослы в одну таблицу.

      SET SQL_SAFE_UPDATES = 0; -- => команд устанавливает значение переменной SQL_SAFE_UPDATES в 0, 
                                --   что позволяет выполнить операцию DELETE без использования ключевого слова WHERE. 

      DELETE FROM camels;       -- => удаление всех записей из таблицы "camels".   

      SELECT Name, Birthday, Commands FROM horses       --  ==>  выполняется запрос, который объединяет данные из
                                                        --   таблиц "horses" и "donkeys"			

      UNION SELECT  Name, Birthday, Commands FROM donkeys; -- =>  и выводит их столбцы "Name", "Birthday" и "Commands".

      | Id | Name   | Birthday   | Commands            | typeOfanimal |
      |----|--------|------------|---------------------|--------------|
      | 1  | Грей   | 2016-05-15 | Аллюр!,Рысь!        | 2            |
      | 2  | Апал   | 2019-07-16 | Аллюр!,Рысь!,Яблоко!| 2            |
      | 3  | Стелс  | 2020-09-19 | Вперед!,Ногу!,Але!  | 2            |
      | 4  | Тесла  | 2018-01-30 | Вперед!,Аллюр!,Рысь!| 2            |
      | 5  | Гриша  | 2010-04-12 | Тупой ..            | 2            |
      | 6  | Вася   | 2011-03-13 | Ужас какой Тупой    | 2            |
      | 7  | Федя	| 2023-07-14 | Тайна!              | 2            |

    
## Задание 11.

 Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет
 и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице

     
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

      | Id  | Name   | Birthday   | Commands                    | genus  | Age_in_month |
      |-----|--------|------------|-----------------------------|--------|--------------|
      |  1  | Мухтар | 2021-05-05 | Аппорт! Рядом!  Место!  Фу! | Собаки | 28           |
      |  2  | Мурка  | 2022-02-05 | Спать!                      | Кошки  | 19           |
      |  3  | Жулька | 2020-12-12 | Танцуй !                    | Кошки  | 33           |
      |  4  | Чип    | 2022-01-12 | Все!!                       | Хомяки | 20           |
      |  5  | Дейл   | 2022-01-12 | Нет  не Все!!               | Хомяки | 20           |


## Задание 12. 

 Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.

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

      | Name  | Birthday   | Commands                     | typeOfanimal | Age_in_month |
      |-------|------------|------------------------------|--------------|--------------|
      | Грей  | 2016-05-15 |	Аллюр!,Рысь!	          |   Лошади     |              |
      | Апал  | 2019-07-16 |	Аллюр!,Рысь!,Яблоко!      |   Лошади     |              |
      | Стелс | 2020-09-19 |	Вперед!,Ногу!,Але!	      |   Лошади     |              |
      | Тесла |	2018-01-30 |	Вперед!,Аллюр!,Рысь!      |   Лошади     |              | 
      | Гриша |	2010-04-12 |	Тупой ..	              |   Ослы       |              |
      | Вася  |	2011-03-13 |	Ужас какой Тупой	      |   Ослы       |              |
      | Федя  |	2023-07-14 |	Тайна! 	                  |   Ослы       |              |
      | Мурка |	2022-02-05 |	Спать!	                  |   Коты	     |  19          | 
      | Жулька|	2020-12-12 |	Танцуй	                  |   Коты	     |  33          |
      | Рыська|	2019-08-08 |	Але Оп!	                  |   Коты       |              |
      | Мухтар|	2021-05-05 |	Аппорт!,Рядом!,Место!, Фу!|   Собаки	 |  28          |
      | Зевс  |	2018-03-10 |	Барьер!,След!,Взять!	  |   Собаки     |              |
      | Матис |	2020-09-11 | Жди!,Вперед!,Лежать!,Сидеть! |	  Собаки     |              |
      | Чип	  | 2022-01-12 |	Все!!	                  |   Хомяки	 |  20          |
      | Дейл  | 2022-01-12 |    Нет  не Все!!	          |   Хомяки	 |  20          |


## Задание 13. 

Создать класс с Инкапсуляцией методов и наследованием по диаграмме.

      public class Main {
      public static void main(String[] args) {
     
      // Родительский класс Животное
         public class Animal {
            private String name;
            private int age;
      
          public Animal(String name, int age) {
              this.name = name;
              this.age = age;
          }
      
          public String getName() {
              return name;
          }
      
          public int getAge() {
              return age;
          }
        }
      
      // Класс Домашнее животное, наследуется от Животное
         public class Pet extends Animal {
            public Pet(String name, int age) {
            super(name, age);
            }
         }
      
               // Класс Собака, наследуется от Домашнее животное
               public class Dog extends Pet {
                     public Dog(String name, int age) {
                     super(name, age);
                      }
               }
               
               // Класс Кошка, наследуется от Домашнее животное
               public class Cat extends Pet {
                     public Cat(String name, int age) {
                     super(name, age);
                    }
               }
               
               // Класс Хомяк, наследуется от Домашнее животное
               public class Hamster extends Pet {
                     public Hamster(String name, int age) {
                     super(name, age);
                     }
               }
      
      // Класс Вьючное животное, наследуется от Животное
      public class PackAnimal extends Animal {
            public PackAnimal(String name, int age) {
               super(name, age);
            }
      }
      
               // Класс Лошадь, наследуется от Вьючное животное
               public class Horse extends PackAnimal {
                     public Horse(String name, int age) {
                     super(name, age);
                     }
               }
               
               // Класс Верблюд, наследуется от Вьючное животное
                     public class Camel extends PackAnimal {
                     public Camel(String name, int age) {
                     super(name, age);
                     }
               }
               
               // Класс Осел, наследуется от Вьючное животное
                     public class Donkey extends PackAnimal {
                     public Donkey(String name, int age) {
                     super(name, age);
                     }
               }
      }