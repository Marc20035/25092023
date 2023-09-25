package Consumidores;

public class Utilidades {
    public static int numAzar(int max){
        return (int) (Math.random()*max);
    }
    public static void esperarTiempoAzar(int max){
        try {
            Thread.sleep((int) (Math.random()*max));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
