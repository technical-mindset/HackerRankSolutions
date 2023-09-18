public class Main {
    public static void main(String[] args) {
        List<String> sl = new ArrayList<>();
        sl.add("aba");
        sl.add("baba");
        sl.add("aba");
        sl.add("xzxb");
        List<String> q = new ArrayList<>();
        q.add("aba");
        q.add("ab");
        q.add("xzxb");
       List li = matchingStrings(sl,q);
        System.out.println(li);
    }
    
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
    // Write your code here
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < queries.size(); i++){
            Integer num = new Integer(0);
        
            for(int j = 0; j < stringList.size(); j++){
        
                if(queries.get(i).equals(stringList.get(j))){
                    num = num + 1;
                }
        }
        list.add(num); 
    }
    return list;
}
}
