import org.junit.Before;
import org.junit.Test;

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
        int test = random.nextInt(22);
        System.out.println(test);
        test = random.nextInt(22);
        System.out.println(test);
        test = random.nextInt(22);
        System.out.println(test);

        Patient randomPatient = generator.PatientGenerator();
        for(int i = 0; i < 50; i++){
            pqueue.insert(randomPatient);
            randomPatient = generator.PatientGenerator();
        }

        List<Patient> forward;
        forward = pqueue.testForwardTraversal();
        Iterator<Patient> iter = forward.iterator();

        System.out.println("Forward traverse:");
        Patient patientTraverse;
        while (iter.hasNext()) {
            patientTraverse = iter.next();
            System.out.println(patientTraverse.UrgencyLevel);
            System.out.println(patientTraverse.ArriveTime);
            System.out.println(patientTraverse.TreatmentTime);
        }


    }

}
