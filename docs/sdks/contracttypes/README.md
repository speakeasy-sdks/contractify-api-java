# contractTypes

### Available Operations

* [listContractTypes](#listcontracttypes) - List contract types

## listContractTypes

List all the contract types within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListContractTypesRequest;
import Contractify.ContractifyAPI.models.operations.ListContractTypesResponse;
import Contractify.ContractifyAPI.models.operations.ListContractTypesSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListContractTypesRequest req = new ListContractTypesRequest(844266L);            

            ListContractTypesResponse res = sdk.contractTypes.listContractTypes(req, new ListContractTypesSecurity("unde", "nulla") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.contractTypeCollection != null) {
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
| `request`                                                                                                                      | [Contractify.ContractifyAPI.models.operations.ListContractTypesRequest](../../models/operations/ListContractTypesRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [Contractify.ContractifyAPI.models.operations.ListContractTypesSecurity](../../models/operations/ListContractTypesSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[Contractify.ContractifyAPI.models.operations.ListContractTypesResponse](../../models/operations/ListContractTypesResponse.md)**

