package ValidationSystemBody;

import Exception.*;

public class IntegerValidator implements Validator<Integer> {

    @Override
    public void validate(Integer input) throws ValidationFailedException {
        if ((input < 1) || (input > 10))
            throw new ValidationFailedException("The number must be from 1 to 10, try again!");
    }
}