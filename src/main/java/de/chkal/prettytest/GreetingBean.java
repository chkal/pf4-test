package de.chkal.prettytest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;
import org.ocpsoft.prettyfaces.annotation.ForwardTo;
import org.ocpsoft.prettyfaces.annotation.ParameterBinding;
import org.ocpsoft.prettyfaces.annotation.URLAction;
import org.ocpsoft.prettyfaces.annotation.URLPattern;

@ManagedBean
@RequestScoped
@URLPattern("/greeting/{name}")
@ForwardTo("/greeting.jsf")
public class GreetingBean
{

   private final static Logger log = Logger.getLogger(GreetingBean.class);

   @ParameterBinding
   private String name;

   @URLAction
   public void showGreeting()
   {
      System.out.println("*************************************");
      System.out.println("*************************************");
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