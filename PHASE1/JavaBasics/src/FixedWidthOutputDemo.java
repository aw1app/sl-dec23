public class FixedWidthOutputDemo {
    public static void main(String[] args) {
        // Sample data
        String[] names = {"Ali", "Ranjan", "Charles"};
        int[] ages = {25, 30, 35};
        double[] balances = {1010.50, 2000.75, 3050.60};

        // Column widths
        int nameWidth = 15;
        int ageWidth = 10;
        int balanceWidth = 15;

        // Print header
        System.out.printf("========================================\n");
        System.out.printf("%-" + nameWidth + "s%" + ageWidth + "s%" + balanceWidth + "s%n", "Name", "Age", "Balance");
        System.out.printf("========================================\n");
        

        // Print each row
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-" + nameWidth + "s%" + ageWidth + "d%" + balanceWidth + ".2f%n", 
                              names[i], ages[i], balances[i]);
        }
    }
}