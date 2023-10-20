package TaskScreenplayPOMTest;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PlacingOrderTask3Test implements Task {
	
	
	private final String nameinput;
	private final String countryinput;
	private final String cityinput;
	private final String creditcardinput;
	private final String monthinput;
	private final String yearinput;
	
	
	public PlacingOrderTask3Test (String nameinput,String countryinput,String cityinput,String creditcardinput,String monthinput,String yearinput)
	{
		this.nameinput=nameinput;
		this.countryinput=countryinput;
		this.cityinput=cityinput;
		this.creditcardinput=creditcardinput;
		this.monthinput=monthinput;
		this.yearinput=yearinput;
	}
	
	public static PlacingOrderTask3Test placeorder(String nameinput,String countryinput,String cityinput,String creditcardinput,String monthinput,String yearinput)
	{
		return Tasks.instrumented(PlacingOrderTask3Test.class,nameinput,countryinput,cityinput,creditcardinput,monthinput,yearinput);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		actor.attemptsTo
		(
		Click.on(LocatorsTest.CLICK_ON_CART_SECTION_ON_FOOTER),
		Click.on(LocatorsTest.CLICK_ON_PLACE_ORDER),
		Enter.theValue(nameinput).into(LocatorsTest.PLACE_ORDER_FORM_NAME_INPUT_FIELD),
		Enter.theValue(countryinput).into(LocatorsTest.PLACE_ORDER_FORM_COUNTRY_INPUT_FIELD),
		Enter.theValue(cityinput).into(LocatorsTest.PLACE_ORDER_FORM_CITY_INPUT_FIELD),
		Enter.theValue(creditcardinput).into(LocatorsTest.PLACE_ORDER_FORM_CREDICARD_INPUT_FIELD),
		Enter.theValue(monthinput).into(LocatorsTest.PLACE_ORDER_FORM_MONTH_INPUT_FIELD),
		Enter.theValue(yearinput).into(LocatorsTest.PLACE_ORDER_FORM_YEAR_FIELD),
		Click.on(LocatorsTest.PLACE_ORDER_FORM_CLICK_ON_PURCHASE_BUTTON)
//		Click.on(LocatorsTest.CLICK_ON_LOGOUT)
		);
		System.out.println("actor logout from demoblaze application");
	}
}
