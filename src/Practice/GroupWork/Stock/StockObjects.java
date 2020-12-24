package Practice.GroupWork.Stock;
public class StockObjects {

    public static void main(String[] args) {

        Stock s1 = new Stock("AAPL", "Apple", 122, 555_321);



        s1.adjustPrice(-20);

        System.out.println(s1);

        Stock st = new Stock("AA", "ArcAngle",7,100);

        System.out.println(st);
        st.adjustPrice(-2);
        System.out.println(st);
    }
}
