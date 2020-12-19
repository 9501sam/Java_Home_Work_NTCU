public class A{

    private int key;

    public A(){
		key = 0;
    }

    public A(int k){
        key = k;
    }

    public A(A other){
        this.key = other.key;
    }

	public void setKey(int k){
		key = k;
	}

	public int getKey(){
		return key;
	}

	public void print(){
		System.out.println("this is A, key = " + key);
	}

}
