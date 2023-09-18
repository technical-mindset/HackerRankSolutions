public class leftRotation{
    
    public static void main(String[] args) {
    List ls = new ArrayList();
    ls.add(1);
    ls.add(2);
    ls.add(3);
    ls.add(4);
    ls.add(5);
    
    rotateLeft(4,ls);
        
    }
    
    
    // Array left rotation program
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List newList = new ArrayList();
        int[] ar = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            ar[i] = arr.get(i);
        }
        for(int i = 0; i < d; i++){
            int temp = ar[0];
            
            for(int j = 0; j < arr.size() - 1; j++){
                ar[j] = ar[j+1];
            }
            
            ar[ar.length - 1] = temp;
        }
        for (int i = 0; i < ar.; i++) {
            arr.add(i, ar[i]);
        }
       
        return newList;
    }
}
