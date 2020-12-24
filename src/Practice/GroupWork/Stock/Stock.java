package Practice.GroupWork.Stock;

public class Stock {
    public String tickerSymbol, companyName;
    public int price, totalShares;
    public double percentChange;
    public long marketCap;


    public Stock(String tickerSymbol, String companyName, int price, int totalShares ){
        this.tickerSymbol = tickerSymbol.toUpperCase();
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        marketCap = totalShares*price;

    }



    public void adjustPrice(int value){

        percentChange = ((double) value/(double)price);
        price+=value;
        marketCap = totalShares*price;

    }




    public String toString() {

            return
                    "TickerSymbol: " + tickerSymbol +"\n" +
                            "Company: " + companyName +  "\n"+
                            "Current Price: $" + price +" ("+percentChange+"%)"+  "\n"+
                            "Market Cap: $" + marketCap;



    }
}

/*
1. Class Variables
tickerSymbol (String)
companyName (String)
price (int)
percentChange (double)
totalShares(int)
marketCap(long)

2. Constructor
Constructor must initialize:
tickerSymbol (and convert the string to uppercase)
companyName
price
totalShares

And calculate

marketCap is calculated by multiplying totalShares by price

3. Class MethodsWrite the following methods:

public void adjustPrice(int value)
This method will change the price by value (value can be positive or negative).  It should also recalculate percentChange and marketCap.  percentChange represents the percentage changed

public String toString()
This method should return a SINGLE String (using \n) that represents something like the following:
Ticker Symbol: GOOG
Company: Google, Inc.
Current Price: $802 (+7.2%)
Market Cap: $538000000000
 */