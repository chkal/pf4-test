package de.chkal.prettytest;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("EvenLengthValidator")
public class EvenLengthValidator implements Validator
{

   @Override
   public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException
   {
      if (arg2 == null || arg2.toString().length() % 2 != 0) {
         throw new ValidatorException(new ArrayList<FacesMessage>());
      }
   }

}
