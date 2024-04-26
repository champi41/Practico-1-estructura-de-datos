class pila_orden {

  private Object[] pila;
  private int tope;
  private int tamano;
  private String nombre;


  public pila_orden (int tamano, String nombre){
    
    this.tamano = tamano;
    this.nombre = nombre;
    this.tope = -1;
    this.pila = new Object[tamano];
  }


  public boolean esVacia(){
    return tope == -1;
  }


  public Object ultimo_procesado(){
    return pila[tope];
  }

  public void agregar_pedido(Object x){
    tope++;
    pila[tope] = x;
  }


  public Object procesar_pedido(){
    if (!esVacia()){
        return this.pila[this.tope--];
    }else{
      System.out.println("La pila esta vacia");
      return null;
    }
  }

  public void mostrar(){
    if (!esVacia()){
      System.out.println("Los elementos de la pila");
      for (int i =tope; i>=0;i--){
        System.out.println(pila[i]);
      }
    }else{
      System.out.println("La pila esta vacia");
    }
  } 
}
