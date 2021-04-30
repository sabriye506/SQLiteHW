package horizoncolumbus.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {


        Connection connection = null;
        String url ="jdbc:sqlite:Resources/student.sql";
        try {
            connection = DriverManager.getConnection(url);
            System.out.println("Connection Success! ");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        String sqlCreateCmd = "create table students " +
                "(id INTEGER, student_name TEXT, grade_level INTEGER, favorite_subject TEXT)";

        try{
            Statement statement = connection.createStatement();
            //statement.execute(sqlCreateCmd);
            System.out.println("Table Created Success! ");
        }catch (Exception ex){
            System.out.println(ex.getMessage());


            String sqlInsertCommand = "insert into students values (1, \"Sabriye\",11, \"Math\");";
            try{
                Statement statement = connection.createStatement();
                statement.execute(sqlCreateCmd);
                System.out.println("Data Inserted Success! ");

            }catch (Exception exception){
                System.out.println(ex.getMessage());
        }

    }
}}
