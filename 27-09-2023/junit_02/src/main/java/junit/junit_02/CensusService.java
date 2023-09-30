package junit.junit_02;

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
		return name.isEmpty();
	}
}
