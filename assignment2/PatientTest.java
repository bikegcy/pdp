import org.junit.Assert;
import org.junit.Before;

import java.time.LocalDateTime;
import java.util.Date;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bikegcy on 10/2/17.
 */
public class PatientTest {

    private Patient patient1;

    @Before
    public void setUp() throws Exception {
        Patient patient1 = new Patient(3, LocalDateTime.of(2017, 3, 12, 10, 20, 30), 340 );

    }

    @Test
    public void getArriveTime() throws Exception {
        Patient patient1 = new Patient(3, LocalDateTime.of(2017, 3, 12, 10, 20, 30), 340 );
        assertEquals(patient1.getArriveTime(), LocalDateTime.of(2017, 3, 12, 10, 20, 30));
        System.out.println(patient1.ArriveTime);
    }

    @Test
    public void getUrgencyLevel() throws Exception {
        Patient patient1 = new Patient(3, LocalDateTime.of(2017, 3, 12, 10, 20, 30), 340 );
        assertEquals(patient1.getUrgencyLevel(), 3);
    }

    @Test
    public void getTreatmentTime() throws Exception {
        Patient patient1 = new Patient(3, LocalDateTime.of(2017, 3, 12, 10, 20, 30), 340 );
        assertEquals(patient1.getTreatmentTime(), 340);
    }

}
