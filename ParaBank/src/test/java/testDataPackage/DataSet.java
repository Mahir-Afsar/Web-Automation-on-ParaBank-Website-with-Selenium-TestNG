package testDataPackage;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	@DataProvider(name = "registrationData")
	public static Object dataset() {
		Object[][] obj = 
			{
					{					
						"Mahir","Afsar","Mirpur","Dhaka","Mirpur-2","1216","01202309325","123456789", "MahirAfsar113", "afsar@123", "afsar@123"
					},
					{					
						"Afsar","mahir","Mirpur","Dhaka","Mirpur-2","1216","01102309325","123456789", "MahirAfsar114", "afsar@123", "afsar@123"
					}				
			};
			return obj;
	}
	
	@DataProvider(name = "userInfo")
	public static Object loginset() {
		Object[][] obj = 
		{
				{
					"MahirAfsar113","afsar@123", "0", "1", "50", "01010101010101"
				},
				{
					"MahirAfsar114","afsar@123", "0", "1", "50", "0101010101010"
				}
		};
		return obj;
	}

}
