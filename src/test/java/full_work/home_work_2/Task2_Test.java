package full_work.home_work_2;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by alexey on 08.07.2016.
 */
public class Task2_Test {

    Counter_things_on_table counter_things = new Counter_things_on_table();

    @Test
    public void getEmployeeById() throws Exception {
        assertNotNull(counter_things);

        assertEquals(Counter_things_on_table.Employee.class,counter_things.getEmployee.getClass());

    }
}
