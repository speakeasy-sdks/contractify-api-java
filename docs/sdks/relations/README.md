# relations

### Available Operations

* [createRelation](#createrelation) - Create a relation
* [deleteRelation](#deleterelation) - Delete a relation
* [getRelation](#getrelation) - Get a relation
* [listRelations](#listrelations) - List relations
* [updateRelation](#updaterelation) - Update a relation

## createRelation

Create a relation

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.CreateRelationRequest;
import Contractify.ContractifyAPI.models.operations.CreateRelationResponse;
import Contractify.ContractifyAPI.models.operations.CreateRelationSecurity;
import Contractify.ContractifyAPI.models.shared.Address;
import Contractify.ContractifyAPI.models.shared.RelationWrite;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            CreateRelationRequest req = new CreateRelationRequest(878194L) {{
                relationWrite = new RelationWrite("Sherlock Holmes Detective Services") {{
                    address = new Address() {{
                        addressLine1 = "221B Baker Street";
                        addressLine2 = "Marylebone";
                        city = "London";
                        country = "United Kingdom";
                        postalCode = "NW1 6XE";
                    }};;
                    email = "sherlock@example.org";
                    fax = "+3211324354";
                    mobilePhone = "+23477123456";
                    phone = "+23477123456";
                    reference = "REF123";
                    vat = "BE12345678";
                    website = "https://www.example.org";
                }};;
            }};            

            CreateRelationResponse res = sdk.relations.createRelation(req, new CreateRelationSecurity("nihil", "praesentium") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.createRelation201ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.CreateRelationRequest](../../models/operations/CreateRelationRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.CreateRelationSecurity](../../models/operations/CreateRelationSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.CreateRelationResponse](../../models/operations/CreateRelationResponse.md)**


## deleteRelation

Delete a relation

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.DeleteRelationRequest;
import Contractify.ContractifyAPI.models.operations.DeleteRelationResponse;
import Contractify.ContractifyAPI.models.operations.DeleteRelationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            DeleteRelationRequest req = new DeleteRelationRequest(976762L, 55714L);            

            DeleteRelationResponse res = sdk.relations.deleteRelation(req, new DeleteRelationSecurity("omnis", "voluptate") {{
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.DeleteRelationRequest](../../models/operations/DeleteRelationRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.DeleteRelationSecurity](../../models/operations/DeleteRelationSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.DeleteRelationResponse](../../models/operations/DeleteRelationResponse.md)**


## getRelation

Get information about a relation

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.GetRelationRequest;
import Contractify.ContractifyAPI.models.operations.GetRelationResponse;
import Contractify.ContractifyAPI.models.operations.GetRelationSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            GetRelationRequest req = new GetRelationRequest(739264L, 19987L);            

            GetRelationResponse res = sdk.relations.getRelation(req, new GetRelationSecurity("doloremque", "reprehenderit") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.getRelation200ApplicationJSONObject != null) {
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
| `request`                                                                                                          | [Contractify.ContractifyAPI.models.operations.GetRelationRequest](../../models/operations/GetRelationRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [Contractify.ContractifyAPI.models.operations.GetRelationSecurity](../../models/operations/GetRelationSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[Contractify.ContractifyAPI.models.operations.GetRelationResponse](../../models/operations/GetRelationResponse.md)**


## listRelations

List all the relations within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListRelationsRequest;
import Contractify.ContractifyAPI.models.operations.ListRelationsResponse;
import Contractify.ContractifyAPI.models.operations.ListRelationsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListRelationsRequest req = new ListRelationsRequest(282807L) {{
                page = 979587L;
                reference = "dicta";
            }};            

            ListRelationsResponse res = sdk.relations.listRelations(req, new ListRelationsSecurity("corporis", "dolore") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.relationCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [Contractify.ContractifyAPI.models.operations.ListRelationsRequest](../../models/operations/ListRelationsRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [Contractify.ContractifyAPI.models.operations.ListRelationsSecurity](../../models/operations/ListRelationsSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[Contractify.ContractifyAPI.models.operations.ListRelationsResponse](../../models/operations/ListRelationsResponse.md)**


## updateRelation

Update a relation

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.UpdateRelationRequest;
import Contractify.ContractifyAPI.models.operations.UpdateRelationResponse;
import Contractify.ContractifyAPI.models.operations.UpdateRelationSecurity;
import Contractify.ContractifyAPI.models.shared.Address;
import Contractify.ContractifyAPI.models.shared.RelationWrite;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            UpdateRelationRequest req = new UpdateRelationRequest(480894L, 118727L) {{
                relationWrite = new RelationWrite("Sherlock Holmes Detective Services") {{
                    address = new Address() {{
                        addressLine1 = "221B Baker Street";
                        addressLine2 = "Marylebone";
                        city = "London";
                        country = "United Kingdom";
                        postalCode = "NW1 6XE";
                    }};;
                    email = "sherlock@example.org";
                    fax = "+3211324354";
                    mobilePhone = "+23477123456";
                    phone = "+23477123456";
                    reference = "REF123";
                    vat = "BE12345678";
                    website = "https://www.example.org";
                }};;
            }};            

            UpdateRelationResponse res = sdk.relations.updateRelation(req, new UpdateRelationSecurity("harum", "enim") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.updateRelation200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.UpdateRelationRequest](../../models/operations/UpdateRelationRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.UpdateRelationSecurity](../../models/operations/UpdateRelationSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.UpdateRelationResponse](../../models/operations/UpdateRelationResponse.md)**

