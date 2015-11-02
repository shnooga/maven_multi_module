package com.oogie.app;

import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static com.oogie.lib.Name.MARY;

public class MaryTest extends TestCase {
	
	public MaryTest(String testName) {
		super(testName);
	}
	
	public void testGetName() {
		Mary instance = new Mary();
		assertThat(instance.getName(), is(MARY));
	}
	
}
