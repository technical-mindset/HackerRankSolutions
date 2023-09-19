import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println(bonAppetit(Arrays.asList(2,5,3,8,2), 3, 10));
        
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int b_Accutal = 0;
        
        for (int i = 0; i < bill.size(); i++) {
            // adding except price at 'k'
            if (bill.get(i) != bill.get(k)) {
                b_Accutal += bill.get(i);
            }
        }
        
        if (b_Accutal/2 == b) {
            System.out.println("Bon Appetit");
        }
            
        else if (b_Accutal < b) {
            System.out.println(b - b_Accutal);
        }
    }
}
