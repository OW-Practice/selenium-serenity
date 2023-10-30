package CuraHealthScreenplayProject;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.annotations.Subject;

@Subject("the displayed username")
public class TheUserName implements Question<String>{
	
	@Override
	public String answeredBy(Actor actor) {
		return LocatorsTest.USER_NAME_FIELD.resolveFor(actor).getText();
	}

	public static Question<String> getValue() {
		return new TheUserName();
	}
	
	
}
