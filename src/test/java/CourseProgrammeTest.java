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
     * Test of set & get StartDate methods, of class CourseProgramme.
     */
    @Test
    public void testSetStartDate() {
        LocalDate expResult = LocalDate.parse("2021-09-10");
        this.courseProgramme.setStartDate(expResult);
        assertEquals(expResult, this.courseProgramme.getStartDate());
    }

    /**
     * Test of set & get EndDate methods, of class CourseProgramme.
     */
    @Test
    public void testSetEndDate() {
        LocalDate expResult = LocalDate.parse("2022-05-01");
        this.courseProgramme.setEndDate(expResult);
        assertEquals(expResult, this.courseProgramme.getEndDate());
    }
}
