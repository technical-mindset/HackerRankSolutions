public class Main {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    
        // solving through 1D array 
        int [] arr = new int[n + 2];
        int highestSum = 0;


        for (int i = 0; i < queries.size(); i++) {
            
            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            int k = queries.get(i).get(2);
            
            arr[a] = arr[a] + k;
            arr[b + 1] = arr[b + 1] - k;
        }
 
        for (int i = 1; i <= n; i++) {
            // add prev and current number at current position
            arr[i] = arr[i-1] + arr[i];
            
            highestSum = Math.max(arr[i], highestSum);
        }

        return highestSum;

    }
}
