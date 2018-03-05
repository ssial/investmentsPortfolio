package a3;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;

public class Main extends JFrame {
    private int i = 0;
    private int j = 0;
    private int counter = 0;
    private JFrame welcome = new JFrame("Investment Portfolio");
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menu;
    private JMenuItem buyOption = new JMenuItem("Buy");
    private JMenuItem sellOption = new JMenuItem("Sell");
    private JMenuItem gainOption = new JMenuItem("Gain");
    private JMenuItem searchOption = new JMenuItem("Search");
    private JMenuItem updateOption = new JMenuItem("Update");
    private JMenuItem quitOption = new JMenuItem("Quit");
    private JTextArea message = new JTextArea(90,80);
    private JLabel welcomeMes;
    private JTextArea textArea1 = new JTextArea();
    private JTextArea textArea2 = new JTextArea();
    private JTextArea textArea3 = new JTextArea();
    private JTextArea textArea4 = new JTextArea();
    private JTextArea textArea5 = new JTextArea();
    private JPanel mainPanel = new JPanel();
    private JPanel buyPanel = new JPanel();
    private JPanel buyPanel1 = new JPanel();
    private JPanel buyPanel2 = new JPanel();
    private JPanel buyPanel3 = new JPanel();
    private JPanel buyPanel4 = new JPanel();
    private JPanel buyPanel5 = new JPanel();
    private JPanel buyPanel6 = new JPanel();
    private JPanel buyPanel7 = new JPanel();
    private JPanel buyPanel8 = new JPanel();
    private JLabel buying = new JLabel("Buying an Investment");
    private JLabel type = new JLabel("Type ");
    private JLabel symbol = new JLabel("Symbol ");
    private JLabel name = new JLabel("Name");
    private JLabel quantity = new JLabel("Quantity");
    private JLabel price = new JLabel("Price");
    private JLabel totalGain = new JLabel("Total Gain");
    private JLabel empty = new JLabel();
    private JLabel empty1 = new JLabel();
    private JLabel empty2 = new JLabel();
    private JLabel empty3 = new JLabel();
    private JTextField symbolField = new JTextField();
    private JTextField nameField = new JTextField();
    private JTextField quantityField = new JTextField();
    private JTextField priceField = new JTextField();
    private JButton reset = new JButton("Reset");
    private JButton reset1 = new JButton("Reset");
    private JButton buy = new JButton("  Buy  ");
    private JComboBox typeBox;
    private JLabel selling = new JLabel("Selling an Investment");
    private JLabel quantity1 = new JLabel("Quantity");
    private JLabel price1 = new JLabel("Price");
    private JLabel symbol1 = new JLabel("Symbol ");
    private JTextField symbolField1 = new JTextField();
    private JTextField quantityField1 = new JTextField();
    private JTextField priceField1 = new JTextField();
    private JPanel sellPanel = new JPanel();
    private JPanel sellPanel1 = new JPanel();
    private JPanel sellPanel2 = new JPanel();
    private JPanel sellPanel3 = new JPanel();
    private JPanel sellPanel4 = new JPanel();
    private JPanel sellPanel5 = new JPanel();
    private JPanel sellPanel6 = new JPanel();
    private JPanel sellPanel7 = new JPanel();
    private JButton sell = new JButton("  Sell  ");
    private JLabel updating = new JLabel("Updating Investments");
    private JPanel uPanel = new JPanel();
    private JPanel uPanel1 = new JPanel();
    private JPanel uPanel2 = new JPanel();
    private JPanel uPanel3 = new JPanel();
    private JPanel uPanel4 = new JPanel();
    private JPanel uPanel5 = new JPanel();
    private JPanel uPanel6 = new JPanel();
    private JPanel uPanel7 = new JPanel();
    private JPanel uPanel8 = new JPanel();
    private JLabel symbol2 = new JLabel("Symbol ");
    private JLabel name2 = new JLabel("Name");
    private JLabel price2 = new JLabel("Price");
    private JTextField symbolField2 = new JTextField();
    private JTextField nameField2 = new JTextField();
    private JTextField priceField2 = new JTextField();
    private JButton save = new JButton("  Save  ");
    private JButton prev = new JButton("  Prev  ");
    private JButton next = new JButton("  Next  ");
    private JLabel gains = new JLabel("Geting total gain");
    private JLabel gainMessage = new JLabel("Individual Gains");
    private JPanel gPanel = new JPanel();
    private JPanel gPanel1 = new JPanel();
    private JPanel gPanel2 = new JPanel();
    private JPanel gPanel3 = new JPanel();
    private JPanel gPanel4 = new JPanel();
    private JPanel gPanel5 = new JPanel();
    private JPanel gPanel6 = new JPanel();
    private JTextField newField = new JTextField();
    private JLabel searching = new JLabel("Searching Investments");
    private JPanel sPanel = new JPanel();
    private JPanel sPanel1 = new JPanel();
    private JPanel sPanel2 = new JPanel();
    private JPanel sPanel3 = new JPanel();
    private JPanel sPanel4 = new JPanel();
    private JPanel sPanel5 = new JPanel();
    private JPanel sPanel6 = new JPanel();
    private JPanel sPanel7 = new JPanel();
    private JButton reset5 = new JButton("Reset");
    private JButton search = new JButton("Search");
    private JLabel key = new JLabel("Name Keywords");
    private JLabel sym = new JLabel("Symbol");
    private JLabel lowP = new JLabel("Low Price");
    private JLabel highP = new JLabel("High Price");
    private JTextField keyField = new JTextField();
    private JTextField symField = new JTextField();
    private JTextField lowField = new JTextField();
    private JTextField highField = new JTextField();
    ArrayList<Investment> investments = new ArrayList<>();

