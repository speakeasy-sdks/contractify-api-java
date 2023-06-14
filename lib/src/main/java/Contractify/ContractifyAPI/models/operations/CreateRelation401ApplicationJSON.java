/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateRelation401ApplicationJSON - Unauthenticated
 */

public class CreateRelation401ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public CreateRelation401ApplicationJSON withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public CreateRelation401ApplicationJSON(){}
}
