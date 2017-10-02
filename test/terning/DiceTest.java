package terning;

import terning.Dice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class DiceTest {
	private Dice d1;
	
	
    @Before
    public void setUp() throws Exception {
    		this.d1 = new Dice();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void roll() throws Exception {
    		int result = this.d1.roll();
    		
    		assertTrue("Terningen er mindre end 1", result >= 1);
    		assertTrue("Terningen er større end 6", result <= 6);
    }

    @Test
    public void rollMultiple() throws Exception {
    		int one = 0;
    		int two = 0;
    		int three = 0;
    		int four = 0;
    		int five = 0;
    		int six = 0;
    		
    		for (int i = 0; i < 60000; i++) {
    			int result = this.d1.roll();
        		
    			switch(result) {
    				case 1:
    					one++;
    					break;
					
    				case 2:
    					two++;
    					break;
					
    				case 3:
    					three++;
    					break;
    					
    				case 4:
    					four++;
    					break;
    					
    				case 5:
    					five++;
    					break;
    					
    				case 6:
    					six++;
    					break;
    			}
    		}
    		
    		assertTrue("Der er for få 1'er " + one, one > 9600);
    		assertTrue("Der er for mange 1'er " + one, one < 10400);
    		
    		assertTrue("Der er for få 2'er " + two, two > 9600);
    		assertTrue("Der er for mange 2'er " + two, two < 10400);
    		
    		assertTrue("Der er for få 3'er " + three, three > 9600);
    		assertTrue("Der er for mange 3'er " + three, three < 10400);
    		
    		assertTrue("Der er for få 4'er " + four, four > 9600);
    		assertTrue("Der er for mange 4'er " + four, four < 10400);
    		
    		assertTrue("Der er for få 5'er " + five, five > 9600);
    		assertTrue("Der er for mange 5'er " + five, five < 10400);
    		
    		assertTrue("Der er for få 6'er " + six, six > 9600);
    		assertTrue("Der er for mange 6'er " + six, six < 10400);
    }

}