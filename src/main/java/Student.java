import java.time.LocalDate;
import java.util.List;

/**
 * The Student class
 * @author Patrick O'Connor
 */

public class Student
{
    private String name;
    private int age;
    private String courseId;
    private List<Module> modules;
    private final LocalDate dob;
    private final String id;

    public Student(String name, int age, LocalDate dob, String id, String courseId, List<Module> modules)
    {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.courseId = courseId;
        this.modules = modules;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public String getId()
    {
        return this.id;
    }

    public String getUsername()
    {
        return this.name + this.age;
    }

    public String getCourse()
    {
        return this.courseId;
    }

    public void addModule(Module module)
    {
        this.modules.add(module);
    }

    public List<Module> getModules()
    {
        return this.modules;
    }

    public LocalDate getDob()
    {
        return this.dob;
    }
}
