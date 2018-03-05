Sawaiba Sial
0990358
Assignment 3
CIS *2430

Description:
This program creates an investment portfolio that stores and manipulates two types of investments; stocks and mutual funds.
Each investment is defined by the following attributes; symbol, name, price, quantity and book value.
The program allows the user to buy, sell, update, get gains and search for investments.
All of the investments are stored in the investments array and are written to an output text file after the program executes.
The user is able to interact with the program through a GUI.

Limitations:
1. Searching
    - program cannot search for investments properly, it only displays all investments when the user leaves text fields blank
    - hashmap is created but isn't utilized in the search
2. Writing to file
    - does not write to file unless user selects quit from commands
    - file has to be called output.txt

Assumptions:
User Input
    - quantity must be positive non zero integer
    - price must be positive non zero number
    - symbol and name fields cannot be empty
Searching
    - if user does not want to search with prices they must enter 0 for the text fields rather than leaving them blank
File
    - filename ("output.txt") is inputted as a command line argument

Instructions to run:
If you wish to run on IntelliJ..
1. Open Main.java
2. Find the button in the top right corner (next to run button) called Main and select "Edit configurations"
3. Enter output.txt in the program paramaters field
4. Press Ok
5. Run using green run button in top right corner
If you wish to run on terminal, please make sure you are in the right directory before executing program
    Program files are located in a3 which is a folder within the src folder
    Enter output.txt as the parameter

Test Plan:

Buying
    Test 1: User Input
        - tested user input boundaries by performing the following test cases:
            1) left everything blank and pressed buy
            result: Invalid number error message
            2) entered numbers but no symbol or name
            result: Must enter symbol error message
            3) entered characters for quantity and price
            result: Invalid number error message
            4) entered negative numbers for quantity and zero for price
            result: Quantity must be greater than zero error message
    Test 2: Brand new stock
        - entered proper values to create a new stock
        result: successfully added stock message and details of stock displayed in text area
    Test 3: Brand new mutual fund
            - entered proper values to create a new mutual fund
            result: successfully added mutual fund message and details of fund displayed in text area
    Test 4: Update existing stock
            - entered symbol of existing stock and a quantity and new price
            result: successfully updated stock message and details of stock displayed in text area with updated values for price and quantity and bookvalue
    Test 5: Reset
            - press rest button
            result: cleared all text fields
Selling:
    Test 1: User Input
            - tested user input boundaries by performing the following test cases:
                1) left everything blank and pressed sell
                result: Must enter symbol error message
                        Invalid number error message
                2) entered numbers but no symbol
                result: Must enter symbol error message
                3) entered characters for quantity and price
                result: Invalid number error message
                4) entered negative numbers for quantity and zero for price
                result: Invalid number error message
                5) entered symbol of non-existing investment
                result: Investment not found error message
                6) entered quantity that is bigger than existing quantity for an investment
                result: Not enough quantity to sell error message
                        cleared quantity text field
    Test 2: Reset
        - press rest button
        result: cleared all text fields
Updating:
    Test 1: tested updates panel with empty investments array
    result: prev button disabled
            next button disabled
            save button disabled
            exception generated
    Test 2: tested updates panel with non-empty investments array
        result: prev button disabled
                next button enabled
                save button enabled
    Test 3: kept pressing next button with non-empty investments array until last element is reached
        result: prev button enabled
                next button disabled
                save button enabled
    Test 4: Input negative number for price
         result: Invalid number error message
    Test 5: Input 0 for price
         result: Invalid number error message
    Test 6: Input character for price
             result: Invalid number error message
Gain:
    Test 1: Asked for total gain with non-empty investments array
            result: displayed value for total gain and individual gain for each investment in text area
    Test 2: Asked for total gain with empty investments array
                result: displayed 0.0 for total gain and no individual gain for each investment in text area
Search:
    Test 1: left all text fields blank
            result: invalid value for prices error message
    Test 2: left all text fields blank but entered 0 for prices
            result: description of all investments displayed in text area
    Test 3: entered low high price and high low price
            result: low price cannot be higher than high price error message








