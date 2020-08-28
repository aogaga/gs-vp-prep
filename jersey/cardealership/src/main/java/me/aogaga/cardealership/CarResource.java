package me.aogaga.cardealership;


import me.aogaga.cardealership.models.Car;
import me.aogaga.cardealership.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.List;


@Path("cars")
public class CarResource {

    @Autowired
    CarRepository carRepository;

    
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Car> getCars(){
      return carRepository.allCars();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("{carModel}")
    public Car getCar(@PathParam("carModel") String carModel){
        return carRepository.get();
    }


    @POST
    @Path("activity")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    
    public Car createActivityWithParams(MultivaluedMap<String, String> formParams){

        return null  ;
    }
    
}
