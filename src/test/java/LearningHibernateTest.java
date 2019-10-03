
import entities.Student;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import utils.HibernateUtils;

import java.util.Date;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class LearningHibernateTest {
    private Session session = null;
    @Before
    public void setUp() throws Exception {
        session = HibernateUtils.getSession();
        session.beginTransaction();
    }

    @After
    public void tearDown() throws Exception {
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void save() {
        Student student = new Student();
        student.setName("Lilia");
        student.setRegistrationDate(new Date());

        session.save(student);
    }

    @Test
    public void getById() {
        Student result = (Student) session.get(Student.class , 1);
        assertThat(result.getName(), equalTo("Ivan"));
    }

    @Test
    public void getAll() {
        session.createQuery("From Student where name='Pesho'")
                .list()
                .forEach(System.out::println);
    }

    @Test
    public void getUsingCriteria() {

    }
}
