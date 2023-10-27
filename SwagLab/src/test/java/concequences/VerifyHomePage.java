package concequences;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import questions.HomePageHeader;

public class VerifyHomePage implements Consequence<String>{
	
	private final Target targetLocater;
	private final String expectedHeader;
	
	public VerifyHomePage (Target targetLocater,String expectedHeader) {
		this.targetLocater = targetLocater;
		this.expectedHeader = expectedHeader;
		
	}
	

	@Override
	public void evaluateFor(Actor actor) {
		String displayedHeader=HomePageHeader.header(targetLocater).answeredBy(actor);
		if (!displayedHeader.equals(expectedHeader)) {
			throw new AssertionError("The displayed header not matched with actual header.");
		}
	}
		public static VerifyHomePage homepage(Target targetLocater,String expectedHeader) {
			return new VerifyHomePage(targetLocater, expectedHeader);
	}

	@Override
	public Consequence<String> orComplainWith(Class<? extends Error> complaintType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consequence<String> orComplainWith(Class<? extends Error> complaintType, String complaintDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consequence<String> whenAttemptingTo(Performable performable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consequence<String> because(String explanation) {
		// TODO Auto-generated method stub
		return null;
	}

}
