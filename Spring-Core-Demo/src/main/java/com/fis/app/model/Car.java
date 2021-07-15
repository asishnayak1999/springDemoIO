package com.fis.app.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Car implements Serializable,Comparable<Car> {

	private int carNumber;
	private String carName;
	private Engine e;
	private MusicSystem ms;
	private List<Sits> sitList;
	String path;
	File f;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int carNumber, String carName, Engine e, MusicSystem ms, List<Sits> sitList) {
		super();
		this.carNumber = carNumber;
		this.carName = carName;
		this.e = e;
		this.ms = ms;
		this.sitList = sitList;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public MusicSystem getMs() {
		return ms;
	}
	public void setMs(MusicSystem ms) {
		this.ms = ms;
	}
	public List<Sits> getSitList() {
		return sitList;
	}
	public void setSitList(List<Sits> sitList) {
		this.sitList = sitList;
	}
	@Override
	public int hashCode() {
		return Objects.hash(carName, carNumber, e, ms, sitList);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carName, other.carName) && carNumber == other.carNumber && Objects.equals(e, other.e)
				&& Objects.equals(ms, other.ms) && Objects.equals(sitList, other.sitList);
	}
	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", carName=" + carName + ", e=" + e + ", ms=" + ms + ", \n sitList="
				+ sitList + "]";
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void doInIt()
	{
		System.out.println(" do init called ");	
		//path = "‪‪C:\\demo\\cardata.txt";
		f = new File("C:\\Users\\User\\Desktop\\carDemo.txt");
	}
	
	public void doDestroy()
	{
		System.out.println(" do destroy  called ");
		
		PrintWriter wr = null;
		System.out.println("Started Printing to the File..Wait");
		try {
			System.out.println("-->>1");
			FileWriter fw = new FileWriter(f,true);
			
			wr = new PrintWriter(fw);
			//System.out.println("-->>2 "+this.getCarName()+"- "+f.getAbsolutePath());
			wr.append(this.getCarNumber() +getCarName() + getE() + getMs() + getSitList());
			//System.out.println("===>> 3");
			wr.close();
			//+getCarName() ++ getE() + getMs() + getSitList(
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(wr!=null)wr.close();
		}
		System.out.println("Printed Into the File !!");

	}
	
	

	
}//end class





















