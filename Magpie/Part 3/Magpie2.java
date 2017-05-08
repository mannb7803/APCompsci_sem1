public class Magpie2
{
	/** Get a default greeting @return a greeting*/
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	public String getResponse(String statement)
	{
		String response = "";

		if (statement.length() <= 0)
		{
			response = "Say something, please.";
		}
		 else if(findKeyword(statement, "no", 0) >= 0)
		 {
			 response = "Why so negative?";
		 }


		else if (findKeyword(statement, "mother", 0) >= 0 || findKeyword(statement, "father", 0) >= 0 || findKeyword(statement, "sister", 0) >= 0 || findKeyword(statement, "brother", 0) >= 0)
		{
			response = "Tell me more about your family.";
		}

		 else if(findKeyword(statement, "cat", 0) >= 0	|| findKeyword(statement, "dog", 0) >= 0 || findKeyword(statement, "fish", 0) >= 0 || findKeyword(statement, "turtle", 0) >= 0)
		 {
			response = "Tell me more about your pet"; 
		 }
		 else if(findKeyword(statement, "robinette", 0) >= 0)
		 {
			 response = "He sounds like a pretty dank teacher";
		 }

		// Responses which require transformations
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
			response = transformIWantToStatement(statement);
		}

		else
		{
			// Look for a two word (you <something> me)
			// pattern
			int psn = findKeyword(statement, "you", 0);


			if (psn >= 0
					&& findKeyword(statement, "me", psn) >= 0)
			{
				response = transformYouMeStatement(statement);
			}
			else if (0 <= findKeyword(statement, "i") && findKeyword(statement, "i") < psn)
			{
				response = transformIYouStatement(statement);
			}

				else
				{
					response = getRandomResponse();
				}
		}
		return response;
	}


	/**
	 * Take a statement with "I want to <something>." and transform it into
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
	private String transformIWantToStatement(String statement)
	{
		statement.trim();
		String lastChar = statement.substring(statement.length()-1);
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length()-1);
		}
		int psn = findKeyword(statement, "I want to", 0);

		String ros = statement.substring(psn+10, statement.length());

		return "What would it mean to " + ros + "?";
	}


	/**
	 * Take a statement with "you <something> me" and transform it into
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim().toLowerCase();
		String lastchar = statement.substring(statement.length()-1);
		if(lastchar.equals("."))
		{
			statement = statement.substring(0, statement.length()-1);
		}
		int psnoy = findKeyword(statement, "you", 0);
		int psnom = findKeyword(statement, "me", 0);
		String ros = statement.substring(psnoy+3, psnom);
		return "What makes you think that I" + ros + "you?";
	}
	private String transformIYouStatement(String statement)
	{
		statement = statement.trim().toLowerCase();
		String lastChar = statement.substring(statement.length()-1);
		if(lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length()-1);
		}
		int psnoy = findKeyword(statement, "you", 0);
		int psnoi = findKeyword(statement, "i", 0);
		String ros = statement.substring(psnoi+1, psnoy).trim();
		return "Why do you " + ros + " me";
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.toLowerCase().trim();
		String goallocal = goal.toLowerCase();
		int psn =  0;
		psn = statement.indexOf(goallocal, startPos);
		//System.out.println(psn); test
		while(psn >= 0)
		{
			String before = " ", after = " ";
			if(psn > 0)
			{
				before = phrase.substring(psn-1, psn);
			}
			if(goal.length()+psn < phrase.length())
			{
				after = phrase.substring(psn+goal.length(), psn+goal.length()+1);
			}	
			if(((before.compareTo("a") < 0) || (before.compareTo("z") >0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn+1);
		}

		return -1;

	}

	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
