package de.chkal.prettytest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.apache.log4j.Logger;
import org.ocpsoft.prettyfaces.annotation.ForwardTo;
import org.ocpsoft.prettyfaces.annotation.ParameterBinding;
import org.ocpsoft.prettyfaces.annotation.URLPattern;

@Named
@RequestScoped
@URLPattern("/greeting/{name}")
@ForwardTo("/greeting.jsf")
public class GreetingBean
{

   private final static Logger log = Logger.getLogger(GreetingBean.class);

   @ParameterBinding
   private String name;

   public void showGreeting()
   {
      // TODO

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