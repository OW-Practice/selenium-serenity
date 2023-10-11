package smoke_suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import testcases.DemoBlaze_Registration;
import testcases.PurchaseOrder;

@RunWith(Suite.class)
@Suite.SuiteClasses({DemoBlaze_Registration.class , PurchaseOrder.class})

public class SmokeTestSuite {
	
	

}
