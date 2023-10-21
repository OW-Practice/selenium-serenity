package consequences;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import questions.MessageText;
import questions.SumOfTwoNumbers;

public class VerifyMessageText implements Consequence<String> {
	private final String expectedSubstring;
	private final Target targetLocator;

	public VerifyMessageText(Target targetLocator, String expectedSubstring) {
		this.expectedSubstring = expectedSubstring;
		this.targetLocator = targetLocator;
	}

//	@Override
//	public void evaluateFor(Actor actor) {
//		String actualText = actor.asksFor(MessageText.displayed());
//		Ensure.that(actualText).contains(expectedSubstring);
//	}	

	@Override
	public void evaluateFor(Actor actor) {
		String displayedMessage = MessageText.displayed(targetLocator).answeredBy(actor);

		if (!displayedMessage.equals(expectedSubstring)) {
			throw new AssertionError("The displayed message does not match the expected message.");
		}
	}

	public static VerifyMessageText containingTextIn(Target targetLocator, String expectedSubstring) {
		return new VerifyMessageText(targetLocator, expectedSubstring);
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
