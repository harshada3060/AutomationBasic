package retryfailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {
	static int num = 5;

	@Test(retryAnalyzer =retryfailedTc.RetryAnalyzer.class )
	public void test1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}

	@Test(retryAnalyzer =retryfailedTc.RetryAnalyzer.class )
	public void test3() {
		num--;
		Assert.assertTrue(num < 4);

	}
}
