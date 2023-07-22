/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI.models.operations;

import Contractify.ContractifyAPI.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateOfficeSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=oauth2,name=Authorization")
    public String oAuth2;

    public CreateOfficeSecurity withOAuth2(String oAuth2) {
        this.oAuth2 = oAuth2;
        return this;
    }
    
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String personalAccessToken;

    public CreateOfficeSecurity withPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }
    
    public CreateOfficeSecurity(@JsonProperty("OAuth2") String oAuth2, @JsonProperty("PersonalAccessToken") String personalAccessToken) {
        this.oAuth2 = oAuth2;
        this.personalAccessToken = personalAccessToken;
  }
}