    /**
     * This constructor is responsible for creating the GUI
     */
    public Main() {
        //CREATING MAIN FRAME AND MAIN PANEL
        welcome.setSize(800, 600);
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxLayout boxLayout = new BoxLayout(welcome.getContentPane(), BoxLayout.X_AXIS);
        welcome.setLayout(boxLayout);
        welcome.setJMenuBar(menuBar);
        menu = new JMenu("Commands");
        menuBar.add(menu);
        menu.add(buyOption);
        menu.add(sellOption);
        menu.add(gainOption);
        menu.add(searchOption);
        menu.add(updateOption);
        menu.add(quitOption);
        mainPanel.setLayout(new GridLayout(1,1));
        welcomeMes = new JLabel("<html>Welcome to Investment Portfolio<br><br><br>Chose a command from the \"Commands\" menu to buy or sell an investment,<br>" +
                "update prices for al investments, get gain for the portfolio,<br>search for relevant investments, or quit the program.</html>", SwingConstants.CENTER);
        mainPanel.add(welcomeMes, BorderLayout.CENTER);
        //CREATING BUY PANEL
        String types[] = {"Stock", "Mutual Fund"};
        buyPanel.setLayout(new GridLayout(1,1));
        buyPanel1.setLayout(new GridLayout(2, 1));
        buyPanel2.setLayout(new GridLayout(1,2));
        buyPanel3.setLayout(new GridLayout(6,2,0,10));
        buyPanel3.add(buying);
        buyPanel3.add(empty);
        buyPanel3.add(type);
        typeBox = new JComboBox(types);
        buyPanel3.add(typeBox);
        buyPanel3.add(symbol);
        buyPanel3.add(symbolField);
        symbolField.setEditable(true);
        buyPanel3.add(name);
        buyPanel3.add(nameField);
        nameField.setEditable(true);
        buyPanel3.add(quantity);
        buyPanel3.add(quantityField);
        buyPanel3.add(price);
        buyPanel3.add(priceField);
        buyPanel3.setBorder(new EmptyBorder(10,40,10,10));
        buyPanel4.setLayout(new GridLayout(2,1));
        buyPanel6.add(reset);
        buyPanel6.setBorder(new EmptyBorder(60,10,10,10));
        buyPanel7.add(buy);
        buyPanel4.add(buyPanel6);
        buyPanel4.add(buyPanel7);
        buyPanel5.setLayout(new GridLayout(1,1));
        textArea1.setEditable(false);
        textArea1.setLineWrap(true);
        textArea1.setText(" ");
        JScrollPane scrollPane1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        buyPanel5.add(scrollPane1);
        buyPanel2.add(buyPanel3);
        buyPanel2.add(buyPanel4);
        buyPanel1.add(buyPanel2);
        buyPanel1.add(buyPanel5);
        buyPanel.add(buyPanel1);
        //ADD SELL PANEL
        sellPanel.setLayout(new GridLayout(1,1));
        sellPanel1.setLayout(new GridLayout(2, 1));
        sellPanel2.setLayout(new GridLayout(1,2));
        sellPanel3.setLayout(new GridLayout(4,2,0,20));
        sellPanel3.add(selling);
        sellPanel3.add(empty1);
        sellPanel3.add(symbol1);
        sellPanel3.add(symbolField1);
        symbolField1.setEditable(true);
        sellPanel3.add(quantity1);
        sellPanel3.add(quantityField1);
        sellPanel3.add(price1);
        sellPanel3.add(priceField1);
        sellPanel3.setBorder(new EmptyBorder(10,40,10,10));
        sellPanel4.setLayout(new GridLayout(2,1));
        sellPanel6.add(reset1);
        sellPanel6.setBorder(new EmptyBorder(60,10,10,10));
        sellPanel7.add(sell);
        sellPanel4.add(sellPanel6);
        sellPanel4.add(sellPanel7);
        sellPanel5.setLayout(new GridLayout(1,1));
        textArea2.setEditable(false);
        textArea2.setLineWrap(true);
        textArea2.setText("");
        JScrollPane scrollPane2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sellPanel5.add(scrollPane2);
        sellPanel2.add(sellPanel3);
        sellPanel2.add(sellPanel4);
        sellPanel1.add(sellPanel2);
        sellPanel1.add(sellPanel5);
        sellPanel.add(sellPanel1);
        //ADD UPDATE PANEL
        uPanel.setLayout(new GridLayout(1, 1));
        uPanel1.setLayout(new GridLayout(2, 1));
        uPanel2.setLayout(new GridLayout(1,2));
        uPanel3.setLayout(new GridLayout(4,2,0,20));
        uPanel3.add(updating);
        uPanel3.add(empty2);
        uPanel3.add(symbol2);
        symbolField2.setEditable(false);
        uPanel3.add(symbolField2);
        uPanel3.add(name2);
        nameField2.setEditable(false);
        uPanel3.add(nameField2);
        uPanel3.add(price2);
        uPanel3.add(priceField2);
        uPanel3.setBorder(new EmptyBorder(10,40,10,10));
        uPanel4.setLayout(new GridLayout(3,1));
        uPanel6.add(prev);
        uPanel6.setBorder(new EmptyBorder(60,10,0,10));
        uPanel7.add(next);
        uPanel7.setBorder(new EmptyBorder(30,10,0,10));
        uPanel8.add(save);
        uPanel4.add(uPanel6);
        uPanel4.add(uPanel7);
        uPanel4.add(uPanel8);
        uPanel5.setLayout(new GridLayout(1,1));
        textArea3.setEditable(false);
        textArea3.setLineWrap(true);
        textArea3.setText("");
        JScrollPane scrollPane3 = new JScrollPane(textArea3, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        uPanel5.add(scrollPane3);
        uPanel2.add(uPanel3);
        uPanel2.add(uPanel4);
        uPanel1.add(uPanel2);
        uPanel1.add(uPanel5);
        uPanel.add(uPanel1);
        //ADD GAINS PANEL
        gPanel.setLayout(new GridLayout(1,1));
        gPanel1.setLayout(new GridLayout(2, 1));
        gPanel2.setLayout(new GridLayout(3,1));
        gPanel3.setLayout(new GridLayout(1,2,10,10));
        gPanel5.setLayout(new GridLayout(1,2));
        gPanel3.setBorder(new EmptyBorder(10,10,10,10));
        gPanel3.add(gains);
        gPanel3.add(empty3);
        gPanel5.add(totalGain);
        gPanel5.add(newField);
        newField.setEditable(false);
        gPanel4.setLayout(new GridLayout(1,1));
        textArea4.setEditable(false);
        textArea4.setLineWrap(true);
        textArea4.setText("");
        JScrollPane scrollPane4 = new JScrollPane(textArea4, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        gPanel4.add(scrollPane4);
        gPanel2.add(gPanel3);
        gPanel5.setBorder(new EmptyBorder(10,40,10,100));
        gPanel2.add(gPanel5);
        gPanel6.setLayout(new GridLayout(1,2));
        gPanel6.setBorder(new EmptyBorder(30,10,0,10));
        gPanel6.add(gainMessage);
        gPanel2.add(gPanel6);
        gPanel1.add(gPanel2);
        gPanel1.add(gPanel4);
        gPanel.add(gPanel1);
        //ADD SEARCH PANEL
        sPanel.setLayout(new GridLayout(1,1));
        sPanel1.setLayout(new GridLayout(2, 1));
        sPanel2.setLayout(new GridLayout(1,2));
        sPanel3.setLayout(new GridLayout(5,2,0,20));
        sPanel3.add(searching);
        sPanel3.add(empty3);
        sPanel3.add(sym);
        sPanel3.add(symField);
        symField.setEditable(true);
        sPanel3.add(key);
        sPanel3.add(keyField);
        keyField.setEditable(true);
        sPanel3.add(lowP);
        sPanel3.add(lowField);
        sPanel3.add(highP);
        sPanel3.add(highField);
        sPanel3.setBorder(new EmptyBorder(10,40,10,10));
        sPanel4.setLayout(new GridLayout(2,1));
        sPanel6.add(reset5);
        sPanel6.setBorder(new EmptyBorder(60,10,10,10));
        sPanel7.add(search);
        sPanel4.add(sPanel6);
        sPanel4.add(sPanel7);
        sPanel5.setLayout(new GridLayout(1,1));
        textArea5.setEditable(false);
        textArea5.setLineWrap(true);
        textArea5.setText("Search Results...");
        JScrollPane scrollPane5 = new JScrollPane(textArea5, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sPanel5.add(scrollPane5);
        sPanel2.add(sPanel3);
        sPanel2.add(sPanel4);
        sPanel1.add(sPanel2);
        sPanel1.add(sPanel5);
        sPanel.add(sPanel1);
        //ADD PANELS TO MAIN FRAME
        welcome.add(mainPanel);
        welcome.add(buyPanel);
        welcome.add(sellPanel);
        welcome.add(uPanel);
        welcome.add(gPanel);
        welcome.add(sPanel);
        welcome.setVisible(true);
    }

    /**
     * This method is responsible for adding functionality to the GUI
     */
    public void run () {
        mainPanel.setVisible(true);
        buyPanel.setVisible(false);
        sellPanel.setVisible(false);
        uPanel.setVisible(false);
        gPanel.setVisible(false);
        sPanel.setVisible(false);
        buyOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ensures only the selected panel is visible
                gPanel.setVisible(false);
                mainPanel.setVisible(false);
                sellPanel.setVisible(false);
                uPanel.setVisible(false);
                sPanel.setVisible(false);
                buyPanel.setVisible(true);
                //set i to size of investments array on case file already had data
                i=investments.size();

                buy.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String type = (String) typeBox.getSelectedItem();
                            String symbol = symbolField.getText();
                            int quantity = Integer.parseInt(quantityField.getText());
                            double price = Double.parseDouble(priceField.getText());
                            int index;
                            double retrievePrice;
                            double bookVal;
                            int totalQ = 0;
                            double gain;
                            Stock slist = new Stock(symbol, nameField.getText(), quantity, price, 0, 0);
                            if (type.equals("Stock")) {
                                if (unique(symbol,1)==-1) {//ensures user doesn't create a stock with the same symbol as mutual fund
                                    JOptionPane.showMessageDialog(null,"Mutual Fund already exists with the same symbol");
                                    symbolField.setText("");
                                    nameField.setText("");
                                    quantityField.setText("");
                                    priceField.setText("");
                                }
                                else if (unique(symbol,1)>=0) {//if existing stock was found
                                    index = unique(symbol,1);
                                    totalQ = quantity + investments.get(index).getQuantity();
                                    retrievePrice = investments.get(index).getPrice();
                                    if (price!=retrievePrice) {
                                        bookVal = price * quantity + investments.get(index).getBookValue() + 9.99;
                                        gain = (price * (double)totalQ) - bookVal - 9.99;
                                        //gain = slist.getGains(bookVal);
                                        investments.get(index).setGain(gain);
                                        investments.get(index).setPrice(price);
                                    }
                                    else {
                                        bookVal=slist.gainBookValue(totalQ, price);
                                        gain = (price * (double)totalQ) - bookVal - 9.99;
                                        investments.get(index).setGain(gain);
                                    }
                                    investments.get(index).setQuantity(totalQ);//set new quantity
                                    investments.get(index).setBookValue(bookVal);

                                    textArea1.append("Updated existing stock\n");
                                    textArea1.append(investments.get(index).toString());
                                    //i++;

                                }

                                else {//if symbol doesn't exist create new investment
                                    bookVal = slist.gainBookValue(quantity, price);
                                    investments.add(slist);
                                    gain = (price * (double)quantity) - bookVal - 9.99;
                                    investments.get(i).setGain(gain);
                                    textArea1.append("Successfully purchased new stock\n");
                                    textArea1.append(investments.get(i).toString());
                                    i++;
                                }


                            }
                            else {
                                mutualFund mlist = new mutualFund(symbol,nameField.getText(),quantity,price,0,0);
                                if (unique(symbol,2)==-1) {
                                    JOptionPane.showMessageDialog(null,"Stock already exists with the same symbol");
                                    symbolField.setText("");
                                    nameField.setText("");
                                    quantityField.setText("");
                                    priceField.setText("");
                                }
                                else if (unique(symbol,2)>=0) {
                                    index = unique(symbol,2);
                                    totalQ = quantity + investments.get(index).getQuantity();
                                    retrievePrice = investments.get(index).getPrice();
                                    if (price!=retrievePrice) {
                                        bookVal = price * quantity + investments.get(index).getBookValue();
                                        gain = (price * (double)totalQ) - bookVal - 45;
                                        investments.get(index).setGain(gain);
                                        investments.get(index).setPrice(price);
                                    }
                                    else {
                                        bookVal=mlist.gainBookValue(totalQ, price);
                                        gain = (price * (double)totalQ) - bookVal - 45;
                                        investments.get(index).setGain(gain);
                                    }
                                    investments.get(index).setQuantity(totalQ);//set new quantity
                                    investments.get(index).setBookValue(bookVal);

                                    textArea1.append("Updated existing mutual fund\n");
                                    textArea1.append(investments.get(index).toString());
                                    //i++;

                                }
                                else {
                                    bookVal = mlist.gainBookValue(quantity,price);
                                    investments.add(mlist);
                                    gain = (price * (double)quantity) - bookVal - 45;
                                    investments.get(i).setGain(gain);
                                    textArea1.append("Successfully purchased new mutual fund\n");
                                    textArea1.append(investments.get(i).toString());
                                    i++;
                                }

                            }
                            symbolField.setText("");
                            nameField.setText("");
                            quantityField.setText("");
                            priceField.setText("");

                        } catch (Investment.CustomException m) {
                            JOptionPane.showMessageDialog(null,m.getMessage());
                        }
                        catch (NumberFormatException j) {
                            JOptionPane.showMessageDialog(null,"Invalid Number Value");

                        }
                    }
                });
                reset.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        symbolField.setText("");
                        nameField.setText("");
                        quantityField.setText("");
                        priceField.setText("");
                    }
                });
            }
        });
        sellOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gPanel.setVisible(false);
                buyPanel.setVisible(false);
                uPanel.setVisible(false);
                mainPanel.setVisible(false);
                sPanel.setVisible(false);
                sellPanel.setVisible(true);
                reset1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        symbolField1.setText("");
                        quantityField1.setText("");
                        priceField1.setText("");
                    }
                });
                sell.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String symbol = symbolField1.getText();
                            if (symbol.isEmpty()) {
                                JOptionPane.showMessageDialog(null,"Must Enter Symbol");
                            }

                            int quantity = Integer.parseInt(quantityField1.getText());
                            double price = Double.parseDouble(priceField1.getText());
                            if (quantity<0 || price<0) {
                                quantityField1.setText("");
                                priceField1.setText("");
                                Integer.parseInt(quantityField1.getText());
                                Double.parseDouble(priceField1.getText());
                            }
                            double newBookValue = 0;
                            double oldBookValue = 0;
                            int oldQuantity;
                            int index = -1;
                            int remaining;
                            for (int i = 0;i<investments.size();i++) {
                                if (investments.get(i).getSymbol().equalsIgnoreCase(symbol)) {
                                    index = i;
                                    break;
                                }
                            }
                            if (index==-1) {
                                JOptionPane.showMessageDialog(null,"Investment not found");
                            }
                            else if (investments.get(index).getQuantity()<quantity) {
                                JOptionPane.showMessageDialog(null,"Not enough quantity to sell. Try smaller value");
                                quantityField1.setText("");
                            }
                            else {
                                oldQuantity = investments.get(index).getQuantity();
                                oldBookValue = investments.get(index).getBookValue();

                                remaining =  oldQuantity - quantity;
                                double paymentRecieved = 0;
                                if (remaining==0) {//if nothing is left in the investment then remove it from the arrays
                                    investments.remove(index);
                                }
                                else {//otherwise adjust bookvalue
                                    if (investments.get(index) instanceof mutualFund) {
                                        paymentRecieved = quantity * price - 45.00;
                                    }
                                    else if (investments.get(index) instanceof Stock) {
                                        paymentRecieved = quantity * price - 9.99;
                                    }
                                    newBookValue = oldBookValue*((double)remaining/(double)oldQuantity);
                                    investments.get(index).setQuantity(remaining);
                                    investments.get(index).setPrice(price);
                                    investments.get(index).setBookValue(newBookValue);
                                    textArea2.append("Successfully sold investment\n");
                                    textArea2.append(investments.get(index).toString());
                                    textArea2.append("\nPayment recieved: "+paymentRecieved);
                                }

                            }
                        }
                        catch (NumberFormatException j) {
                            JOptionPane.showMessageDialog(null,"Invalid Number Value");
                        }

                    }
                });

            }
        });
        updateOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gPanel.setVisible(false);
                buyPanel.setVisible(false);
                mainPanel.setVisible(false);
                sellPanel.setVisible(false);
                sPanel.setVisible(false);
                uPanel.setVisible(true);
                prev.setEnabled(false);
                if(investments.size()==1) {
                    next.setEnabled(false);
                    prev.setEnabled(false);
                }
                if (investments.size()==0) {
                    next.setEnabled(false);
                    prev.setEnabled(false);
                    save.setEnabled(false);
                }
                symbolField2.setText(investments.get(counter).getSymbol());
                nameField2.setText(investments.get(counter).getName());
                next.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter++;
                        if (counter<=investments.size()-1) {
                            if (counter==investments.size()-1) {
                                next.setEnabled(false);
                                prev.setEnabled(true);
                            }
                            else {
                                next.setEnabled(true);
                                prev.setEnabled(true);
                            }
                            priceField2.setText("");
                            symbolField2.setText(investments.get(counter).getSymbol());
                            nameField2.setText(investments.get(counter).getName());
                        }

                    }
                });
                save.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            double price = Double.parseDouble(priceField2.getText());
                            if (price<=0) {
                                priceField2.setText("");
                                Double.parseDouble(priceField2.getText());
                            }
                            if (counter>=0&&counter<=investments.size()-1) {
                                investments.get(counter).setPrice(price);
                                textArea3.append("Successfully updated investment");
                                textArea3.append(investments.get(counter).toString());
                            }


                        }catch (NumberFormatException o) {
                            JOptionPane.showMessageDialog(null,"Invalid Number Value");
                        }

                    }
                });
                prev.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        counter--;
                        if(counter>=0) {
                            if (counter==0) {
                                prev.setEnabled(false);
                                next.setEnabled(true);
                            }
                            else {
                                next.setEnabled(true);
                                prev.setEnabled(true);
                            }
                            priceField2.setText("");
                            symbolField2.setText(investments.get(counter).getSymbol());
                            nameField2.setText(investments.get(counter).getName());
                        }
                    }
                });


            }
        });
        gainOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buyPanel.setVisible(false);
                mainPanel.setVisible(false);
                sellPanel.setVisible(false);
                uPanel.setVisible(false);
                sPanel.setVisible(false);
                gPanel.setVisible(true);
                double gainsSum = 0;
                double gain = 0;
                for (int i=0;i<investments.size();i++) {
                    if (investments.get(i) instanceof Stock) {
                        gain = (investments.get(i).getQuantity() * investments.get(i).getPrice()) - investments.get(i).getBookValue() - 9.99;
                        investments.get(i).setGain(gain);
                        gainsSum = gainsSum + gain;
                    }
                    else if (investments.get(i) instanceof mutualFund) {
                        gain = (investments.get(i).getQuantity() * investments.get(i).getPrice()) - investments.get(i).getBookValue() - 45;
                        investments.get(i).setGain(gain);
                        gainsSum = gainsSum + gain;
                    }
                }
                newField.setText(String.valueOf(gainsSum));
                for (int i=0;i<investments.size();i++) {
                    textArea4.append((i+1)+")Investment gain = "+investments.get(i).getGain()+"\n");
                }
            }
        });
        searchOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HashMap <String,ArrayList<Integer>> hmap = buildMap();
                buyPanel.setVisible(false);
                mainPanel.setVisible(false);
                sellPanel.setVisible(false);
                uPanel.setVisible(false);
                gPanel.setVisible(false);
                sPanel.setVisible(true);
                textArea5.append("Please enter 0 for prices if you do not wish to search with them rather than leaving them empty.\n");

                reset5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        symField.setText("");
                        keyField.setText("");
                        highField.setText("");
                        lowField.setText("");
                    }
                });

                search.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        try {
                            String symbol = symField.getText();
                            String key = keyField.getText();
                            double lprice = Double.parseDouble(lowField.getText());
                            double hprice = Double.parseDouble(highField.getText());

                            if (lprice<0 || hprice<0) {
                                JOptionPane.showMessageDialog(null,"Prices must be positive numbers");
                            }

                            else if (lprice>hprice) {
                                JOptionPane.showMessageDialog(null,"Low price cannot be higher than high price");
                            }

                            if (symbol.isEmpty() && key.isEmpty() && lprice==0 && hprice==0) {
                                for (int i=0;i<investments.size();i++) {
                                    textArea5.append(investments.get(i).toString());
                                }
                            }



                        }catch (NumberFormatException l) {
                            JOptionPane.showMessageDialog(null,"Invalid Values for prices");
                        }


                    }
                });

            }
        });
        quitOption.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                writeToFile("output.txt");
                System.exit(1);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                writeToFile("output.txt");
            }
        });
    }

    public HashMap buildMap () {
        HashMap <String,ArrayList<Integer>> hmap = new HashMap<>();


        String name;

        for (int a = 0;a<investments.size();a++) {
            name = investments.get(a).getName().trim();
            String[] splitStr = name.split("\\s+");
            for (int b =0;b<splitStr.length;b++) {
                splitStr[b] = splitStr[b].toLowerCase();
                ArrayList <Integer> arrayInts = hmap.get(splitStr[b]);

                if (arrayInts==null) {
                    arrayInts = new ArrayList<Integer>();
                    arrayInts.add(a);
                    hmap.put(splitStr[b].toLowerCase(),arrayInts);
                }
                else if (!arrayInts.contains(a)) {
                    arrayInts.add(a);
                }
            }
        }

        return hmap;
    }

    /**
     * This method is responsible for checkinf if an investment is unique and returning the index of a found investment
     * @param key (symbol name)
     * @param type (stock or mutual fund)
     * @return
     */
    public int unique (String key, int type) {
        int index = -1;
        if (type==1) {//user entered stock
            for (Investment a: investments) {
                index++;
                if (a instanceof Stock) {
                    if (a.getSymbol().equalsIgnoreCase(key)) {//if stock already exists
                        return index;
                    }
                }
                else {
                    if (a.getSymbol().equalsIgnoreCase(key)) {//if mutual fund exists with same symbol)
                        return -1;
                    }
                }
            }
        }
        else if (type==2) {//user entered mutual fund
            for (Investment a: investments) {
                index++;
                if (a instanceof Stock) {
                    if (a.getSymbol().equalsIgnoreCase(key)) {//if stock exists with same symbol
                        return -1;
                    }
                }
                else {
                    if (a.getSymbol().equalsIgnoreCase(key)) {//if mutual fund already exists
                        return index;
                    }
                }
            }
        }
        return -3;
    }


    public static void main(String[] args) throws CustomException{
        if (args[0] == null) {
            System.out.println("Error: must enter filename");
            return;
        }
        String fileName = args[0];
        Main gui = new Main();
        gui.readFile(fileName);
        gui.run();
    }

    /**
     * This method is responsible for reading in a file
     * @param fileName
     */
    public void readFile(String fileName) {
        BufferedReader reader;

        String symbol;
        String name;
        String type;
        int quantity;
        double price;
        double bookValue;

        try{
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine(); //read in each line seperately
            while (line != null){
                if (line==null||line.length()==0) {
                    break;
                }
                type = line;
                symbol = reader.readLine();
                name = reader.readLine();
                line = reader.readLine();
                quantity = Integer.parseInt(line);
                line = reader.readLine();
                price = Double.parseDouble(line);
                line = reader.readLine();
                bookValue = Double.parseDouble(line);
                line = reader.readLine();
                if(type.equalsIgnoreCase("S")) {
                    try {
                        investments.add(new Stock(symbol, name, quantity, price, bookValue,0));
                    }catch (Investment.CustomException m) {}

                }
                else if (type.equalsIgnoreCase("M")) {
                    try {
                        investments.add(new mutualFund(symbol, name, quantity, price, bookValue,0));
                    }catch (Investment.CustomException p) {}
                }
            }
            reader.close();
        } catch(IOException | NullPointerException k){
            System.out.println("Error: file doesn't exist");
        }
    }

    /**
     * This method is responsible for writing investments to the file when the user quits
     * @param fileName
     */
    public void writeToFile(String fileName) {
        BufferedWriter writeLine;

        try {
            writeLine = new BufferedWriter(new FileWriter(fileName));
            for (int a = 0;a<investments.size();a++) {
                if (investments.get(a) instanceof Stock) {
                    writeLine.write("S\n");
                    writeLine.write(investments.get(a).toString2());
                }
                else if (investments.get(a) instanceof mutualFund) {
                    writeLine.write("M\n");
                    writeLine.write(investments.get(a).toString2());
                }
            }
            writeLine.close();
        }
        catch (IOException j) {
            System.out.println("Error: Could not create file.");
        }


    }


}

