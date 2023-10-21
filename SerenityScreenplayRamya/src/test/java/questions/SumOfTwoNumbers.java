package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import targetlocators.SeleniumEasyPageLocators;

public class SumOfTwoNumbers implements Question<String> {
	public static SumOfTwoNumbers displayed() {
		return new SumOfTwoNumbers();
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(SeleniumEasyPageLocators.SumText)
				.viewedBy(actor)
				.asString();
	}
}
