import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InsurancePolice insurancePolice = InsurancePolice.builder(11
        ,"Alex", LocalDate.of(2026,10,1),
                LocalDate.of(2026,10,11), 100000).applyPromoCode("TRAVEL10").withIncludeExtremeSports().build();

        System.out.println(insurancePolice);

    }
}
