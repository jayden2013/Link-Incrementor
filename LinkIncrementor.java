
/**
 * 
 * @author Jayden Weaver
 *
 */

public class LinkIncrementor {
	public static void main(String[] args){
		if (args.length == 0){
			System.err.println(usage());
			System.exit(1);
		}
		String URL = args[0];
		int increment = Integer.parseInt(args[1]), amount = Integer.parseInt(args[2]);
		int i = 0, numeral = 0;
		String newURL = "", modURL = "", officialURL = "";
		modURL += URL.charAt(URL.length() - 3);
		modURL += URL.charAt(URL.length() - 2);
		modURL += URL.charAt(URL.length() - 1);
		numeral = Integer.parseInt(modURL);
		while (i < URL.length() - 3){
			newURL += URL.charAt(i);
			i++;
		}
		i = 0;
		while (i < amount){
			numeral += increment;
			officialURL = newURL;
			officialURL += numeral;
			System.out.println(officialURL);
			i++;
		}
		
	}
	
	public static String usage(){
		return "Usage: java LinkIncrementor <baseURL> <increment> <amount>";
	}

}
