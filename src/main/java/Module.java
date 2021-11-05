import java.util.List;

/**
 * The Module class
 * @author Patrick O'Connor
 */
public class Module
{
    private String name;
    private String id;
    private List<String> courses;
    private List<String> students;

    public Module(String name, String id, List<String> courses, List<String> students)
    {
        this.name = name;
        this.id = id;
        this.courses = courses;
        this.students = students;
    }

    public String getName()
    {
        return this.name;
    }

    public String getId()
    {
        return this.id;
    }

    public List<String> getStudents()
    {
        return this.students;
    }

    public List<String> getCourses()
    {
        return this.courses;
    }
}
