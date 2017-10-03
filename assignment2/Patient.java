
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.TransferQueue;

/**
 * Created by xwenfei on 26/9
 */

public class Patient implements Comparable<Patient> {
    public int UrgencyLevel;
    public LocalDateTime ArriveTime;
    public int TreatmentTime;
    public static final int MAX_TIME = 480;
    /**
     * Creates a new patient given the patient's ArriveTime, condition and treatment time.
     * Use LocalDateTime as date to mark time
     * Condition has 10 levels from 1 to 10
     * TreatmentTime is in the unit of minutes, no longer than 480 minutes(8 hours)
     *
     * @param ArriveTime the patient's arrival time
     * @param UrgencyLevel the urgency of patient’s condition
     * @param TreatmentTime how long the treatment will take
     */

    public Patient(int UrgencyLevel, LocalDateTime ArriveTime, int TreatmentTime)throws Exception {
        if(UrgencyLevel < 0 || UrgencyLevel > 10){
            throw new IllegalArgumentException("patient urgency must be 0 - 10");
        }
        this.UrgencyLevel = UrgencyLevel;

        if(ArriveTime == null){
            throw new IllegalArgumentException("Arrival time illegal");
        }
        this.ArriveTime = ArriveTime;

        if(TreatmentTime > MAX_TIME){
            throw new IllegalArgumentException("Treatment time illegal");
        }
        this.TreatmentTime = TreatmentTime;
    }

    public LocalDateTime getArriveTime(){
        return this.ArriveTime;
    }

    public int getUrgencyLevel(){
        return this.UrgencyLevel;
    }

    public int getTreatmentTime(){
        return this.TreatmentTime;
    }

    @Override
    public int compareTo(Patient patient) {
        if(patient == null){
            throw new IllegalArgumentException("patient is null");
        }
        if(patient.UrgencyLevel != this.UrgencyLevel){
            return this.UrgencyLevel - patient.UrgencyLevel;
        }
        else{
            return this.ArriveTime.compareTo(patient.ArriveTime);
        }
    }
}
