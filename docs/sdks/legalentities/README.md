# legalEntities

### Available Operations

* [listLegalEntities](#listlegalentities) - List legal entities

## listLegalEntities

List all the legal entities within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListLegalEntitiesRequest;
import Contractify.ContractifyAPI.models.operations.ListLegalEntitiesResponse;
import Contractify.ContractifyAPI.models.operations.ListLegalEntitiesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListLegalEntitiesRequest req = new ListLegalEntitiesRequest(158969L);            

            ListLegalEntitiesResponse res = sdk.legalEntities.listLegalEntities(req, new ListLegalEntitiesSecurity("quis", "vitae") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.legalEntityCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [Contractify.ContractifyAPI.models.operations.ListLegalEntitiesRequest](../../models/operations/ListLegalEntitiesRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [Contractify.ContractifyAPI.models.operations.ListLegalEntitiesSecurity](../../models/operations/ListLegalEntitiesSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[Contractify.ContractifyAPI.models.operations.ListLegalEntitiesResponse](../../models/operations/ListLegalEntitiesResponse.md)**

