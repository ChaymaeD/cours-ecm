package fr.cmm.tags;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by pomme on 17/12/2015.
 */
public class FunctionTest {

    @Test
    public void text()  {
        assertEquals("a", Functions.text("a"));
        assertEquals("a<br>", Functions.text("a\n"));
        assertEquals("&amp;a", Functions.text("&a"));

    }
}
