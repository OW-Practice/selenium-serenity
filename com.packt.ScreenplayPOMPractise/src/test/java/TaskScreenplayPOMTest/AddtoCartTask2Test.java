package TaskScreenplayPOMTest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddtoCartTask2Test implements Task
{
	public static AddtoCartTask2Test forProduct()
	{
		return Tasks.instrumented(AddtoCartTask2Test.class);
	}

	
	@Override
	public <T extends Actor> void performAs(T actor)
	{
		actor.attemptsTo
		(
				Click.on(LocatorsTest.CLICK_HOME_SECTION_ON_FOOTER),
				Click.on(LocatorsTest.CLICK_ON_LAPTOPS_SECTION),
				Click.on(LocatorsTest.CLICK_ON_SELECTED_LAPTOP_NAME),
				Click.on(LocatorsTest.CLICK_ADD_TO_CART_ON_SELECTED_LAPTOP)
//				Click.on(LocatorsTest.CLICK_ON_LOGOUT)
		);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
