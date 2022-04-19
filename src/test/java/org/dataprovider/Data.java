package org.dataprovider;

import org.testng.annotations.DataProvider;

public class Data 
{
@DataProvider(name="login")
private Object[][] login()
{
 Object[][] obj=new Object[][] {
	 {"prabhu@gmail.com","1234"},
	 {"suresh@gmail.com","1087"},
	 {"anand@gmail.com","87657"}
 };
return obj;

}

}
