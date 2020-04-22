package example.presentation.api._support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice(basePackages = {"example.presentation.api"})
public class ApplicationErrorHandler {

    static final Logger logger = LoggerFactory.getLogger(ApplicationErrorHandler.class);

    // Field Validation
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseBody
    public String validationErrors(Exception exception) {
        logger.error(exception.getMessage());
        return exception.getMessage();
    }
}
