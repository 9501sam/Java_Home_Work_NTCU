public class B extends A{
    
    public B(){
        super();
    }

    public B(int k){
        super(k);
    }

    public B(B other){
        super(other);
    }
	
    public B(A other){
        super(other);
    }

}
