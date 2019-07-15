/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* Copyright (c) 2019 , Inc. All Rights Reserved.* * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
*/
package com;

/**
 *This class is used for 
 * @author Vakeel.Ahamad
 *
 */
public class HelloTest extends DtoTest<HelloDto> {
	@Override
	protected HelloDto getInstance() {
		return new HelloDto();
	}

}
