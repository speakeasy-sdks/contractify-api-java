/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContractTypeCollection - OK
 */

public class ContractTypeCollection {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public ContractTypeRead[] data;

    public ContractTypeCollection withData(ContractTypeRead[] data) {
        this.data = data;
        return this;
    }
    
    public ContractTypeCollection(){}
}
