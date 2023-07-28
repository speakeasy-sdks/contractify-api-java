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

public class Tasks {
	
	private SDKConfiguration sdkConfiguration;

	public Tasks(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Create a task
     * Create a task
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.CreateTaskResponse createTask(Contractify.ContractifyAPI.models.operations.CreateTaskRequest request, Contractify.ContractifyAPI.models.operations.CreateTaskSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.CreateTaskRequest.class, baseUrl, "/api/companies/{company}/tasks", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = Contractify.ContractifyAPI.utils.Utils.serializeRequestBody(request, "taskWrite", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.CreateTaskResponse res = new Contractify.ContractifyAPI.models.operations.CreateTaskResponse(contentType, httpRes.statusCode()) {{
            createTask200ApplicationJSONObject = null;
            createTask401ApplicationJSONObject = null;
            createTask403ApplicationJSONObject = null;
            createTask422ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateTask200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateTask200ApplicationJSON.class);
                res.createTask200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateTask401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateTask401ApplicationJSON.class);
                res.createTask401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateTask403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateTask403ApplicationJSON.class);
                res.createTask403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.CreateTask422ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.CreateTask422ApplicationJSON.class);
                res.createTask422ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Delete a task
     * Delete a task
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.DeleteTaskResponse deleteTask(Contractify.ContractifyAPI.models.operations.DeleteTaskRequest request, Contractify.ContractifyAPI.models.operations.DeleteTaskSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.DeleteTaskRequest.class, baseUrl, "/api/companies/{company}/tasks/{task}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.DeleteTaskResponse res = new Contractify.ContractifyAPI.models.operations.DeleteTaskResponse(contentType, httpRes.statusCode()) {{
            deleteTask401ApplicationJSONObject = null;
            deleteTask403ApplicationJSONObject = null;
            deleteTask404ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteTask401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteTask401ApplicationJSON.class);
                res.deleteTask401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteTask403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteTask403ApplicationJSON.class);
                res.deleteTask403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.DeleteTask404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.DeleteTask404ApplicationJSON.class);
                res.deleteTask404ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Get a task
     * Get a task
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.GetTaskResponse getTask(Contractify.ContractifyAPI.models.operations.GetTaskRequest request, Contractify.ContractifyAPI.models.operations.GetTaskSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.GetTaskRequest.class, baseUrl, "/api/companies/{company}/tasks/{task}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.GetTaskResponse res = new Contractify.ContractifyAPI.models.operations.GetTaskResponse(contentType, httpRes.statusCode()) {{
            getTask200ApplicationJSONObject = null;
            getTask401ApplicationJSONObject = null;
            getTask403ApplicationJSONObject = null;
            getTask404ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetTask200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetTask200ApplicationJSON.class);
                res.getTask200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetTask401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetTask401ApplicationJSON.class);
                res.getTask401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetTask403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetTask403ApplicationJSON.class);
                res.getTask403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.GetTask404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.GetTask404ApplicationJSON.class);
                res.getTask404ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * List tasks
     * List all tasks within a company
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.ListTasksResponse listTasks(Contractify.ContractifyAPI.models.operations.ListTasksRequest request, Contractify.ContractifyAPI.models.operations.ListTasksSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.ListTasksRequest.class, baseUrl, "/api/companies/{company}/tasks", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = Contractify.ContractifyAPI.utils.Utils.getQueryParams(Contractify.ContractifyAPI.models.operations.ListTasksRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.ListTasksResponse res = new Contractify.ContractifyAPI.models.operations.ListTasksResponse(contentType, httpRes.statusCode()) {{
            taskCollection = null;
            listTasks401ApplicationJSONObject = null;
            listTasks403ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.shared.TaskCollection out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.shared.TaskCollection.class);
                res.taskCollection = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListTasks401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListTasks401ApplicationJSON.class);
                res.listTasks401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.ListTasks403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.ListTasks403ApplicationJSON.class);
                res.listTasks403ApplicationJSONObject = out;
            }
        }

        return res;
    }

    /**
     * Update a task
     * Update a task
     * @param request the request object containing all of the parameters for the API call
     * @param security the security details to use for authentication
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public Contractify.ContractifyAPI.models.operations.UpdateTaskResponse updateTask(Contractify.ContractifyAPI.models.operations.UpdateTaskRequest request, Contractify.ContractifyAPI.models.operations.UpdateTaskSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = Contractify.ContractifyAPI.utils.Utils.generateURL(Contractify.ContractifyAPI.models.operations.UpdateTaskRequest.class, baseUrl, "/api/companies/{company}/tasks/{task}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = Contractify.ContractifyAPI.utils.Utils.serializeRequestBody(request, "taskUpdate", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = Contractify.ContractifyAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        Contractify.ContractifyAPI.models.operations.UpdateTaskResponse res = new Contractify.ContractifyAPI.models.operations.UpdateTaskResponse(contentType, httpRes.statusCode()) {{
            updateTask200ApplicationJSONObject = null;
            updateTask401ApplicationJSONObject = null;
            updateTask403ApplicationJSONObject = null;
            updateTask404ApplicationJSONObject = null;
            updateTask422ApplicationJSONObject = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateTask200ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateTask200ApplicationJSON.class);
                res.updateTask200ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 401) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateTask401ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateTask401ApplicationJSON.class);
                res.updateTask401ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 403) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateTask403ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateTask403ApplicationJSON.class);
                res.updateTask403ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateTask404ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateTask404ApplicationJSON.class);
                res.updateTask404ApplicationJSONObject = out;
            }
        }
        else if (httpRes.statusCode() == 422) {
            if (Contractify.ContractifyAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                Contractify.ContractifyAPI.models.operations.UpdateTask422ApplicationJSON out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), Contractify.ContractifyAPI.models.operations.UpdateTask422ApplicationJSON.class);
                res.updateTask422ApplicationJSONObject = out;
            }
        }

        return res;
    }
}