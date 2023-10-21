package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class MessageText implements Question<String> {
	
	private final Target targetLocator;

    public MessageText(Target targetLocator) {
        this.targetLocator = targetLocator;
    }

	public static MessageText displayed(Target targetLocator) {
		return new MessageText(targetLocator);
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(targetLocator)
				.viewedBy(actor)
				.asString();
	}
}
