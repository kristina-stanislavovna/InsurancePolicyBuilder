import java.time.LocalDate;

public class InsurancePolicy {

    private int policyNumber;
    private String holderName;
    private LocalDate startDate;
    private LocalDate endDate;
    private int coverageAmount;

    private boolean includeExtremeSports;
    private boolean includeBaggage;
    private boolean includeFlightDelay;
    private int deductible;
    private String promoCode;


    private InsurancePolicy(Builder builder) {
        this.policyNumber = builder.policyNumber;
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


    // ---------- STEP INTERFACES ----------

    public interface PolicyNumberStep {
        HolderNameStep setPolicyNumber(int policyNumber);
    }

    public interface HolderNameStep {
        StartDateStep setHolderName(String holderName);
    }

    public interface StartDateStep {
        EndDateStep setStartDate(LocalDate startDate);
    }

    public interface EndDateStep {
        CoverageAmountStep setEndDate(LocalDate endDate);
    }

    public interface CoverageAmountStep {
        BuildStep setCoverageAmount(int coverageAmount);
    }

    public interface BuildStep {

        BuildStep withIncludeExtremeSports(boolean includeExtremeSports);

        BuildStep withIncludeBaggage(boolean includeBaggage);

        BuildStep withIncludeFlightDelay(boolean includeFlightDelay);

        BuildStep withDeductible(int deductible);

        BuildStep withPromoCode(String promoCode);

        InsurancePolicy build();
    }


    // ---------- START BUILDER ----------

    public static PolicyNumberStep builder() {
        return new Builder();
    }


    // ---------- BUILDER ----------

    private static class Builder implements
            PolicyNumberStep,
            HolderNameStep,
            StartDateStep,
            EndDateStep,
            CoverageAmountStep,
            BuildStep {

        private int policyNumber;
        private String holderName;
        private LocalDate startDate;
        private LocalDate endDate;
        private int coverageAmount;

        private boolean includeExtremeSports;
        private boolean includeBaggage;
        private boolean includeFlightDelay;
        private int deductible;
        private String promoCode;


        @Override
        public HolderNameStep setPolicyNumber(int policyNumber) {
            this.policyNumber = policyNumber;
            return this;
        }

        @Override
        public StartDateStep setHolderName(String holderName) {
            this.holderName = holderName;
            return this;
        }

        @Override
        public EndDateStep setStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        @Override
        public CoverageAmountStep setEndDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }

        @Override
        public BuildStep setCoverageAmount(int coverageAmount) {
            this.coverageAmount = coverageAmount;
            return this;
        }


        // ---------- OPTIONAL ----------

        @Override
        public BuildStep withIncludeExtremeSports(boolean includeExtremeSports) {
            this.includeExtremeSports = includeExtremeSports;
            return this;
        }

        @Override
        public BuildStep withIncludeBaggage(boolean includeBaggage) {
            this.includeBaggage = includeBaggage;
            return this;
        }

        @Override
        public BuildStep withIncludeFlightDelay(boolean includeFlightDelay) {
            this.includeFlightDelay = includeFlightDelay;
            return this;
        }

        @Override
        public BuildStep withDeductible(int deductible) {
            this.deductible = deductible;
            return this;
        }

        @Override
        public BuildStep withPromoCode(String promoCode) {
            this.promoCode = promoCode;
            return this;
        }


        @Override
        public InsurancePolicy build() {
            return new InsurancePolicy(this);
        }
    }


    // ---------- GETTERS ----------

    public int getPolicyNumber() {
        return policyNumber;
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

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyNumber=" + policyNumber +
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