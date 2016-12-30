package com.theironyard;

import net.doughughes.testifier.exception.CannotFindMethodException;
import net.doughughes.testifier.matcher.RegexMatcher;
import net.doughughes.testifier.test.TestifierTest;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class ForLoopExercisesTest extends TestifierTest{

    @Test
    public void testAddRange1to10() {
        /* arrange */

        /* act */
        int sum = (int) ForLoopExercises.addRange(1, 10, 1);

        /* assert */
        assertThat("Sum of 1 to 10 should be 55",
                sum, equalTo(55));
    }

    @Test
    public void testRangeRange1to10WithStep2() {
        /* arrange */

        /* act */
        int sum = ForLoopExercises.addRange(1, 10, 2);

        /* assert */
        assertThat("Sum of 1 to 10 with step of 2 should be 25",
                sum, equalTo(25));

    }

    @Test
    public void testRepeatHello5Times(){
        /* arrange */

        /* act */
        String result = ForLoopExercises.repeatString("Hello", 5);

        /* assert */
        assertThat("Hello should be repeated 5 times",
                result, equalTo("HelloHelloHelloHelloHello"));
    }

    @Test
    public void testRepeatEmptyString5Times(){
        /* arrange */

        /* act */
        String result = ForLoopExercises.repeatString("", 5);

        /* assert */
        assertThat("Empty string repeated should be an empty string",
                result, equalTo(""));
    }

    @Test
    public void testAddRangeShouldUseForLoop(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("addRange", int.class, int.class, int.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The addRange() method should use a for loop.",
                source, RegexMatcher.matches("^.*?ForStmt.*?$"));
    }

    @Test
    public void testRepeatStringShouldUseForLoop(){
        /* arrange */

        /* act */
        String source = null;
        try {
            source = codeWatcher.getMainSourceCodeService().getDescriptionOfMethod("repeatString", String.class, int.class);
        } catch (CannotFindMethodException e) {
            fail(e.getMessage());
        }

        /* assert */
        assertThat("The repeatString() method should use a for loop.",
                source, RegexMatcher.matches("^.*?ForStmt.*?$"));
    }
}