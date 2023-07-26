/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetContract200ApplicationJSON - OK
 */

public class GetContract200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Contractify.ContractifyAPI.models.shared.ContractRead data;

    public GetContract200ApplicationJSON withData(Contractify.ContractifyAPI.models.shared.ContractRead data) {
        this.data = data;
        return this;
    }
    
    public GetContract200ApplicationJSON(){}
}
