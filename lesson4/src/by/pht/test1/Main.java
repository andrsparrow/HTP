package by.pht.test1;

public class Main {

	public static void main(String[] args) {
		
		
		Petal petal1=new Petal("star","green");
		Petal petal2=new Petal("black");
		
		Bud bud1=new Bud(5.5,petal1,9);
		Bud bud2=new Bud(3.2,petal2,17);
		
		Flower flower1= new Flower(18,"Tulpan",bud1 );
		Flower flower2=new Flower(10,"Rosa",bud2);
		
	
		
		System.out.println("flower1 \n	"+flower1);
		System.out.println("flower2 \n	"+flower2);
		flower1.bloom();
		System.out.println("flower1 \n	"+flower1);
		
		
		
		flower1.wither();
		
		Flower flower3=new Flower(25,"");
		flower3.bloom();
		System.out.println("flower3 \n	"+flower3);
		
		
		
	}

}
