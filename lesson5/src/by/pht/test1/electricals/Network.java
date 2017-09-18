package by.pht.test1.electricals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Network {
	private List<Device> devices;
	private double totalPower;

	public Network() {
		devices = new ArrayList<Device>();
		totalPower = 0;
	}

	public Network(Device... devices) {
		this.devices = new ArrayList<Device>(Arrays.asList(devices));

		totalPower = totalPower();
	}

	private double totalPower() {
		double temp = 0;
		for (int i = 0; i < devices.size(); i++) {
			temp += devices.get(i).getPower();
		}
		return temp;
	}

	public void showToatalPower() {
		System.out.println("//////////////////");
		System.out.println("Total power: " + totalPower);

	}

	public void addDevice(Device device) {
		devices.add(device);
		System.out.println("device " + device + " added to NET");
	}

	public void getSortedListDeviceByPower() {
		System.out.println("//////////////////");
		System.out.println("sorted list:");
		for (int i = 0; i < devices.size(); i++) {
			for (int j = i + 1; j < devices.size(); j++) {
				if (devices.get(i).getPower() > devices.get(j).getPower())
					Collections.swap(devices, i, j);

			}
		}
		show();
	}

	public void showDivicesBetween(double min, double max) {

		System.out.println("//////////////////");
		System.out.println("dev's power between "+max+" and "+min);
		for (int i = 0; i < devices.size(); i++) {

			if (devices.get(i).getPower() >= min && devices.get(i).getPower() <= max) {
				System.out.println(devices.get(i));
			}

		}

	}

	public void show() {

		for (int i = 0; i < devices.size(); i++) {
			System.out.println("\t" + devices.get(i));
		}

	}

}
