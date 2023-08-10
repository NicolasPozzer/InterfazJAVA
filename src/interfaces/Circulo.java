
package interfaces;

public class Circulo implements Figura, Dibujable, Rotable{

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    
    
    //el valor de pi en programacion es 3.14
    //para calcular el area de un circulo es pi x radio al cuadrado
    /*Pero para hacer la funncion al cuadrado, se multiplica 2 veces
    el radio.*/
    
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Estoy rotando un circulo");
    }
    
    
    
    
    
}
