import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private final String url;
    private final String login;
    private final String password;


    public Database(String url, String login, String password) {
        this.url = url;
        this.login = login;
        this.password = password;
    }
List<InsurancePolicy> findAll() throws SQLException {
    Connection connection = DriverManager.getConnection(url, login, password);
    String sql = "SELECT * FROM insurancePolicy";
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
    List<InsurancePolicy> all = new ArrayList<>();
    while (resultSet.next()) {
        InsurancePolicy insurancePolicy = InsurancePolicy.builder()
                .setPolicyNumber(resultSet.getInt("policyNumber"))
                .setHolderName(resultSet.getString("holderName"))
                .setStartDate(resultSet.getDate("startDate").toLocalDate())
                .setEndDate(resultSet.getDate("endDate").toLocalDate())
                .setCoverageAmount(resultSet.getInt("coverageAmount"))
                .withIncludeExtremeSports(resultSet.getBoolean("includeExtremeSports"))
                .withIncludeBaggage(resultSet.getBoolean("includeBaggage"))
                .withIncludeFlightDelay(resultSet.getBoolean("includeFlightDelay"))
                .withDeductible(resultSet.getInt("deductibal"))
                .withPromoCode(resultSet.getString("promoCode"))
                .build();
        all.add(insurancePolicy);
    }
    return all;
}

}
