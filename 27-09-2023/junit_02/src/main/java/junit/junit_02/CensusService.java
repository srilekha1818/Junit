package in.ineuron.nitin.service;

import java.util.function.BooleanSupplier;

public class CensusService {

	public String exportData() {
		return "data exported";
	}

	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		if(num%2==0)
		return false;
		else 
			return true;
	}

	public String isString(String data) {
		
		return "hello: "+data;
	}

	public Boolean isEmpty(String name) {
		// TODO Auto-generated method stub
		return name.isEmpty();
	}
}
