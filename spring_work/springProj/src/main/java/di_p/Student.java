package di_p;

import java.util.Arrays;

public class Student {
	
	String name;
	String [] subj;
	int [] jum;
	int tot;
	double avg;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getSubj() {
		return subj;
	}
	public void setSubj(String[] subj) {
		this.subj = subj;
	}
	public int[] getJum() {
		return jum;
	}
	public void setJum(int[] jum) {
		this.jum = jum;
	}
	public int getTot() {
		return tot;
	}
	public void calc() {
		
		for(int i=0; i<jum.length; i++) {
			tot += jum[i];	
			
		}avg();	
	}
	
	public double getAvg() {
		return avg;
	}
	public void avg() {
		
		this.avg = tot/subj.length;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subj=" + Arrays.toString(subj) + ", jum=" + Arrays.toString(jum) + ", tot="
				+ tot + ", avg=" + avg + "]";
	}
	
	

}
