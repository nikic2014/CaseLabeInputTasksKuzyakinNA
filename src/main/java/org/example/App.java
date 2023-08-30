package org.example;

import java.sql.*;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        System.out.println("1 задание:");
        Connection connnaction = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:company.s3db";
            connnaction = DriverManager.getConnection(url);
            System.out.println("Успешное подключение к БД");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Statement statment = connnaction.createStatement();
        statment.execute("CREATE TABLE if not exists 'stuff' ('id' INTEGER " +
                "PRIMARY KEY AUTOINCREMENT, 'surname' VARCHAR(20), " +
                "'experience' NUMBER);");

        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Bryan', 1); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Walker', 2); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Reynolds', 3); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Davis', 4); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Padilla', 5); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Drake', 8); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Shelton', 7); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Davis', 4); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Smith', 12); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Warren', 8); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Hodges', 14); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Jackson', 16); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Richards', 12); ");
        statment.execute("INSERT INTO 'stuff' ('surname', 'experience')" +
        "VALUES ('Wells', 20); ");

        ResultSet resultSet = statment.executeQuery("SELECT surname FROM " +
                "stuff " +
                "ORDER BY experience DESC LIMIT 1,1");
        String surname = resultSet.getString("surname");
        System.out.println(surname);

        connnaction.close();
        statment.close();
        resultSet.close();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 2");
        System.out.println("Введите два числа:");

        task2(scanner.nextInt(), scanner.nextInt());

        System.out.println("Задание 3");
        System.out.println("Введите строку:");
        task3(scanner.next());
    }

    public static void task2 (int a, int b) {
        System.out.println("starts: a = " + a + " and b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("finish: a = " + a + " and b = " + b);
    }

    public static boolean task3(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                System.out.println("Строка:" + s + " не является " +
                        "палиндромом");
                return false;
            }
        }
        System.out.println("Строка:" + s + " является палиндромом");
        return true;
    }
}
