import java.lang.ArrayIndexOutOfBoundsException;

public class PilhaArray<E> implements Pilha<E>{
  private E S[];
  private int t = -1;
  private int tamanho;  //Tamanho alocado
  private int capacidade; //Quantidade de elementos alocados

  //Estratégia de incremento: duplicação

  public PilhaArray(int tam){
    this.tamanho = tam;
    S = (E[])new Object[this.tamanho];
  }

  public PilhaArray(){
    this.capacidade = 0;
    this.tamanho = 5;
    S = (E[]) new Object[this.tamanho];
  }

  public int size(){
    return this.capacidade;
  }

  public void push(E ob){
      try{
        capacidade++;
        t++;
        if(this.capacidade == this.tamanho){
          E substituto[] = (E[]) new Object[this.tamanho];

          for(int i = 0; i < this.tamanho; i++){
             substituto[i] = S[i];
          }
          System.out.print("Chegou!");

          this.tamanho = this.tamanho*2;

          S = (E[]) new Object[this.tamanho];

          for(int i = 0; i < this.tamanho; i++){
            S[i] = substituto[i];
          }
        }
      } catch(ArrayIndexOutOfBoundsException err){
        System.out.println("Um erro ocorreu");
      }

      S[t] = ob;
  }

  public boolean isEmpty(){
    boolean check = false;

    if(capacidade == 0){
      check = true;
    }

    return check;
  }

  public E top() throws EPilhaVazia{
    if(isEmpty()){
      throw new EPilhaVazia("Erro: A pilha esta vazia! Function: top()");
    }

    return S[t];
  }

  public E pop() throws EPilhaVazia{
    if(isEmpty()){
      throw new EPilhaVazia("Erro: A pilha esta vazia! Function: pop()");
    }

    E substituto[] = (E[]) new Object[t];
    E retorno = S[t];
    for(int i = 0; i < this.t; i++){
      substituto[i] = S[i];
    }

    S = (E[]) new Object[tamanho];

    for(int i = 0; i < this.t; i++){
      S[i] = substituto[i];
    }

    this.tamanho--;
    this.t--;
    this.capacidade--;

    return retorno;
  }

  public void mostrarTudo(){
    for(int i = 0; i < size(); i++){
      System.out.print(" "+S[i]);
    }
  }

  public float carga(){   //Carga: Porcentagem entre a capacidade e o tamanho
    return (this.capacidade/this.tamanho);
  }


}
