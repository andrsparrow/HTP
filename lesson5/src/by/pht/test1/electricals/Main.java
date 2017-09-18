
package by.pht.test1.electricals;

public class Main {
	public static void main(String[] args) {
		Device dev1=new Device("iron", 300, false);
		Device dev2=new Device("Razor", 250);
		Device dev3=new Device("Hoover", 1000);
		Device dev4=new Device("PC", 500, true);
		Device dev5=new Device("TV", 450);
		Device dev6=new Device( 666, true);
		
		Network net= new Network(dev1,dev2,dev3,dev4,dev5,dev6);

		
		net.getSortedListDeviceByPower();
		
		net.showDivicesBetween(500, 900);
		
		dev5.plugIn();
		net.getSortedListDeviceByPower();
		
		
	}

}
