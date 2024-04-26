//Benjamin Tabilo ICINF

import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int respuesta = 0;
    cola_orden c_o = new cola_orden("cola orden");
    pila_orden p_o = new pila_orden(10, "pila orden");
    
    while(respuesta != 9){
      
      System.out.println("que desea hacer?");
      System.out.println("1. agregar pedido");
      System.out.println("2. procesar pedido");
      System.out.println("3. mostrar el proximo pedido pentiente");
      System.out.println("4. verificar si la cola esta vacia");
  
      System.out.println("5 . agregar un pedido procesado");
      System.out.println("6 . obtener el ultimo pedido procesado");
      System.out.println("7 . ver el ultimo pedido procesado");
      System.out.println("8 . verificar si la pila esta vacia");
      System.out.println("9 . Salir");
  
      respuesta = sc.nextInt();
  
      if (respuesta == 1){
  
        System.out.println("ingrese el pedido");
        String pedido_cola = sc.next();
        c_o.ingresar(pedido_cola);
        
      }else if(respuesta == 2){
  
        c_o.eliminar_cola();
        
      }else if(respuesta == 3){
  
        c_o.pendiente();
        
      }else if(respuesta == 4){
  
        c_o.esvacio();
        
      }else if(respuesta == 5){
  
        System.out.println("ingrese el pedido");
        String pedido_pila = sc.next();
        p_o.agregar_pedido(pedido_pila);
        
      }else if(respuesta == 6){
  
        
        p_o.procesar_pedido();
        
      }else if(respuesta == 7){
  
        p_o.ultimo_procesado();
        
      }else if(respuesta == 8){
  
        p_o.esVacia();
        
      }else if(respuesta == 9){
        System.out.println("usted ha salido");
        
      }
    }
  }

}
