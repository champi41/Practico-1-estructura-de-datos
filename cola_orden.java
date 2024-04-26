class cola_orden{
  
  private Nodo primero;
  private Nodo ultimo;
  private String nombre;

  public cola_orden(String nombre){
    
    this.nombre = nombre;
    
  }
  
  public boolean esvacio(){
    
    return this.primero==null;
    
  }
  
  public void ingresar(Object pedido){
    
    Nodo nuevo = new Nodo(pedido);
    
    if(esvacio()){
      this.primero=nuevo;
      this.ultimo=nuevo;
    }else{
      this.ultimo.enlazar(nuevo);
      this.ultimo=nuevo;
    }
    
  }
  public void eliminar_cola(){
    
    if(esvacio()){
      System.out.println("La cola esta vacia");
    }else{
      this.primero=this.primero.siguiente();
    }
    
  }
  public void pendiente(){
    
    if(esvacio()){
      System.out.println("La cola esta vacia");
    }else{
      Nodo aux = this.primero;
      while(aux!=null){
        System.out.println(aux.elemento());
        aux=aux.siguiente();
      }
    }
    
  }
}
