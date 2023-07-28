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

public class Offices {
	
	private SDKConfiguration sdkConfiguration;

	public Offices(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create an office
     * Create an office
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.CreateOfficeResponse createOffice(Contractify.ContractifyAPI.models.operations.CreateOfficeRequest request, Contractify.ContractifyAPI.models.operations.CreateOfficeSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.CreateOfficeRequest.class, baseUrl, "/api/companies/{company}/offices", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Contractify.ContractifyAPI.utils.Utils.serializeRequestBody(request, "officeWrite", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.CreateOfficeResponse res = new Contractify.ContractifyAPI.models.operations.CreateOfficeResponse(contentType, httpRes.statusCode()) {{
            createOffice201ApplicationJSONObject = null;
            createOffice401ApplicationJSONObject = null;
            createOffice403ApplicationJSONObject = null;
            createOffice422ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateOffice201ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateOffice201ApplicationJSON.class);
                res.createOffice201ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateOffice401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateOffice401ApplicationJSON.class);
                res.createOffice401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateOffice403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateOffice403ApplicationJSON.class);
                res.createOffice403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateOffice422ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateOffice422ApplicationJSON.class);
                res.createOffice422ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Delete an office
     * Delete an office
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.DeleteOfficeResponse deleteOffice(Contractify.ContractifyAPI.models.operations.DeleteOfficeRequest request, Contractify.ContractifyAPI.models.operations.DeleteOfficeSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.DeleteOfficeRequest.class, baseUrl, "/api/companies/{company}/offices/{office}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.DeleteOfficeResponse res = new Contractify.ContractifyAPI.models.operations.DeleteOfficeResponse(contentType, httpRes.statusCode()) {{
            deleteOffice400ApplicationJSONObject = null;
            deleteOffice401ApplicationJSONObject = null;
            deleteOffice403ApplicationJSONObject = null;
            deleteOffice404ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 400) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteOffice400ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteOffice400ApplicationJSON.class);
                res.deleteOffice400ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteOffice401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteOffice401ApplicationJSON.class);
                res.deleteOffice401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteOffice403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteOffice403ApplicationJSON.class);
                res.deleteOffice403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteOffice404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteOffice404ApplicationJSON.class);
                res.deleteOffice404ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get an office
     * Get information about an office
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.GetOfficeResponse getOffice(Contractify.ContractifyAPI.models.operations.GetOfficeRequest request, Contractify.ContractifyAPI.models.operations.GetOfficeSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.GetOfficeRequest.class, baseUrl, "/api/companies/{company}/offices/{office}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.GetOfficeResponse res = new Contractify.ContractifyAPI.models.operations.GetOfficeResponse(contentType, httpRes.statusCode()) {{
            getOffice200ApplicationJSONObject = null;
            getOffice401ApplicationJSONObject = null;
            getOffice403ApplicationJSONObject = null;
            getOffice404ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetOffice200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetOffice200ApplicationJSON.class);
                res.getOffice200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetOffice401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetOffice401ApplicationJSON.class);
                res.getOffice401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetOffice403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetOffice403ApplicationJSON.class);
                res.getOffice403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetOffice404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetOffice404ApplicationJSON.class);
                res.getOffice404ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List offices
     * List all the offices within a company
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.ListOfficesResponse listOffices(Contractify.ContractifyAPI.models.operations.ListOfficesRequest request, Contractify.ContractifyAPI.models.operations.ListOfficesSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.ListOfficesRequest.class, baseUrl, "/api/companies/{company}/offices", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.ListOfficesResponse res = new Contractify.ContractifyAPI.models.operations.ListOfficesResponse(contentType, httpRes.statusCode()) {{
            officeCollection = null;
            listOffices401ApplicationJSONObject = null;
            listOffices403ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.shared.OfficeCollection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.shared.OfficeCollection.class);
                res.officeCollection = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListOffices401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListOffices401ApplicationJSON.class);
                res.listOffices401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListOffices403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListOffices403ApplicationJSON.class);
                res.listOffices403ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Update an office
     * Update an office
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.UpdateOfficeResponse updateOffice(Contractify.ContractifyAPI.models.operations.UpdateOfficeRequest request, Contractify.ContractifyAPI.models.operations.UpdateOfficeSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.UpdateOfficeRequest.class, baseUrl, "/api/companies/{company}/offices/{office}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Contractify.ContractifyAPI.utils.Utils.serializeRequestBody(request, "officeWrite", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.UpdateOfficeResponse res = new Contractify.ContractifyAPI.models.operations.UpdateOfficeResponse(contentType, httpRes.statusCode()) {{
            updateOffice200ApplicationJSONObject = null;
            updateOffice401ApplicationJSONObject = null;
            updateOffice403ApplicationJSONObject = null;
            updateOffice404ApplicationJSONObject = null;
            updateOffice422ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateOffice200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateOffice200ApplicationJSON.class);
                res.updateOffice200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateOffice401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateOffice401ApplicationJSON.class);
                res.updateOffice401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateOffice403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateOffice403ApplicationJSON.class);
                res.updateOffice403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateOffice404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateOffice404ApplicationJSON.class);
                res.updateOffice404ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateOffice422ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateOffice422ApplicationJSON.class);
                res.updateOffice422ApplicationJSONObject = out;
            }
        }

        return res;
    }
}