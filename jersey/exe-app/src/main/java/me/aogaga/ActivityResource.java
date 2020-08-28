package me.aogaga;

import me.aogaga.model.Activity;
import me.aogaga.repository.ActivityRepository;
import me.aogaga.repository.ActivityRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("activities")
public class ActivityResource {

    private ActivityRepository activityRepository = new ActivityRepositoryStub();

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Activity> getActivities(){
        return activityRepository.findAllActivities();
    }
}
