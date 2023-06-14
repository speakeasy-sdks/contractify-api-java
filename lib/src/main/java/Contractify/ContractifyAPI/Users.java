/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI;

import Contractify.ContractifyAPI.utils.HTTPClient;
import Contractify.ContractifyAPI.utils.HTTPRequest;
import Contractify.ContractifyAPI.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Users {
	
	private SDKConfiguration sdkConfiguration;

	public Users(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Current User
     * Get the current user details
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.CurrentUserResponse currentUser(Contractify.ContractifyAPI.models.operations.CurrentUserSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(baseUrl, "/api/user");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.CurrentUserResponse res = new Contractify.ContractifyAPI.models.operations.CurrentUserResponse(contentType, httpRes.statusCode()) {{
            currentUser200ApplicationJSONObject = null;
            currentUser401ApplicationJSONObject = null;
            currentUser403ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CurrentUser200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CurrentUser200ApplicationJSON.class);
                res.currentUser200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CurrentUser401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CurrentUser401ApplicationJSON.class);
                res.currentUser401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CurrentUser403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CurrentUser403ApplicationJSON.class);
                res.currentUser403ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List users
     * List all the users within a company
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.ListUsersResponse listUsers(Contractify.ContractifyAPI.models.operations.ListUsersRequest request, Contractify.ContractifyAPI.models.operations.ListUsersSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.ListUsersRequest.class, baseUrl, "/api/companies/{company}/users", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json;q=1, application/json;q=0.7, application/json;q=0");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = Contractify.ContractifyAPI.utils.Utils.getQueryParams(Contractify.ContractifyAPI.models.operations.ListUsersRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.ListUsersResponse res = new Contractify.ContractifyAPI.models.operations.ListUsersResponse(contentType, httpRes.statusCode()) {{
            userCollection = null;
            listUsers401ApplicationJSONObject = null;
            listUsers403ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.shared.UserCollection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.shared.UserCollection.class);
                res.userCollection = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListUsers401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListUsers401ApplicationJSON.class);
                res.listUsers401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListUsers403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListUsers403ApplicationJSON.class);
                res.listUsers403ApplicationJSONObject = out;
            }
        }

        return res;
    }
}