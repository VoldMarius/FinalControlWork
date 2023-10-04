
import Classes.Pack;
import Classes.Pet;
import MySQL.ClassType;
import java.sql.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class UserMenu {
    public static void main(String[] args) throws SQLException, InterruptedException, ParseException {

        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        String url = "jdbc:mysql://localhost:3306/AnimalRegistry";
        String username = "root";
        String password = "663300";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement stmt = connection.createStatement();


        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s = "";


        while (!"8".equals(s) && !Thread.interrupted()) {
            Thread.sleep(2800);
            System.out.println("1 - Показать всех животных ");
            System.out.println("2 - Удалить животное ");
            System.out.println("3 - Показать Таблицу по выбору");
            System.out.println("4 - Завести новое животное ");
            System.out.println("5 - Показать список команд животного");
            System.out.println("6 - Определить класс животного");
            System.out.println("7 - Обучить животное новым командам");
            System.out.println("8 - Выйти из программы");
            System.out.println("---------------------");
            System.out.println("Выберите пункт из открывающегося МЕНЮ");
            s = scan.next();
            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
            }
            switch (x) {
                case 1 -> {

                    // Создание запроса
                    Statement statement = connection.createStatement();
                    String sm0 = "DROP TABLE  IF  EXISTS AllAnimals ";
                    statement.execute(sm0);

                    String sm1 = "CREATE TABLE IF NOT EXISTS AllAnimals " +
                            "(id INT NOT NULL AUTO_INCREMENT, " +
                            "Name VARCHAR(255), " +
                            "Birthday DATE, " +
                            "Commands VARCHAR(255)," +
                            "typeOfanimal INT,PRIMARY KEY (id))";

                    statement.executeUpdate(sm1);
                    String sm2 = "INSERT IGNORE INTO AllAnimals (Name, Birthday, Commands, typeOfanimal) " +
                            "SELECT Name, Birthday, Commands, typeOfanimal FROM (" +
                            "SELECT Name, Birthday, Commands, typeOfanimal FROM camels " +
                            "UNION ALL " +
                            "SELECT Name, Birthday, Commands, typeOfanimal FROM horses " +
                            "UNION ALL " +
                            "SELECT Name, Birthday, Commands, typeOfanimal FROM donkeys " +
                            "UNION ALL " +
                            "SELECT Name, Birthday, Commands, typeOfanimal FROM cats " +
                            "UNION ALL " +
                            "SELECT Name, Birthday, Commands, typeOfanimal FROM dogs " +
                            "UNION ALL " +
                            "SELECT Name, Birthday, Commands, typeOfanimal FROM hamsters " +
                            ") AS animals;";
                    statement.executeUpdate(sm2);
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM AllAnimals");

                    TableCreator tableCreator = new TableCreator();
                    tableCreator.createTable(resultSet);
                    System.out.println("Таблица готова!");

                }
                case 2 -> {

                    // Создание запроса
                    System.out.println("Введите Тип животного для удаления ");
                    System.out.println("  1 -  если Верблюд ");
                    System.out.println("  2 -  если Лошадь");
                    System.out.println("  3 -  если Осел");
                    System.out.println("  4 -  если Хомяк ");
                    System.out.println("  5 -  если Собака");
                    System.out.println("  6 -  если Кошка ");
                    System.out.println("  7 -  если передумали");

                    s = scan.next();
                    int i = 0;
                    try {
                        i = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат ввода");
                    }
                    String table_name = "";
                    if (i == 1) {
                        table_name = "camels";
                    }
                    if (i == 2) {
                        table_name = "horses";
                    }
                    if (i == 3) {
                        table_name = "donkeys";
                    }
                    if (i == 4) {
                        table_name = "hamsters";
                    }
                    if (i == 5) {
                        table_name = "dogs";
                    }
                    if (i == 6) {
                        table_name = "cats";
                    }
                    if (i == 7) {
                        break;
                    }

                    // Создание запроса
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM " + table_name);

                    TableCreator tableCreator = new TableCreator();
                    tableCreator.createTable(resultSet);
                    System.out.println("Введите номер id строки которую хотите удалить");

                    int number = Integer.parseInt(scan.next());

                    statement = connection.createStatement();
                    String sql7 = "DELETE FROM " + table_name + " WHERE id  = " + number + ";";
                    statement.executeUpdate(sql7);

                    System.out.println("Строка с id = " + number + " удалена из таблицы.");

                }
                case 3 -> {

                    // Создание запроса
                    System.out.println("Введите Тип животного для вывода Таблицы ");
                    System.out.println("  1 -  если Верблюд ");
                    System.out.println("  2 -  если Лошадь");
                    System.out.println("  3 -  если Осел ");
                    System.out.println("  4 -  если Хомяк ");
                    System.out.println("  5 -  если Собака");
                    System.out.println("  6 -  если Кошка ");
                    System.out.println("  7 -  если передумали");
                    s = scan.next();
                    int i = 0;
                    try {
                        i = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат ввода");
                    }
                    String table_name = "";
                    if (i == 1) {
                        table_name = "camels";
                    }
                    if (i == 2) {
                        table_name = "horses";
                    }
                    if (i == 3) {
                        table_name = "donkeys";
                    }
                    if (i == 4) {
                        table_name = "hamsters";
                    }
                    if (i == 5) {
                        table_name = "dogs";
                    }
                    if (i == 6) {
                        table_name = "cats";
                    }
                    if (i == 7) {
                        break;
                    }


                    // Создание запроса
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM " + table_name);

                    TableCreator tableCreator = new TableCreator();
                    tableCreator.createTable(resultSet);
                    System.out.println("Таблица готова!");

                }
                case 4 -> {

                    int classType;
                    int subType = 0;
                    String table_name = "";
                    Creator creator = new Creator();п

                    System.out.println("введите Класс животного : 1 - если класс Вьючные " +
                            " : 2 - если класс Домашние");
                    classType = Integer.parseInt(scan.next());
                    if (ClassType.getType(classType) == ClassType.Вьючные) {
                        System.out.println("введите Тип животного : 1 -  если Верблюд " +
                                ": 2 -  если Лошадь  " +
                                ": 3 -  если Осел");
                        subType = Integer.parseInt(scan.next());

                    } else {
                        if (ClassType.getType(classType) == ClassType.Домашние) {
                            System.out.println("введите Тип животного : 1 если Хомяк " +
                                    " : 2 если Собака  " +
                                    " : 3 если Кошка");
                            subType = Integer.parseInt(scan.next());

                        }
                    }

                    System.out.println("введите имя ");
                    String name = scan.next();
                    System.out.println("введите Дату рождения " + name + " в формате - dd.MM.yyyy");
                    String dateString = scan.next();
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate birthday = LocalDate.parse(dateString, dateFormatter);


                    System.out.println("введите команды,  которые знает  " + name);
                    String commands = scan.next();


                    if (classType == 1) {
                        Pack pack = creator.newPackCreator(name, subType, birthday, commands);
                        if (subType == 1) {
                            table_name = "camels";
                        }
                        if (subType == 2) {
                            table_name = "horses";
                        }
                        if (subType == 3) {
                            table_name = "donkeys";
                        }

                        // Создание запроса

                        Statement statement = connection.createStatement();
                        String sm3 = "INSERT  INTO " + table_name + " (  Name, Birthday, Commands, typeOfanimal) " +
                                "VALUES (" + "'" + pack.getName() + "'" + "," + "'" + pack.getBirthday() + "'" + "," + "'" + pack.getSkills() + "'" + "," + pack.getClassType() + ")";
                        statement.executeUpdate(sm3);

                    }

                    if (classType == 2) {
                        Pet pet = creator.newPetCreator(name, subType, birthday, commands);
                        if (subType == 1) {
                            table_name = "hamsters";
                        }
                        if (subType == 2) {
                            table_name = "dogs";
                        }
                        if (subType == 3) {
                            table_name = "cats";
                        }


                        // Создание запроса
                        Statement statement = connection.createStatement();
                        String sm4 = "INSERT INTO " + table_name + " ( Name, Birthday, Commands, typeOfanimal) " +
                                "VALUES (" + "'" + pet.getName() + "'" + "," + "'" + pet.getBirthday() + "'" + "," + "'" + pet.getSkills() + "'" + "," + pet.getClassType() + ")";
                        statement.executeUpdate(sm4);
                    }
                    // Создание запроса
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT * FROM " + table_name);

                    TableCreator tableCreator = new TableCreator();
                    tableCreator.createTable(resultSet);

                    System.out.println("Запись создана посмотрите ее в таблице!");

                }
                case 5 -> {
                    // Создание запроса

                    System.out.println("Введите Тип животного - Команды которого нужны ");
                    System.out.println("  1 -  если Верблюд ");
                    System.out.println("  2 -  если Лошадь");
                    System.out.println("  3 -  если Осел ");
                    System.out.println("  4 -  если Хомяк ");
                    System.out.println("  5 -  если Собака");
                    System.out.println("  6 -  если Кошка ");
                    System.out.println("  7 -  если передумали");
                    s = scan.next();
                    int i = 0;
                    try {
                        i = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат ввода");
                    }
                    String table_name = "";
                    if (i == 1) {
                        table_name = "camels";
                    }
                    if (i == 2) {
                        table_name = "horses";
                    }
                    if (i == 3) {
                        table_name = "donkeys";
                    }
                    if (i == 4) {
                        table_name = "hamsters";
                    }
                    if (i == 5) {
                        table_name = "dogs";
                    }
                    if (i == 6) {
                        table_name = "cats";
                    }
                    if (i == 7) {
                        break;
                    }


                    // Создание запроса
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT id, name FROM " + table_name);

                    TableCreator tableCreator = new TableCreator();
                    tableCreator.createTable(resultSet);
                    System.out.println("Введите номер id строки Животного чтобы увидеть команды которые он знает");
                    int number = Integer.parseInt(scan.next());

                    try {

                        statement = connection.createStatement();

                        String query = "SELECT Commands FROM " + table_name + " WHERE id = " + number + ";";

                        resultSet = statement.executeQuery(query);

                        if (resultSet.next()) {
                            String columnValue = resultSet.getString("Commands");
                            System.out.println("команды которые он знает выбранный питомец: " + columnValue);
                        }

//                        resultSet.close();
//                        statement.close();
//                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();


                    }
                }
                case 6 -> {
                    // Создание запроса

                    System.out.println("Введите Тип животного - Класс кторого нужно изменить ");
                    System.out.println("  1 -  если Верблюд ");
                    System.out.println("  2 -  если Лошадь");
                    System.out.println("  3 -  если Осел ");
                    System.out.println("  4 -  если Хомяк ");
                    System.out.println("  5 -  если Собака");
                    System.out.println("  6 -  если Кошка ");
                    System.out.println("  7 -  если передумали");
                    s = scan.next();
                    int i = 0;
                    try {
                        i = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат ввода");
                    }
                    String table_name = "";
                    if (i == 1) {
                        table_name = "camels";
                    }
                    if (i == 2) {
                        table_name = "horses";
                    }
                    if (i == 3) {
                        table_name = "donkeys";
                    }
                    if (i == 4) {
                        table_name = "hamsters";
                    }
                    if (i == 5) {
                        table_name = "dogs";
                    }
                    if (i == 6) {
                        table_name = "cats";
                    }
                    if (i == 7) {
                        break;
                    }


                    // Создание запроса
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT id, name FROM " + table_name);

                    TableCreator tableCreator = new TableCreator();
                    tableCreator.createTable(resultSet);
                    System.out.println("Введите номер id строки Животного чтобы изменить его класс");
                    int number = Integer.parseInt(scan.next());
                    System.out.println("Введите новое значение  класса для выбраного животного");
                    System.out.println("1 -Вьючное или 2 - Домашнее");
                    int newClass = Integer.parseInt(scan.next());
                    try {

                        statement = connection.createStatement();
                        String sm3 = "UPDATE " + table_name + " SET typeOfanimal = '" + newClass + "' WHERE id = " + number + ";";
                        statement.executeUpdate(sm3);

                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    } System.out.println("Класс Изменен!!");
                }
                case 7 -> {
                    // Создание запроса

                    System.out.println("Введите Тип животного - Для обучения ");
                    System.out.println("  1 -  если Верблюд ");
                    System.out.println("  2 -  если Лошадь");
                    System.out.println("  3 -  если Осел ");
                    System.out.println("  4 -  если Хомяк ");
                    System.out.println("  5 -  если Собака");
                    System.out.println("  6 -  если Кошка ");
                    System.out.println("  7 -  если передумали");
                    s = scan.next();
                    int i = 0;
                    try {
                        i = Integer.parseInt(s);
                    } catch (NumberFormatException e) {
                        System.out.println("Неверный формат ввода");
                    }
                    String table_name = "";
                    if (i == 1) {
                        table_name = "camels";
                    }
                    if (i == 2) {
                        table_name = "horses";
                    }
                    if (i == 3) {
                        table_name = "donkeys";
                    }
                    if (i == 4) {
                        table_name = "hamsters";
                    }
                    if (i == 5) {
                        table_name = "dogs";
                    }
                    if (i == 6) {
                        table_name = "cats";
                    }
                    if (i == 7) {
                        break;
                    }


                    // Создание запроса
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery("SELECT id, name FROM " + table_name);

                    TableCreator tableCreator = new TableCreator();
                    tableCreator.createTable(resultSet);
                    System.out.println("Введите номер id строки Животного чтобы изменить его класс");
                    int number = Integer.parseInt(scan.next());
                    System.out.println("Введите команду для обучения");

                    String commands = scan.next();

                    try {

                        statement = connection.createStatement();
                        String sm3 = "UPDATE " + table_name + " SET  Commands  = '" + commands + "' WHERE id = " + number + ";";
                        statement.executeUpdate(sm3);

                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    } System.out.println("Животное Обучено команде '"+commands+"' !!");
                }
            }
        }
    }
}


