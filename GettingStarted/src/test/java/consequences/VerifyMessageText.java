package consequences;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.ensure.Ensure;
import questions.MessageText;

public abstract class VerifyMessageText implements Consequence<String> {
	private final String expectedSubstring;

	public VerifyMessageText(String expectedSubstring) {
		this.expectedSubstring = expectedSubstring;
	}

	@Override
	public void evaluateFor(Actor actor) {
		String actualText = actor.asksFor(MessageText.displayed());
		Ensure.that(actualText).contains(expectedSubstring);
	}	
}
