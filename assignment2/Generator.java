import java.time.LocalDateTime;
import java.util.Random;

/**
 * created by xwenfei at 09/28
 * Generate random patient data
 */
public class Generator {

    /**
     * empty constructor
     */
    public Generator(){

    }

    /**
     * @return the random generated patient
     * only create the patient in day 01/10/2017
     */
    public Patient PatientGenerator() throws Exception {
        Random random = new Random();
        int Urgency = random.nextInt(11);

        //only generate the patient on 01/10/2017
        int year = 2017;
        int month = 10;
        int day = 1;
        int hour = random.nextInt(24);
        int minute = random.nextInt(60);
        int second = random.nextInt(60);
        LocalDateTime RandomTime = LocalDateTime.of(year, month, day, hour, minute, second);

        int RandomTreatment = random.nextInt(Patient.MAX_TIME);

        Patient RandomPatient = new Patient(Urgency, RandomTime, RandomTreatment);
        return RandomPatient;
    }


}
