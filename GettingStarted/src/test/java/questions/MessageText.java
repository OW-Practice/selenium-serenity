package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import targetlocators.SeleniumEasyPageLocators;

public class MessageText implements Question<String> {

	public static MessageText displayed() {
		return new MessageText();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SeleniumEasyPageLocators.MESSAGE)
				.viewedBy(actor)
				.asString();
	}
}
