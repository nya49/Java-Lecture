package Exercise.ex03;

public class Container<T, M> {
	
	private T Key;
	private M Value;
	
	public void set(T key, M value) {
		this.Key = key;
		this.Value = value;
	}
	
	public T getKey() {
		return Key;
	}
	
	public M getValue() {
		return Value;
	}


}
