package example.presentation.api._support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice(basePackages = {"example.presentation.api"})
public class ApplicationErrorHandler {

    static final Logger logger = LoggerFactory.getLogger(ApplicationErrorHandler.class);

    // Validation Errors
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler({IllegalArgumentException.class})
    public String validationErrors(Exception exception) {
        logger.error(exception.getMessage());
        return exception.getMessage();
    }
}
