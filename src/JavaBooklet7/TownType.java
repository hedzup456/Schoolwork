/**
 * 
 */
package JavaBooklet7;

/**
 * @author rjh
 *
 */
public class TownType {
	public TownType(String x){
		if (x.length() > 0){
			String[] ls = x.split("\\s*,\\s*");
			name = (String)ls[0];
			county = (String)ls[1];
			population = Integer.parseInt(ls[2]);
			area = Integer.parseInt(ls[3]);
		} else {
			name = "";
			county = "";
			population = 0;
			area = 0;
		}
		
	}
	public String toString(){
		return "";
	}
	public String name, county;
	public int population, area;
}
