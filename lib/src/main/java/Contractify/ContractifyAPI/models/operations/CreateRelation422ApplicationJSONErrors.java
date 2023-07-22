/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateRelation422ApplicationJSONErrors {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    public String[] errors;

    public CreateRelation422ApplicationJSONErrors withErrors(String[] errors) {
        this.errors = errors;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("field")
    public String field;

    public CreateRelation422ApplicationJSONErrors withField(String field) {
        this.field = field;
        return this;
    }
    
    public CreateRelation422ApplicationJSONErrors(){}
}
