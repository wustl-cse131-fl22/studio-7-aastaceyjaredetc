package studio7;

public class Die {

	private int n = 0;
	
	public Die (int initN) {
		n = initN;
	}
	
	public int throwDie() {
		return (int)(Math.random() * n)+1;
	}
	
	public static void main(String[] args)
    {
		Die d1 = new Die(6);
		System.out.print(d1.throwDie());
    }
}
