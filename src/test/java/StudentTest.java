import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * The Student class
 * @author Patrick O'Connor
 */

public class StudentTest
{
    private Student student;

    @Before
    public void setup()
    {
        this.student = new Student("Patrick O'Connor", 21, null, "18387266", null, null);
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        String expResult = "Patrick O'Connor";
        assertEquals(expResult, this.student.getName());
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        String name = "Test Name";
        this.student.setName(name);
        assertEquals(name, this.student.getName());
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        String expResult = "18387266";
        assertEquals(expResult, this.student.getId());
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        String expResult = "Patrick O'Connor21";
        assertEquals(expResult, this.student.getUsername());
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourseId() {
        String expResult = null;
        assertEquals(expResult, this.student.getCourse());
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        List<String> expResult = null;
        assertEquals(expResult, this.student.getModules());
    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        LocalDate expResult = null;
        assertEquals(expResult, this.student.getDob());
    }
}
