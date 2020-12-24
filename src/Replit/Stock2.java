package Replit;

public class Stock2 {
        public String tickerSymbol , companyName;
        public int price , totalShares;
        public double percentChange;
        public long marketCap;

        public Stock2(String tickerSymbol , String companyName , int price , int totalShares){

            this.tickerSymbol = tickerSymbol.toUpperCase();
            this.companyName = companyName;
            this.price = price;
            this.totalShares = totalShares;
            this.marketCap = totalShares*price;
        }

        public void adjustPrice(int value){
            percentChange = ((double)value)/((double)price);
            price +=value;
            marketCap = totalShares * price;




        }
        public String toString(){
            return "Ticker Symbol: "+tickerSymbol+"\n"+
                    "Company: "+companyName+"\n"+
                    "Current Price: $"+price+" ("+percentChange+"%)"+"\n"+
                    "Market Cap: $"+marketCap;
        }


    }

