
public class TemperaturaMeses implements Comparable<TemperaturaMeses>{

	private String mes;
	private double temp;
	
	
	
	public TemperaturaMeses(String mes, double temp) {
		super();
		this.mes = mes;
		this.temp = temp;
	}
	
	public String getMes() {
		return mes;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public double getTemp() {
		return temp;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public String toString() {
		return this.mes + " " + this.temp;
	}

	@Override
	public int compareTo(TemperaturaMeses outraTemp) {
		
		if (this.temp > outraTemp.getTemp()) { 
			  return -1; 
			  
			  } if (this.temp < outraTemp.getTemp()) { 
			  return 1; 
			  
			  } 
			  return 0; 
	}
	
	
}
