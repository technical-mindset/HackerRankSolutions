class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> newGrades = new ArrayList<>();
    
    for (Integer integer : grades) {
       
        if ((integer < 38)) {
            newGrades.add(integer);
        } 
       else if((integer + 2) % 5 == 0){
            newGrades.add(integer + 2);    
        }
        else if((integer + 1) % 5 == 0){
            newGrades.add(integer + 1);    
        }      
         else {
            newGrades.add(integer);
        } 
        
    }
    
    return newGrades;

    }

}