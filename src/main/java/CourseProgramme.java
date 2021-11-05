import java.time.LocalDate;
import java.util.List;

/**
 * The Course Programme class
 * @author Patrick O'Connor
 */
public class CourseProgramme
{
    private String name;
    private String id;
    private List<Module> modules;
    private List<Student> students;
    private LocalDate startDate;
    private LocalDate endDate;

    public CourseProgramme(String name, String id, List<Module> modules, List<Student> students)
    {
        this.name = name;
        this.id = id;
        this.modules = modules;
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

    public List<Student> getStudents()
    {
        return this.students;
    }

    public List<Module> getModules()
    {
        return this.modules;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void addModule(Module module)
    {
        this.modules.add(module);
    }

    public void addStudent(Student student)
    {
        this.students.add(student);
    }
}
