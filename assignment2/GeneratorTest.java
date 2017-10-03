import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by by xwenfei at 09/28 on 10/2/17.
 */
public class GeneratorTest {

    private MyPriorityQueue<Patient> pqueue;
    private Generator generator;

    @Before
    public void setUp() throws Exception {
        MyPriorityQueue<Patient> pqueue = new MyPriorityQueue<Patient>();
        generator = new Generator();
    }

    @Test
    public void patientGenerator() throws Exception {
        MyPriorityQueue<Patient> pqueue = new MyPriorityQueue<Patient>();

        Random random = new Random();
        LocalDateTime StartTime = LocalDateTime.now();

        Patient randomPatient = generator.PatientGenerator(StartTime, Patient.MAX_TIME);
        for(int i = 0; i < 50; i++){
            pqueue.insert(randomPatient);
            System.out.println("Urgency level: \t" + randomPatient.UrgencyLevel);
            System.out.println("Arrival time： \t" + randomPatient.ArriveTime);
            System.out.println("TreatmentTime: \t" + randomPatient.TreatmentTime);
            System.out.println("Leaving time: \t" + randomPatient.LeaveTime + "\n");
            int duration = randomPatient.TreatmentTime;
            int randomDuration = random.nextInt(duration);
            randomPatient = generator.PatientGenerator(randomPatient.ArriveTime.plusMinutes(randomDuration), duration);
        }

    }

}
