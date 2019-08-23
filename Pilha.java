public interface Pilha<Objeto>{
	public int size();
	public boolean isEmpty();
	public Objeto top() throws EPilhaVazia;
	public void push(Objeto o);
	public Objeto pop() throws EPilhaVazia;
}
