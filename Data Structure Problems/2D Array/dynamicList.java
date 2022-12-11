public class dynamicList{

    public List<List<Integer>> list;
    int n;
    int lastAnswer;
    public List lA; //for all lastAnswers

    dynamicList(int n){
    
       list = new ArrayList<>();
        lA = new ArrayList();
        this.n = n;
        this.lastAnswer = 0;
    }

       // where the list break according to query
      public void query(@NotNull List<List<Integer>> list){
 
            // creating an 'n' empty ArrayList and add into 2D list
          for (int i = 0; i < this.n; i++) {
              this.list.add(new ArrayList<>());
          }

          for (int index = 0; index < list.size(); index++) {
          
              if (list.get(index).get(0) == 1){
                  q1(list.get(index).get(1), list.get(index).get(2));
              }
              else{
                  q2(list.get(index).get(1), list.get(index).get(2));
              }
          }

    }
    
    // perform operation according to query 1
    private void q1(Integer x, Integer y){
    
        int idx = (x ^ this.lastAnswer) % this.n;
        this.list.get(idx).add(y);
    }
    
    // perform operation according to query 2
      private void q2(int x, int y){
      
         int idx = (x ^ this.lastAnswer) % this.n;
         this.lastAnswer = this.list.get(idx).get(y % this.list.get(idx).size());
         this.lA.add(this.lastAnswer);
      }
}
