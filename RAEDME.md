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




