package Factory;

public abstract class HiringManager {

   abstract protected Interviewer makeInterviewer();

   public void takeInterview(){
       Interviewer a = this.makeInterviewer();
       a.askQuestions();
   }
}
