package ValidationSystemBody;

import Exception.*;

public class StringValidator implements Validator<String> {

    @Override
    public void validate(String input) throws ValidationFailedException {
        if (!input.matches("^[A-ZА-ЯЁ].+"))
            throw new ValidationFailedException("The string must start with a capital letter, try again");
    }
}