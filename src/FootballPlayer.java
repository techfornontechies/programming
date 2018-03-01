/**
 * Football Player example
 * https://techfornontechies.com/programming-for-non-techies-java-classes/
 * https://techfornontechies.com/programming-non-techies-interface-types/
 */

/**
 * @author techfornontechies.com
 *
 */
public interface FootballPlayer {
	public String getNumber();
	public void setNumber(String number);
	public String getName();
	public void setName(String name);
	public void doJob(FootballPlayer player);
}
