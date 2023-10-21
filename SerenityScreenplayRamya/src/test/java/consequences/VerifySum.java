package consequences;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Performable;
import questions.MessageText;
import questions.SumOfTwoNumbers;

public class VerifySum implements Consequence<String> {
	private final String sum;

	public VerifySum(String sum) {
		this.sum = sum;
	}

	@Override
	public void evaluateFor(Actor actor) {
		String displayedMessage = SumOfTwoNumbers.displayed().answeredBy(actor);

		if (!displayedMessage.equals(sum)) {
			throw new AssertionError("The displayed message does not match the expected message.");
		}
	}

	@Override
	public Consequence orComplainWith(Class complaintType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consequence orComplainWith(Class complaintType, String complaintDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consequence whenAttemptingTo(Performable performable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Consequence because(String explanation) {
		// TODO Auto-generated method stub
		return null;
	}

}
