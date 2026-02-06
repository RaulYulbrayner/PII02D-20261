package uniquindio.edu.co;

public class Ejercicio4 {

    public static int sumaNumerosPares(int numero){
        int suma = 0;
        if(numero>0){
            for(int i = 1; i <= numero; i++){
                if(i % 2 == 0){
                    suma+=i;
                }
            }
        }else{
            suma = -1;
        }
        return suma;
    }



    public static void main(String[] args) {
        System.out.println("La suma de los números pares es:" + sumaNumerosPares(1000));
    }
}
