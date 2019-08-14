public interface Pilha<E>{
  public int size();
  public boolean isEmpty();
  public E top() throws EPilhaVazia;
  public void push(E ob);
  public E pop() throws EPilhaVazia;
}
