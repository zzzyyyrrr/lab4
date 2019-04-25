import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class tesBackPack {
    private BackPack c;

    @Before
    public void setUp() throws Exception {
        // setUp()用于测试前的初始化
        c = new BackPack();
    }
    @Test
    public void test2() {
    	int m = 9;
        int n = 4;
    	int w[] = {2, 4, 5, 6};
        int p[] = {7, 8, 9,11};
        int a[][] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        		{0, 0, 7, 7, 7, 7, 7, 7, 7, 7},
        		{0, 0, 7, 7, 8, 8, 15, 15, 15, 15},
        		{0, 0, 7, 7, 8, 9, 15, 16, 16, 17},
        		{0, 0, 7, 7, 8, 9, 15, 16, 18, 18}};
        Assert.assertArrayEquals(a,c.BackPack_Solution(m, n, w, p));      
    }
    @After
    public void tearDown() throws Exception {
        // tearDown()用于测试后的善后
        c = null;
    }
}