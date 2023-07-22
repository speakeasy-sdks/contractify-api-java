/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import Contractify.ContractifyAPI.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetTaskRequest {
    /**
     * Id of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company")
    public Long company;

    public GetTaskRequest withCompany(Long company) {
        this.company = company;
        return this;
    }
    
    /**
     * Id of the task
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=task")
    public Long task;

    public GetTaskRequest withTask(Long task) {
        this.task = task;
        return this;
    }
    
    public GetTaskRequest(@JsonProperty("company") Long company, @JsonProperty("task") Long task) {
        this.company = company;
        this.task = task;
  }
}
