package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class HomePageText implements Question<String> {

    private final Target targetLocator;

    private HomePageText(Target targetLocator) {
        this.targetLocator = targetLocator;
    }

    public static HomePageText header(Target targetLocator) {
        return new HomePageText(targetLocator);
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(targetLocator).viewedBy(actor).asString();
    }
}