package Factory;

public class DevelopmentManager extends HiringManager {

    @Override
    protected Interviewer makeInterviewer() {
        return new Developer();
    }
}
