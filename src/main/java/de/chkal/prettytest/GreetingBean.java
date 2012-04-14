package de.chkal.prettytest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;
import org.ocpsoft.prettyfaces.annotation.ForwardTo;
import org.ocpsoft.prettyfaces.annotation.JSFConverter;
import org.ocpsoft.prettyfaces.annotation.JSFValidator;
import org.ocpsoft.prettyfaces.annotation.ParameterBinding;
import org.ocpsoft.prettyfaces.annotation.URLAction;
import org.ocpsoft.prettyfaces.annotation.URLPattern;

@ManagedBean
@RequestScoped
@URLPattern("/greeting/{param}")
@ForwardTo("/greeting.jsf")
public class GreetingBean
{

   private final static Logger log = Logger.getLogger(GreetingBean.class);

   @ParameterBinding("param")
   @JSFValidator(validatorId = "EvenLengthValidator")
   @JSFConverter(converterId = "UppercaseConverter")
   private String name;

   @URLAction
   public void showGreeting()
   {
      log.debug("*************************************");
      log.debug("Got: " + name);
      log.debug("*************************************");
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

}