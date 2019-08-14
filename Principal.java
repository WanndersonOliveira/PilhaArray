import java.util.Scanner;

public class Principal{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    PilhaArray<String> pilha = new PilhaArray<String>();

    String nome[] = {"Pedro", "Paulo", "Pablo", "Afonso", "João", "Carlos", "Pietro", "Melquíades"};

    for(int i = 0; i < nome.length; i++){
      pilha.push(nome[i]);
      System.out.println("Carga: "+pilha.carga());
    }

    System.out.println("Tamanho: "+pilha.size());

    pilha.mostrarTudo();

  }
}
