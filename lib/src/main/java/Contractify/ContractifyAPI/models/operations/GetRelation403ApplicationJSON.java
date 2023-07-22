/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetRelation403ApplicationJSON - Forbidden
 */

public class GetRelation403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public GetRelation403ApplicationJSON withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public GetRelation403ApplicationJSON(){}
}
