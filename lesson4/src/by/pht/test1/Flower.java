package by.pht.test1;

public class Flower {

	private double height;
	private String title;

	private Bud bud;

	public void wither() {
		bud=null;
		System.out.println("flower is over:(");
	}

	public void bloom() {
		
		if(this.bud==null){
			this.bud = new Bud(15,new Petal("ovall","red"),3);
		}
		else{
		
			bud.setSize(bud.getSize()+66);
						
		}
		
	
		System.out.println("bloomed");

	}

	public Flower(double height, String title, Bud bud) {

		this.height = height;
		this.title = title;
		this.bud = bud;
	}
	public Flower(double height, String title) {

		this.height = height;
		this.title = title;
		
	}

	@Override
	public String toString() {
		return "height=" + height + ",\n	title=" + title + ",\n	" + bud ;
	}

	public Bud getBud() {
		return bud;
	}

	public void setBud(Bud bud) {
		this.bud = bud;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}




