package songTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import song.Song;

public class TestSong {
	Song djadja;
    public TestSong() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp() {
    	djadja = new Song("djadja", 1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetName() {
    	assertEquals("djadja", djadja.getName());
    }
    
    @Test
    public void testGetScore() {
    	assertEquals(1, djadja.getScore());
    }
    
    @Test
    public void testSetScore() {
    	djadja.setScore(0);
    	assertEquals(0, djadja.getScore());
    }
    
    @Test
    public void testReevaluation() {
        assertEquals(0, djadja.reevaluation(-1));
    }
}
