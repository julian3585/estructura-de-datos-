public class java2 {

    public int java2(int numero) {
        long tiempoinicial = System.nanoTime();
        int Suma = 0;
        Suma =(numero * (numero + 1)) / 2;

        long tiempofinal = System.nanoTime();

        long tiempototal = tiempofinal - tiempoinicial;
        System.out.println("tardo en ejecutarse en: " + tiempototal);
        System.out.println("La suma es: "+ Suma);
        return Suma;
    }
    public static void main(String[] args){
        java2 com = new java2();
        System.out.println(com.java2(1000000000));

    }
}
