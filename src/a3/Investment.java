package a3;

import javax.swing.*;

public class Investment {
    String symbol;
    String name;
    int quantity;
    double price;
    double bookValue;
    double gain;

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }

    public String getSymbol() {

        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBookValue() {
        return bookValue;
    }

    public void setBookValue(double bookValue) {
        this.bookValue = bookValue;
    }

    public class CustomException extends Exception {
        public CustomException(String text) {
            super(text);
        }
    }

    public Investment(String symbol, String name, int quantity, double price, double bookValue, double gain) throws CustomException {
            if(symbol.length() == 0){
                throw new CustomException("Must enter symbol\n");
            }
            this.symbol = symbol;
            if(name.length() == 0){
                throw new CustomException("Must enter name\n");
            }
            this.name = name;
            if(quantity <= 0){
                throw new CustomException("Quantity must be greater than 0\n");
            }
            this.quantity = quantity;
            if(price <= 0){
                throw new CustomException("Price must be greater than 0\n");
            }
            this.price = price;
            this.bookValue = bookValue;
            this.gain = gain;
    }

    @Override
    public String toString(){
        return "\nSymbol: " + symbol + "\n" + "Name: " + name + "\n" +  "Quantity: " + quantity+"\n" + "Price: " + price + "\n"+ "Book Value: " + bookValue+ "\n";
    }

    public String toString2(){
        return symbol + "\n" +name+ "\n" +quantity+"\n" +price+ "\n"+bookValue + "\n";
    }
}
