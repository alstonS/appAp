public class Appointment {
    public boolean ConflictsWith(Appointment other)
    {
        return getTime.overlapsWith(other.getTime());
    }
    public void clearConflicts(Appointment appt)
    {
        for(int i = appLiost.Size()-1; i>=0; i--)
        {
            if(appt.conflictsWith(Appointment))appList.get(i))
            {

                appList.remove(i);
            }
            
        }

    }
}
