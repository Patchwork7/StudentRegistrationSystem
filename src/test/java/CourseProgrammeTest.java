import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * The Student class
 * @author Patrick O'Connor
 */

public class CourseProgrammeTest
{
    private CourseProgramme courseProgramme;

    @Before
    public void setup()
    {
        this.courseProgramme = new CourseProgramme("Electronic & Computer Engineering", "4BP", null, null);
    }

    /**
     * Test of getName method, of class CourseProgramme.
     */
    @Test
    public void testGetName() {
        String expResult = "Electronic & Computer Engineering";
        assertEquals(expResult, this.courseProgramme.getName());
    }

    /**
     * Test of getId method, of class CourseProgramme.
     */
    @Test
    public void testGetId() {
        String expResult = "4BP";
        assertEquals(expResult, this.courseProgramme.getId());
    }

    /**
     * Test of getStudents method, of class CourseProgramme.
     */
    @Test
    public void testGetStudents() {
        List<Student> expResult = null;
        assertEquals(expResult, this.courseProgramme.getStudents());
    }

    /**
     * Test of getModules method, of class CourseProgramme.
     */
    @Test
    public void testGetModules() {
        List<String> expResult = null;
        assertEquals(expResult, this.courseProgramme.getModules());
    }

    /**
     * Test of getStartDate method, of class CourseProgramme.
     */
    @Test
    public void testGetStartDate() {
        LocalDate expResult = null;
        assertEquals(expResult, this.courseProgramme.getStartDate());
    }

    /**
     * Test of getEndDate method, of class CourseProgramme.
     */
    @Test
    public void testGetEndDate() {
        LocalDate expResult = null;
        assertEquals(expResult, this.courseProgramme.getEndDate());
    }
}
