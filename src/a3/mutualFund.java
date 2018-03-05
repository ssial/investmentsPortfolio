package a3;

public class mutualFund extends Investment {
    public mutualFund(String symbol, String name, int quantity, double price, double bookValue, double gain) throws CustomException {
        //try {
            super(symbol,name,quantity,price,bookValue,gain);
        //} catch (CustomException b) {}

    }
    public double gainBookValue (int quantity, double price) {
        double bookValue = quantity * price;
        System.out.println("bookvalue = "+bookValue);
        super.setBookValue(bookValue);
        return bookValue;
    }
    public double getGains (double bookValue) {
        double gain = (quantity * price - 45.00) - bookValue;
        super.setGain(gain);
        return gain;
    }
}
