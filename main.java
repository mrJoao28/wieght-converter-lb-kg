import java.util.Scanner;

public class main{
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é a medida (kg , lbs): ");
        String medida = scanner.nextLine();
        medida = medida.trim().toLowerCase();
        System.out.print("\n");
        System.out.print("Qual é seu peso: ");
        double weigth = scanner.nextDouble();
        if (medida.equals("kg")){
            System.out.printf("%.2f lbs \n",weigth*2.20462);
        }
        else if (medida.equals("lbs")){
            System.out.printf("%.2f kg \n",weigth*0.453582);
        }
        else {
            System.out.println("medida invalida");
        }

        scanner.close();

    }

}