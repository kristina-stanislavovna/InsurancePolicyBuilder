import java.time.LocalDate;
import java.util.Locale;

public class InsurancePolice {
    private int policeNumber;
    private String holderName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int coverageAmount;

    private boolean includeExtremeSports;
    private boolean includeBaggage;
    private boolean includeFlightDelay;
    private int deductible;
    private String promoCode;

    private InsurancePolice(Builder builder) {
        this.policeNumber = builder.policeNumber;
        this.holderName = builder.holderName;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.coverageAmount = builder.coverageAmount;
        this.includeExtremeSports = builder.includeExtremeSports;
        this.includeBaggage = builder.includeBaggage;
        this.includeFlightDelay = builder.includeFlightDelay;
        this.deductible = builder.deductible;
        this.promoCode = builder.promoCode;
    }


    public int getPoliceNumber() {
        return policeNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getCoverageAmount() {
        return coverageAmount;
    }

    public boolean isIncludeExtremeSports() {
        return includeExtremeSports;
    }

    public boolean isIncludeBaggage() {
        return includeBaggage;
    }

    public boolean isIncludeFlightDelay() {
        return includeFlightDelay;
    }

    public int getDeductible() {
        return deductible;
    }

    public String getPromoCode() {
        return promoCode;
    }


    public static Builder builder(int policeNumber,
                                  String holderName,
                                  LocalDate startDate,
                                  LocalDate endDate,
                                  int coverageAmount) {
        return new Builder(policeNumber, holderName, startDate, endDate, coverageAmount);

    }

    public static class Builder {
        private final int policeNumber;
        private final String holderName;
        private final LocalDate startDate;
        private final LocalDate endDate;
        private final int coverageAmount;

        private boolean includeExtremeSports = false;
        private boolean includeBaggage = false;
        private boolean includeFlightDelay = false;
        private int deductible;
        private String promoCode;

        public Builder(int policeNumber, String holderName, LocalDate startDate, LocalDate endDate, int coverageAmount) {
            this.policeNumber = policeNumber;
            this.holderName = holderName;
            this.startDate = startDate;
            this.endDate = endDate;
            this.coverageAmount = coverageAmount;
        }


        public Builder withIncludeExtremeSports() {
            this.includeExtremeSports = true;
            return (this);
        }

        public Builder withIncludeBaggage() {
            this.includeBaggage = true;
            return (this);
        }

        public Builder withIncludeFlightDelay() {
            this.includeFlightDelay = true;
            return (this);
        }

        public Builder setDeductible(int deductibal) {
            this.deductible = deductibal;
            return this;
        }

        public Builder applyPromoCode(String promoCode) {
            this.promoCode = promoCode;
            return this;
        }
        public InsurancePolice build() {
            return new InsurancePolice(this);
        }

    }

    @Override
    public String toString() {
        return "InsurancePolice{" +
                "policeNumber=" + policeNumber +
                ", holderName='" + holderName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", coverageAmount=" + coverageAmount +
                ", includeExtremeSports=" + includeExtremeSports +
                ", includeBaggage=" + includeBaggage +
                ", includeFlightDelay=" + includeFlightDelay +
                ", deductible=" + deductible +
                ", promoCode='" + promoCode + '\'' +
                '}' + '\n';
    }
}



