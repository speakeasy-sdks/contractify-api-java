# offices

### Available Operations

* [createOffice](#createoffice) - Create an office
* [deleteOffice](#deleteoffice) - Delete an office
* [getOffice](#getoffice) - Get an office
* [listOffices](#listoffices) - List offices
* [updateOffice](#updateoffice) - Update an office

## createOffice

Create an office

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.CreateOfficeRequest;
import Contractify.ContractifyAPI.models.operations.CreateOfficeResponse;
import Contractify.ContractifyAPI.models.operations.CreateOfficeSecurity;
import Contractify.ContractifyAPI.models.shared.OfficeWrite;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            CreateOfficeRequest req = new CreateOfficeRequest(674752L) {{
                officeWrite = new OfficeWrite() {{
                    bus = "1";
                    city = "Sleidinge";
                    contactPerson = "Ada Lovelace";
                    country = "Belgium";
                    email = "info@contractify.be";
                    id = 1L;
                    name = "Ghent";
                    numberIdentity = "OFF-GHENT";
                    phone = "+32 9 234 28 97";
                    street = "Polenstraat 163";
                    zip = "9940";
                }};;
            }};            

            CreateOfficeResponse res = sdk.offices.createOffice(req, new CreateOfficeSecurity("animi", "enim") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.createOffice201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [Contractify.ContractifyAPI.models.operations.CreateOfficeRequest](../../models/operations/CreateOfficeRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [Contractify.ContractifyAPI.models.operations.CreateOfficeSecurity](../../models/operations/CreateOfficeSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[Contractify.ContractifyAPI.models.operations.CreateOfficeResponse](../../models/operations/CreateOfficeResponse.md)**


## deleteOffice

Delete an office

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.DeleteOfficeRequest;
import Contractify.ContractifyAPI.models.operations.DeleteOfficeResponse;
import Contractify.ContractifyAPI.models.operations.DeleteOfficeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            DeleteOfficeRequest req = new DeleteOfficeRequest(138183L, 778346L);            

            DeleteOfficeResponse res = sdk.offices.deleteOffice(req, new DeleteOfficeSecurity("sequi", "tenetur") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [Contractify.ContractifyAPI.models.operations.DeleteOfficeRequest](../../models/operations/DeleteOfficeRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [Contractify.ContractifyAPI.models.operations.DeleteOfficeSecurity](../../models/operations/DeleteOfficeSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[Contractify.ContractifyAPI.models.operations.DeleteOfficeResponse](../../models/operations/DeleteOfficeResponse.md)**


## getOffice

Get information about an office

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.GetOfficeRequest;
import Contractify.ContractifyAPI.models.operations.GetOfficeResponse;
import Contractify.ContractifyAPI.models.operations.GetOfficeSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            GetOfficeRequest req = new GetOfficeRequest(368725L, 662527L);            

            GetOfficeResponse res = sdk.offices.getOffice(req, new GetOfficeSecurity("possimus", "aut") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.getOffice200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [Contractify.ContractifyAPI.models.operations.GetOfficeRequest](../../models/operations/GetOfficeRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [Contractify.ContractifyAPI.models.operations.GetOfficeSecurity](../../models/operations/GetOfficeSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[Contractify.ContractifyAPI.models.operations.GetOfficeResponse](../../models/operations/GetOfficeResponse.md)**


## listOffices

List all the offices within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListOfficesRequest;
import Contractify.ContractifyAPI.models.operations.ListOfficesResponse;
import Contractify.ContractifyAPI.models.operations.ListOfficesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListOfficesRequest req = new ListOfficesRequest(97101L);            

            ListOfficesResponse res = sdk.offices.listOffices(req, new ListOfficesSecurity("error", "temporibus") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.officeCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [Contractify.ContractifyAPI.models.operations.ListOfficesRequest](../../models/operations/ListOfficesRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [Contractify.ContractifyAPI.models.operations.ListOfficesSecurity](../../models/operations/ListOfficesSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[Contractify.ContractifyAPI.models.operations.ListOfficesResponse](../../models/operations/ListOfficesResponse.md)**


## updateOffice

Update an office

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.UpdateOfficeRequest;
import Contractify.ContractifyAPI.models.operations.UpdateOfficeResponse;
import Contractify.ContractifyAPI.models.operations.UpdateOfficeSecurity;
import Contractify.ContractifyAPI.models.shared.OfficeWrite;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            UpdateOfficeRequest req = new UpdateOfficeRequest(673660L, 96098L) {{
                officeWrite = new OfficeWrite() {{
                    bus = "1";
                    city = "Sleidinge";
                    contactPerson = "Ada Lovelace";
                    country = "Belgium";
                    email = "info@contractify.be";
                    id = 1L;
                    name = "Ghent";
                    numberIdentity = "OFF-GHENT";
                    phone = "+32 9 234 28 97";
                    street = "Polenstraat 163";
                    zip = "9940";
                }};;
            }};            

            UpdateOfficeResponse res = sdk.offices.updateOffice(req, new UpdateOfficeSecurity("reiciendis", "voluptatibus") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.updateOffice200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [Contractify.ContractifyAPI.models.operations.UpdateOfficeRequest](../../models/operations/UpdateOfficeRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [Contractify.ContractifyAPI.models.operations.UpdateOfficeSecurity](../../models/operations/UpdateOfficeSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[Contractify.ContractifyAPI.models.operations.UpdateOfficeResponse](../../models/operations/UpdateOfficeResponse.md)**

