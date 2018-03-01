/**
 * Football Player example
 * https://techfornontechies.com/programming-non-techies-interface-types/
 */


/**
 * @author techfornontechies.com
 *
 */
public class Quarterback implements FootballPlayer{
	private String number;
	private String name;
	private int passes = 0;
	private int sacks = 0;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void doJob(FootballPlayer player) {
		throwPass(player);
	}
	public boolean throwPass(FootballPlayer receiver) {
		//add code to decide if it's a catch
		return false;
	}
	public void addSack() {
		sacks++;
	}
	@Override
	public String toString() {
		return "FootballPlayer [number=" + number + ", name=" + name + ", passes=" + passes + ", sacks=" + sacks + "]";
	}
}
