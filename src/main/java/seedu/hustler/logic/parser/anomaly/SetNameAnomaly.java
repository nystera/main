package seedu.hustler.logic.parser.anomaly;

import seedu.hustler.logic.CommandLineException;

/**
 * Detects anomalies in the set name command by the user.
 */
public class SetNameAnomaly extends DetectAnomaly {

    /**
     * The message to output if the user inputs the wrong format.
     */
    private static final String MESSAGE_EMPTY_NAME = "Name cannot be empty! Please input \"/setname <name>\".";

    @Override
    public void detect(String[] userInput) throws CommandLineException {
        if (userInput.length == 1 || userInput[1].isBlank()) {
            throw new CommandLineException(MESSAGE_EMPTY_NAME);
        }
    }
}
