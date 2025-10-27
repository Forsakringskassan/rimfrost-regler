package se.fk.github.rimfrost.regler;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Path;
import se.fk.gradle.examples.jaxrsspec.controllers.generatedsource.model.Alternative;
import se.fk.gradle.examples.jaxrsspec.controllers.generatedsource.model.AlternativesResponse;
import se.fk.gradle.examples.jaxrsspec.controllers.generatedsource.model.OmbudRequest;
import se.fk.gradle.examples.jaxrsspec.controllers.generatedsource.model.OmbudResponse;
import se.fk.gradle.examples.jaxrsspec.controllers.generatedsource.FullmaktsControllerApi;

@ApplicationScoped
@Path("/api")
public class FullmaktsControllerApiImpl implements FullmaktsControllerApi
{

   @Override
   public OmbudResponse checkOmbud(OmbudRequest ombudRequest)
   {
      return new OmbudResponse()
            .name("Namnet");
   }

   @Override
   public AlternativesResponse getAlternatives()
   {
      return new AlternativesResponse()
            .addAlternativesItem(new Alternative().id("1").name("Alt 1"))
            .addAlternativesItem(new Alternative().id("2").name("Alt 2"));
   }
}
