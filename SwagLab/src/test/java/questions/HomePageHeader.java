package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageHeader implements Question<String>{
	
	private final Target targetLocater;
	
	public HomePageHeader(Target targetLocater) {
		this.targetLocater = targetLocater;
		
	}
	public static HomePageHeader header(Target targetLocater) {
		return new HomePageHeader(targetLocater) ;
		
	}

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(targetLocater).viewedBy(actor).asString();
	}

}
