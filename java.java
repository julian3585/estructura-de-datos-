public class java {


    public int java(int numero) {
        long tiempoinicial = System.nanoTime();
        int Suma = 0;
        for (float a = 1; a < numero+1; a++){
            Suma += a;
        }

        long tiempofinal = System.nanoTime();

        long tiempototal = tiempofinal - tiempoinicial;
        System.out.println("tardo en ejecutarse en: " + tiempototal);
        System.out.println("La suma es: "+ Suma);
        return Suma;
    }
    public static void main(String[] args){
        java com = new java();
        System.out.println(com.java(10000000));

    }
}


