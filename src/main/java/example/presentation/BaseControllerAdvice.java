package example.presentation;

import example.domain.type.Covered;
import example.presentation._support.CoveredEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice(basePackageClasses = BaseControllerAdvice.class)
public class BaseControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {


        binder.initDirectFieldAccess();
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));

        binder.registerCustomEditor(Covered.class, new CoveredEditor());


    }
}
