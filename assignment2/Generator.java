import java.time.Duration;
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
    public Patient PatientGenerator(LocalDateTime localTime, int duration) throws Exception {
        Random random = new Random();
        int Urgency = random.nextInt(11);
        int RandomTreatment = random.nextInt(Patient.MAX_TIME);
        int minuteDuration = random.nextInt(duration + 1);

        LocalDateTime RandomTime = localTime.plusMinutes(minuteDuration);
        Patient RandomPatient = new Patient(Urgency, RandomTime, RandomTreatment);
        return RandomPatient;
    }


}
