# Spring Hateoas
- Web is full of backlinks
- All rest response mut provide a back link 
- Create a class to make back links 
- Never delete a column from database 
- Here we return EntityModel<Employee> instead of Employee and CollectionModel<EntityModel<Employee>> instead of List<Employee> in GET method

```
@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    @Override
    public EntityModel<Employee> toModel(Employee employee) {
        return new EntityModel<Employee>(employee,
                linkTo(methodOn(EmployeeController.class).one(employee.getId())).withSelfRel(),
                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
    }

}
```
- Important Imports that might not be available through auto complete
```
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
```