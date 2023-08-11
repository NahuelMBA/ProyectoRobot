//Disponemos de 3 objetos conocidos: un Hombre, un Robot y una Bateria; sabemos que el Robot
//reconoce las órdenes:
//• Avanzar(cantidad de pasos)
//• Retroceder(cantidad de Pasos)
//• Dormir()
//• Despertar()
//• Recargar()
//• bateriaLLena():boolean
//• bateriaVacia() :boolean
//• energiaActual() :int
//
//También sabemos que un Robot tiene una batería con 1000 unidades de energía y que cada vez
//que avanza o retrocede por cada 100 pasos pierde 10 unidades además si damos la orden al robot
//de dormir, no responderá al avanzar o retroceder hasta despertarlo.
//Para volver a recargar las baterías del robot, bastará con ordenarle que recargue.
//
//La Bateria tiene como atributos carga que es un valor entero, posee un constructor que permite
//inicializar su carga y los métodos get y set para dicho atributo.
//
//Por otro lado el Hombre sabe:
//
//• JugarConRobot(Robot) Este método recibe por parámetro un Robot y con hace lo siguiente:
//
// Hacer que el Robot Avance 500 pasos.
// El robot Retroceda 20 pasos.
// Informe por pantalla cuanta energía tiene el robot Actualmente.
// Ponga el robot a dormir.
//
//Luego desde el método main de una clase TestJuego, se pide:
//
// Crear un Robot.
// Crear un Hombre y pasarle el Robot creado en el ítem anterior.
// Hacer que el Hombre juegue con el Robot.
// Crear otro Hombre y pasarle el mismo Robot
// Hacer que el último Hombre creado juegue con el Robot,
//
//Extra:
//Modificar al método jugar con robot para que reciba por teclado los pasos que desea que avance o
//retroceda el robot las veces que quiera y finalice sólo cuando ponga a dormir al robot. (Puede
//utilizar la clase Scanner para leer desde el teclado).
package com.mycompany.guia3.ejercicio4;
public class Robot {
    
    private int bateria;
    private boolean dormido;

    public Robot() {
        bateria = 10000;
        dormido = false;
        
    }

    public void Avanzar(int pasos) {
        if (dormido == true) {
            bateria -= pasos / 100 * 100;
            System.out.println("Avanzando " + pasos + " pasos.");
        } else {
            System.out.println("No puedo avanzar, estoy dormido.");
        }
    }
    
    public void retroceder(int pasos) {
        if (dormido == true) {
            bateria -= pasos / 100 * 100;
            System.out.println("Retrocedio " + pasos + " pasos.");
        } else {
            System.out.println("No puedo retroceder mas , estoy dormido.");
        }
    }
    
    public void Despierto(){ 
    
        dormido = true;
        System.out.println("El robot se desperto");
    
    }
    
    public void Dormir(){
        
        dormido=false;
        
        System.out.println("El robot se durmio");

    }
    
    public void Recargar(){
    
        bateria = 1000;
        
        System.out.println("La bateria se recargo");
    }
    
    public boolean Bateriallena(){
        
        return bateria== 1000;
                
    }
    
    public boolean BateriaVacia(){
    
        return bateria==0;
    
    }
    
    public int BateriaActual() {
        
        return bateria;
        
    }
    
    
    
}
