package de.chkal.prettytest;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;
import org.ocpsoft.prettyfaces.annotation.ForwardTo;
import org.ocpsoft.prettyfaces.annotation.URLPattern;

@ManagedBean
@RequestScoped
@URLPattern("/welcome")
@ForwardTo("/welcome-page.jsf")
public class WelcomeBean
{
   private final static Logger log = Logger.getLogger(WelcomeBean.class);

   // Query parameter my be used to initialize this value
   private String name;

   // Action called on GET request for /welcome
   public void start()
   {}

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

}