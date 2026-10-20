import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        Database database = new Database("jdbc:mysql://localhost:3306/insurance_db",
                "root", "331331mama");
        List<InsurancePolicy> x = database.findAll();
        System.out.println(x);

      /*
      *
        Scanner scanner = new Scanner(System.in);
        Database database = new Database("root",
                "331331mama", "jdbc:mysql://localhost:3306/tech_store");*/
    }
}
