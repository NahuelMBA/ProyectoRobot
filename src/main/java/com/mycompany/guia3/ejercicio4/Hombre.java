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
//Modificar al método jugar con robot para que reciba po r teclado los pasos que desea que avance o
//retroceda el robot las veces que quiera y finalice sólo cuando ponga a dormir al robot. (Puede
//utilizar la clase Scanner para leer desde el teclado).
package com.mycompany.guia3.ejercicio4;
import java.util.Scanner;


public class Hombre {
    

    public void JugarConRobot(Robot robot) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Ingrese la acción (1-Avanzar, 2-Retroceder, 3-Bateria Actual , 4-Cargar , 5-Despertar , 6-Dormir ):");
            int accion = scanner.nextInt();
            
            switch (accion) {
                case 1:
                    System.out.println("Ingrese la cantidad de pasos:");
                    int pasosAvanzar = scanner.nextInt();
                    robot.Avanzar(pasosAvanzar);
                    break;
                    
                case 2:
                    System.out.println("Ingrese la cantidad de pasos:");
                    int pasosRetroceder = scanner.nextInt();
                    robot.retroceder(pasosRetroceder);
                    break;
                    
                case 3:
                    System.out.println("La beteria actual es: "+ robot.BateriaActual() );
                    
                    break;
                    
                case 4:
                    System.out.println("Batería restante: " + robot.BateriaActual());
                    break;
                    
                case 5:
                    
                    robot.Despierto();
                    break;
                    
                    
                case 6:
                    
                    robot.Dormir();
                    break;
                    
                default:
                    System.out.println("Acción inválida.");
                    break;
            }
        }
    }
}


    
    

