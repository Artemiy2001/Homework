package home_work_2.loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int x = 2, y = 1; y != 11;){
            String ySpase;
            String spase;
            String separator;

            if(x == 5){
                separator = "";
            }else {
                separator = " | ";
            }
            if (y <= 9){
                ySpase = " ";
            }else {
                ySpase = "";
            }

            if (y * x <= 9){
                spase = " ";
            }else {
                spase = "";
            }

            System.out.print(x + " * " + y + ySpase + " = " + x * y + spase + separator);

            x++;

            if (x == 6){
                x = 2;
                y++;
                System.out.println();
            }

        }
        System.out.println("-----------------------------------------------------");

        for (int x = 6, y = 1; y != 11;){
            String ySpase;
            String spase;
            String separator;

            if(x == 9){
                separator = "";
            }else {
                separator = " | ";
            }
            if (y <= 9){
                ySpase = " ";
            }else {
                ySpase = "";
            }

            if (y * x <= 9){
                spase = " ";
            }else {
                spase = "";
            }

            System.out.print(x + " * " + y + ySpase + " = " + x * y + spase + separator);

            x++;

            if (x == 10){
                x = 6;
                y++;
                System.out.println();
            }

        }
    }
}
