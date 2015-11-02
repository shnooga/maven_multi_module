package com.oogie.app;

import junit.framework.TestCase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static com.oogie.lib.Name.PETER;

public class PeterTest extends TestCase {

	public PeterTest(String testName) {
		super(testName);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test of getName method, of class Peter.
	 */
	public void testGetName() {
		Peter instance = new Peter();
		assertThat(instance.getName(), is(PETER));
	}

}
