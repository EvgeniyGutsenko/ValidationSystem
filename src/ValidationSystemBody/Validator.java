package ValidationSystemBody;

import Exception.*;

public interface Validator<T> {
     void validate(T input) throws ValidationFailedException;
}
