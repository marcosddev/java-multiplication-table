public class Main {
    public static void main(String[] args) {
       
        int number = 7;
        int sum = 0;
        
        System.out.println("Tabuada de " + number);
        System.out.println("---------------------------");
        


        for(int i = 1; i <= 12; i++){
            System.out.println(number + " x " + i +  " = " + (number*i));
            int resultado = number * i;
            sum += resultado; 
        }
        


        System.out.println("---------------------------");
        System.out.println("A soma de todos os resultados é : " + sum);
    }
}
