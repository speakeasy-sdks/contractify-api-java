/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CurrentUserResponse {
    
    public String contentType;

    public CurrentUserResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public CurrentUserResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CurrentUserResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public CurrentUser200ApplicationJSON currentUser200ApplicationJSONObject;

    public CurrentUserResponse withCurrentUser200ApplicationJSONObject(CurrentUser200ApplicationJSON currentUser200ApplicationJSONObject) {
        this.currentUser200ApplicationJSONObject = currentUser200ApplicationJSONObject;
        return this;
    }
    
    /**
     * Unauthenticated
     */
    
    public CurrentUser401ApplicationJSON currentUser401ApplicationJSONObject;

    public CurrentUserResponse withCurrentUser401ApplicationJSONObject(CurrentUser401ApplicationJSON currentUser401ApplicationJSONObject) {
        this.currentUser401ApplicationJSONObject = currentUser401ApplicationJSONObject;
        return this;
    }
    
    /**
     * Forbidden
     */
    
    public CurrentUser403ApplicationJSON currentUser403ApplicationJSONObject;

    public CurrentUserResponse withCurrentUser403ApplicationJSONObject(CurrentUser403ApplicationJSON currentUser403ApplicationJSONObject) {
        this.currentUser403ApplicationJSONObject = currentUser403ApplicationJSONObject;
        return this;
    }
    
    public CurrentUserResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
