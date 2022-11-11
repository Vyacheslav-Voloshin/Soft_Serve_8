import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test {
    private static final Logger logger = LogManager.getLogger(Test.class.getName());
    public static void main(String[] args) {

        //creating DatabaseConn object
        DatabaseConn databaseConn=new DatabaseConn();
        //calling connect method and giving credentials for establishing database connection
        databaseConn.connect("jdbc:mysql://localhost:3306/first?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","mysql","mysql");
        //calling method for displaying menu
        databaseConn.crudMenu();
        //closing database connection
        databaseConn.closeConnection();

    }
}
