/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.blockchain.ethereum.api;

import com.example.blockchain.ethereum.domain.LoginRequestTO;
import com.example.blockchain.ethereum.domain.UserTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-11T19:34:33.503177800+01:00[Europe/Paris]")

@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    /**
     * GET /users : Returns a list of available users
     *
     * @return successful operation (status code 200)
     *         or No content (status code 204)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(value = "Returns a list of available users", nickname = "getAllUsers", notes = "", response = UserTO.class, responseContainer = "List", tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserTO.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "No content"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<UserTO>> _getAllUsers();


    /**
     * GET /users/{userId} : Returns the details of the requested user
     *
     * @param userId ID of user to return (required)
     * @return successful operation (status code 200)
     *         or Invalid user ID (status code 400)
     *         or User not found (status code 404)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(value = "Returns the details of the requested user", nickname = "getUserById", notes = "", response = UserTO.class, tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserTO.class),
        @ApiResponse(code = 400, message = "Invalid user ID"),
        @ApiResponse(code = 404, message = "User not found"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UserTO> _getUserById(@ApiParam(value = "ID of user to return",required=true) @PathVariable("userId") Long userId);


    /**
     * POST /users/login : Create an initiative
     *
     * @param loginRequestTO User&#39;s credentials object (required)
     * @return successful operation (status code 200)
     *         or Invalid credentials (status code 400)
     *         or Internal server error (status code 500)
     */
    @ApiOperation(value = "Create an initiative", nickname = "loginUser", notes = "", response = UserTO.class, tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = UserTO.class),
        @ApiResponse(code = 400, message = "Invalid credentials"),
        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(value = "/users/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<UserTO> _loginUser(@ApiParam(value = "User's credentials object" ,required=true )  @Valid @RequestBody LoginRequestTO loginRequestTO);

}