/**
 * Football Field example
 * https://techfornontechies.com/programming-for-non-techies-java-classes/
 * https://techfornontechies.com/programming-non-techies-interface-types/
 */

/**
 * @author techfornontechies.com
 *
 */
public class FootballField {
	FootballPlayer[] players;

	public FootballPlayer[] getPlayers() {
		return players;
	}

	public void setPlayers(FootballPlayer[] players) {
		this.players = players;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("FootballField has " + players.length + " players.");
		for(int i=0; i<players.length; i++)
		{
			sb.append("   ");
			sb.append(players[i]);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		FootballField field = new FootballField();
		
		FootballPlayer[] players = new FootballPlayer[3];
		
		FootballPlayer player = new Linebacker();
		player.setName("Mercilus");
		player.setNumber("59");
		players[0] = player;
		
		player = new Linebacker();
		player.setName("McKinney");
		player.setNumber("55");
		players[1] = player;
		
		player = new Quarterback();
		player.setName("Luck");
		player.setNumber("12");
		players[2] = player;
		
		player = null;
		players[0].doJob(players[2]);
		((Linebacker)players[1]).tackle(players[2]);
		
		field.setPlayers(players);
		
		System.out.println(field);
	}
}
