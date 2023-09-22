public class Main {
    public static void main(String[] args) {

    }
    static String catAndMouse(int x, int y, int z) {
        String finalWin = "";

        // --- Collecting the position of each cat from the mouse
        int posX = Math.max(x,z) - Math.min(x,z);
        int posY = Math.max(y,z) - Math.min(y,z);

        if(posX == posY){
            finalWin = "Mouse C";
        }
        else if (posX > posY ) {
            finalWin= "Cat B";
        }
        else {
            finalWin= "Cat A";
        }

        return finalWin;
    }
}
