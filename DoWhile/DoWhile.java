import java.util.Scanner;

class DoWhile{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Comando WHILE
        int i = 0;
        
        System.out.println("Informe um valor de 0 a 10: ");
        int max = scan.nextInt();

        System.out.println("Contando até " + max);

        while(i <= max){
            System.out.println("O valor de i: " + i);
            i++;
        }

        //Comando doWhile
        do{
            i++;
            System.out.println("Valor de i: " + i);
        }while(i <= 15);

        System.out.println(i);
    }
}