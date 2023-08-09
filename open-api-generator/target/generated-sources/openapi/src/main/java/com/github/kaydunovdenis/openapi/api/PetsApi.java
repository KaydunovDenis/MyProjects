/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.kaydunovdenis.openapi.api;

import com.github.kaydunovdenis.openapi.model.Error;
import com.github.kaydunovdenis.openapi.model.Pet;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-05T18:51:20.399676500+03:00[Europe/Minsk]")
@Validated
@Api(value = "pets", description = "the pets API")
public interface PetsApi {

    default PetsApiDelegate getDelegate() {
        return new PetsApiDelegate() {};
    }

    /**
     * POST /pets : Create a pet
     *
     * @return Null response (status code 201)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Create a pet", nickname = "createPets", notes = "", tags={ "pets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Null response"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @PostMapping(
        value = "/pets",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> createPets() {
        return getDelegate().createPets();
    }


    /**
     * GET /pets : List all pets
     *
     * @param limit How many items to return at one time (max 100) (optional)
     * @return A paged array of pets (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "List all pets", nickname = "listPets", notes = "", response = Pet.class, responseContainer = "List", tags={ "pets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A paged array of pets", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @GetMapping(
        value = "/pets",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Pet>> listPets(@ApiParam(value = "How many items to return at one time (max 100)") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        return getDelegate().listPets(limit);
    }


    /**
     * GET /pets/{petId} : Info for a specific pet
     *
     * @param petId The id of the pet to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     *         or unexpected error (status code 200)
     */
    @ApiOperation(value = "Info for a specific pet", nickname = "showPetById", notes = "", response = Pet.class, tags={ "pets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Expected response to a valid request", response = Pet.class),
        @ApiResponse(code = 200, message = "unexpected error", response = Error.class) })
    @GetMapping(
        value = "/pets/{petId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Pet> showPetById(@ApiParam(value = "The id of the pet to retrieve",required=true) @PathVariable("petId") String petId) {
        return getDelegate().showPetById(petId);
    }

}