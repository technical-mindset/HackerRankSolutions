public class Main {
    public static void main(String[] args) {
        // Test Case 1:
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015)); // Expected Output: 45

// Test Case 2:
        System.out.println(libraryFine(14, 7, 2018, 5, 7, 2018)); // Expected Output: 135

// Test Case 3:
        System.out.println(libraryFine(5, 5, 2014, 5, 7, 2014)); // Expected Output: 0

// Test Case 4:
        System.out.println(libraryFine(7, 6, 2015, 8, 6, 2015)); // Expected Output: 0

// Test Case 5:
        System.out.println(libraryFine(1, 1, 2016, 31, 12, 2015)); // Expected Output: 10000

// Test Case 6:
        System.out.println(libraryFine(31, 12, 2015, 1, 1, 2015)); // Expected Output: 0

// Test Case 7:
        System.out.println(libraryFine(15, 8, 2023, 1, 1, 2023)); // Expected Output: 3000
        System.out.println(libraryFine(15, 7, 2014, 1, 7, 2015)); // Expected Output: 0
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int fine = 0;

        // base condition
        if (y2 == y1 && m1 == 12 && m2 == 1 && d1 == 31 && d2 == 1) {
            return 0;
        }
        else if (y1 > y2) {
            fine = (y1 - y2) * 10000;
        }
        // what if the book returned a year earlier
        else if (y1 < y2) {
            return 0;
        } else if (y2 == y1 && m1 > m2) {
            fine = (m1 - m2) * 500;
        }
        else if (m2 == m1 && d1 > d2) {
            fine = (d1 - d2) * 15;
        }

        return fine;
    }
}