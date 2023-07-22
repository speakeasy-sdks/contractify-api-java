/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import Contractify.ContractifyAPI.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateOfficeRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public Contractify.ContractifyAPI.models.shared.OfficeWrite officeWrite;

    public UpdateOfficeRequest withOfficeWrite(Contractify.ContractifyAPI.models.shared.OfficeWrite officeWrite) {
        this.officeWrite = officeWrite;
        return this;
    }
    
    /**
     * Id of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company")
    public Long company;

    public UpdateOfficeRequest withCompany(Long company) {
        this.company = company;
        return this;
    }
    
    /**
     * Id of the office
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=office")
    public Long office;

    public UpdateOfficeRequest withOffice(Long office) {
        this.office = office;
        return this;
    }
    
    public UpdateOfficeRequest(@JsonProperty("company") Long company, @JsonProperty("office") Long office) {
        this.company = company;
        this.office = office;
  }
}
