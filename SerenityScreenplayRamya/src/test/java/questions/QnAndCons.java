package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class QnAndCons implements Question<String> {
	private String text;
	private String correctAnswer;
	private String incorrectConsequence;
	private final Target targetLocator;

	public QnAndCons(Target targetLocator, String text, String correctAnswer, String incorrectConsequence) {
		this.text = text;
		this.correctAnswer = correctAnswer;
		this.incorrectConsequence = incorrectConsequence;
		this.targetLocator = targetLocator;
	}

	public String getText() {
		return text;
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(targetLocator).viewedBy(actor).asString();
	}

	public String checkAnswer(String userAnswer) {
		if (userAnswer.equalsIgnoreCase(correctAnswer)) {
			return "Correct!";
		} else {
			return incorrectConsequence;
		}
	}

}
