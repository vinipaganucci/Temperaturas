import java.util.ArrayList;
import java.util.Collections;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<TemperaturaMeses> temperaturasMeses = new ArrayList<>();		
		
		TemperaturaMeses mes1 = new TemperaturaMeses("Janeiro", 14);
		TemperaturaMeses mes2 = new TemperaturaMeses("Fevereiro", 18);
		TemperaturaMeses mes3 = new TemperaturaMeses("Março", 20);
		TemperaturaMeses mes4 = new TemperaturaMeses("Abril", 18);
		TemperaturaMeses mes5 = new TemperaturaMeses("Maio", 31);
		TemperaturaMeses mes6 = new TemperaturaMeses("Junho", 27);
		
		temperaturasMeses.add(mes1);
		temperaturasMeses.add(mes2);
		temperaturasMeses.add(mes3);
		temperaturasMeses.add(mes4);
		temperaturasMeses.add(mes5);
		temperaturasMeses.add(mes6);
		
		
			Collections.sort(temperaturasMeses);
			
		System.out.println("Meses mais quentes: ");
		System.out.println(temperaturasMeses.get(0));
		System.out.println(temperaturasMeses.get(1));
	}
}
