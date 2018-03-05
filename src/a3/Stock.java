package a3;

public class Stock extends Investment {

    public Stock(String symbol, String name, int quantity, double price, double bookValue, double gain) throws CustomException {
        super(symbol,name,quantity,price,bookValue,gain);
    }

    public double gainBookValue (int quantity, double price) {
        double bookValue = quantity * price + 9.99;
        System.out.println("bookvalue = "+quantity+" * "+price+" + 9.99");
        System.out.println("bookvalue = "+bookValue);
        super.setBookValue(bookValue);
        return bookValue;
    }

    public double newBookValue (int oldQuantity, int newQuantity, double price, double oldBookValue) {
        double bookValue = oldBookValue * (newQuantity/oldQuantity);
        System.out.println("new bookvalue = "+bookValue);
        super.setBookValue(bookValue);
        return bookValue;
    }
    //newquanity * newPrice + oldBookVal + 9.99
    public double getGains (double bookValue) {

        double gain = ((quantity * price) - 9.99) - bookValue;
        System.out.println("gain = "+quantity+" * "+price+" - 9.99) -"+bookValue);
        System.out.println("gain = "+gain);
        super.setGain(gain);
        return gain;
    }

}
