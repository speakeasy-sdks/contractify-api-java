/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Contractify.ContractifyAPI;

import Contractify.ContractifyAPI.utils.HTTPClient;
import Contractify.ContractifyAPI.utils.HTTPRequest;
import Contractify.ContractifyAPI.utils.JSON;
import Contractify.ContractifyAPI.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Relations {
	
	private SDKConfiguration sdkConfiguration;

	public Relations(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a relation
     * Create a relation
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.CreateRelationResponse createRelation(Contractify.ContractifyAPI.models.operations.CreateRelationRequest request, Contractify.ContractifyAPI.models.operations.CreateRelationSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.CreateRelationRequest.class, baseUrl, "/api/companies/{company}/relations", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Contractify.ContractifyAPI.utils.Utils.serializeRequestBody(request, "relationWrite", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.CreateRelationResponse res = new Contractify.ContractifyAPI.models.operations.CreateRelationResponse(contentType, httpRes.statusCode()) {{
            createRelation201ApplicationJSONObject = null;
            createRelation401ApplicationJSONObject = null;
            createRelation403ApplicationJSONObject = null;
            createRelation422ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateRelation201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateRelation201ApplicationJSON.class);
                res.createRelation201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateRelation401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateRelation401ApplicationJSON.class);
                res.createRelation401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateRelation403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateRelation403ApplicationJSON.class);
                res.createRelation403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateRelation422ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateRelation422ApplicationJSON.class);
                res.createRelation422ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Delete a relation
     * Delete a relation
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.DeleteRelationResponse deleteRelation(Contractify.ContractifyAPI.models.operations.DeleteRelationRequest request, Contractify.ContractifyAPI.models.operations.DeleteRelationSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.DeleteRelationRequest.class, baseUrl, "/api/companies/{company}/relations/{relation}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.DeleteRelationResponse res = new Contractify.ContractifyAPI.models.operations.DeleteRelationResponse(contentType, httpRes.statusCode()) {{
            deleteRelation400ApplicationJSONObject = null;
            deleteRelation401ApplicationJSONObject = null;
            deleteRelation403ApplicationJSONObject = null;
            deleteRelation404ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 400) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteRelation400ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteRelation400ApplicationJSON.class);
                res.deleteRelation400ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteRelation401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteRelation401ApplicationJSON.class);
                res.deleteRelation401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteRelation403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteRelation403ApplicationJSON.class);
                res.deleteRelation403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteRelation404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteRelation404ApplicationJSON.class);
                res.deleteRelation404ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get a relation
     * Get information about a relation
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.GetRelationResponse getRelation(Contractify.ContractifyAPI.models.operations.GetRelationRequest request, Contractify.ContractifyAPI.models.operations.GetRelationSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.GetRelationRequest.class, baseUrl, "/api/companies/{company}/relations/{relation}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.GetRelationResponse res = new Contractify.ContractifyAPI.models.operations.GetRelationResponse(contentType, httpRes.statusCode()) {{
            getRelation200ApplicationJSONObject = null;
            getRelation401ApplicationJSONObject = null;
            getRelation403ApplicationJSONObject = null;
            getRelation404ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetRelation200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetRelation200ApplicationJSON.class);
                res.getRelation200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetRelation401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetRelation401ApplicationJSON.class);
                res.getRelation401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetRelation403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetRelation403ApplicationJSON.class);
                res.getRelation403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetRelation404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetRelation404ApplicationJSON.class);
                res.getRelation404ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List relations
     * List all the relations within a company
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.ListRelationsResponse listRelations(Contractify.ContractifyAPI.models.operations.ListRelationsRequest request, Contractify.ContractifyAPI.models.operations.ListRelationsSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.ListRelationsRequest.class, baseUrl, "/api/companies/{company}/relations", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = Contractify.ContractifyAPI.utils.Utils.getQueryParams(Contractify.ContractifyAPI.models.operations.ListRelationsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.ListRelationsResponse res = new Contractify.ContractifyAPI.models.operations.ListRelationsResponse(contentType, httpRes.statusCode()) {{
            relationCollection = null;
            listRelations401ApplicationJSONObject = null;
            listRelations403ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.shared.RelationCollection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.shared.RelationCollection.class);
                res.relationCollection = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListRelations401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListRelations401ApplicationJSON.class);
                res.listRelations401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListRelations403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListRelations403ApplicationJSON.class);
                res.listRelations403ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Update a relation
     * Update a relation
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.UpdateRelationResponse updateRelation(Contractify.ContractifyAPI.models.operations.UpdateRelationRequest request, Contractify.ContractifyAPI.models.operations.UpdateRelationSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.UpdateRelationRequest.class, baseUrl, "/api/companies/{company}/relations/{relation}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Contractify.ContractifyAPI.utils.Utils.serializeRequestBody(request, "relationWrite", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.UpdateRelationResponse res = new Contractify.ContractifyAPI.models.operations.UpdateRelationResponse(contentType, httpRes.statusCode()) {{
            updateRelation200ApplicationJSONObject = null;
            updateRelation401ApplicationJSONObject = null;
            updateRelation403ApplicationJSONObject = null;
            updateRelation404ApplicationJSONObject = null;
            updateRelation422ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateRelation200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateRelation200ApplicationJSON.class);
                res.updateRelation200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateRelation401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateRelation401ApplicationJSON.class);
                res.updateRelation401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateRelation403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateRelation403ApplicationJSON.class);
                res.updateRelation403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateRelation404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateRelation404ApplicationJSON.class);
                res.updateRelation404ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateRelation422ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateRelation422ApplicationJSON.class);
                res.updateRelation422ApplicationJSONObject = out;
            }
        }

        return res;
    }
}