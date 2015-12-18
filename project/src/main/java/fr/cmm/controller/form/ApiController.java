package fr.cmm.controller.form;


import fr.cmm.ResourceNotFoundException;
import fr.cmm.domain.Recipe;
import fr.cmm.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.Iterator;

/**
 * Created by pomme on 18/12/2015.
 */

@Controller
public class ApiController {
    @Inject
    private RecipeService recipeService;

    @RequestMapping("/api/recipes")
    public @ResponseBody Iterator<Recipe> getRecipesInJSON() {

        Iterator<Recipe> recipe = recipeService.findPagine();

        return recipe;
        }



    @RequestMapping("/api/recipes/{id} ")
    public @ResponseBody  Recipe getRecipeInJSON(@PathVariable("id") String id) {
        Recipe recipe = recipeService.findById(id);

        if (recipe == null) {
            throw new ResourceNotFoundException();
        }
        return recipe;
    }




}
