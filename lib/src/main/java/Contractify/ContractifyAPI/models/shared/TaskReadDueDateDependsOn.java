/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TaskReadDueDateDependsOn {
    TERMINATION_DATE("termination_date"),
    END_DATE("end_date"),
    START_DATE("start_date");

    @JsonValue
    public final String value;

    private TaskReadDueDateDependsOn(String value) {
        this.value = value;
    }
}
