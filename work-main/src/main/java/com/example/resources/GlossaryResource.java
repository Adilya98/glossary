package com.example.resources;

import com.example.models.GlossaryModel;
import com.example.services.GlossaryService;
import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("")
public class GlossaryResource {

    @Inject
    GlossaryService glossaryService;

    @Location("main_page")
    @Inject
    Template templateOfTotal;

    @Location("glossary_page")
    @Inject
    Template templateOfConcretePage;


    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getGlossary() {
        return templateOfTotal.data("items", glossaryService.getModels());
    }

    @Path("/info/{id}")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getConcreteGlossary(@PathParam("id") int id) {
        if (id < 0 || id >= glossaryService.getModels().size()) {
            throw new NotFoundException("Page not found!");
        }
        GlossaryModel model = glossaryService.getModels().get(id);
        return templateOfConcretePage.data("name", model.getName(),
                "description", model.getDescription());
    }
}

