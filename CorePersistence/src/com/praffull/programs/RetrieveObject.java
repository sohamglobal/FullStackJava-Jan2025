package com.praffull.programs;
import java.io.*;

import com.sharayu.classes.Employee;

public class RetrieveObject {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objin=new ObjectInputStream(new FileInputStream("worker1"));
		
		Employee obj=(Employee) objin.readObject();
		obj.showEmpData();
		objin.close();
	}

}
