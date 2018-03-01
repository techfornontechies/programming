/**
 * Football Player example
 * https://techfornontechies.com/programming-non-techies-interface-types/
 */

/**
 * @author techfornontechies.com
 *
 */
public class Linebacker implements FootballPlayer{
	private String number;
	private String name;
	private int tackles = 0;
	
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
		tackle(player);
	}
	public boolean tackle(FootballPlayer player) {
		//add tackle code
		tackles++;
		if(player instanceof Quarterback) {
			((Quarterback)player).addSack();
		}
		return true;
	}
	@Override
	public String toString() {
		return "FootballPlayer [number=" + number + ", name=" + name + ", tackles=" + tackles +"]";
	}
}
