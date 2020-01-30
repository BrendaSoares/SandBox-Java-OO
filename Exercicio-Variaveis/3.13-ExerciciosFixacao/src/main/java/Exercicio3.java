public class Exercicio3 {
    public static void main(String[] args){

        //Multiplos de 3. De 1 até 100

        System.out.println("\nMultiplos de 3:\n");

        for(int numero = 1; numero <= 100; numero++)
            if(numero % 3 == 0){
                System.out.println("Numero: "+numero);
            }
    }
}
