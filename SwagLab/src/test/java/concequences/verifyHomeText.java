package concequences;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import questions.HomePageHeader;

public class verifyHomeText implements Consequence<String> {

    private final Target targetLocator;
    private final String expectedHeader;

    public verifyHomeText(Target targetLocator, String expectedHeader) {
        this.targetLocator = targetLocator;
        this.expectedHeader = expectedHeader;
    }

    @Override
    public void evaluateFor(Actor actor) {
        String displayedHeader = HomePageHeader.header(targetLocator).answeredBy(actor);

    }

    public static verifyHomeText homepage(Target targetLocator, String expectedHeader) {
        return new verifyHomeText(targetLocator, expectedHeader);
    }

    @Override
    public Consequence<String> orComplainWith(Class<? extends Error> complaintType) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Consequence<String> orComplainWith(Class<? extends Error> complaintType, String complaintDetails) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Consequence<String> whenAttemptingTo(Performable performable) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Consequence<String> because(String explanation) {
        throw new UnsupportedOperationException("Not implemented");
    }
}