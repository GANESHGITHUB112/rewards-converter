public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Convert cash to miles
    private int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Convert miles to cash
    private double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }
}
