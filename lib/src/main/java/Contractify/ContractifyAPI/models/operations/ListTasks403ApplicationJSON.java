/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListTasks403ApplicationJSON - Forbidden
 */

public class ListTasks403ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public ListTasks403ApplicationJSON withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public ListTasks403ApplicationJSON(){}
}
