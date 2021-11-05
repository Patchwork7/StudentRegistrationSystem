import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * The Student class
 * @author Patrick O'Connor
 */

public class ModuleTest
{
    private Module module;

    @Before
    public void setup()
    {
        this.module = new Module("Software Engineering", "CT417", null, null);
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        String expResult = "Software Engineering";
        assertEquals(expResult, this.module.getName());
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        String expResult = "CT417";
        assertEquals(expResult, this.module.getId());
    }

    /**
     * Test of getModules method, of class Student.
     *
    @Test
    public void testGetModules() {
        List<String> expResult = null;
        assertEquals(expResult, this.student.getModules());
    }*/
}
