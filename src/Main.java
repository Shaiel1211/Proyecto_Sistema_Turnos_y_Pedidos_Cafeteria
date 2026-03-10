import ColaCircular.ColaCircular;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Sistema de caferteria Universitaria");
        System.out.println("Proyecto P2 de Estructura de Datos");
        ColaCircular cafeteria = new ColaCircular(5);

        cafeteria.enqueue(1);
        cafeteria.enqueue(2);
        cafeteria.enqueue(3);

        cafeteria.mostrar();

        System.out.println("Primer pedido: " + cafeteria.peek());

        cafeteria.dequeue();

        cafeteria.mostrar();

        pila pedidos = new pila(5);

        pedidos.push("Cafe Americano");
        pedidos.push("Capuccino");
        pedidos.push("Latte");

        pedidos.mostrar();

        pedidos.pop();

        pedidos.peek();
    }
}
