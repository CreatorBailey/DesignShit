package Factory;

public class MarketingManager extends HiringManager {


    protected Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
