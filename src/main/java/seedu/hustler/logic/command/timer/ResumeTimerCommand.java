package seedu.hustler.logic.command.timer;

import seedu.hustler.logic.command.Command;
import seedu.hustler.ui.timer.TimerManager;

/**
 * Command that resumes the timer.
 */
public class ResumeTimerCommand extends Command {
    /**
     * Resumes the timer.
     */
    public void execute() {
        TimerManager.resumeTimer();
    }
}
