# customFields

### Available Operations

* [listCustomFields](#listcustomfields) - List custom fields

## listCustomFields

List all the custom fields within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListCustomFieldsRequest;
import Contractify.ContractifyAPI.models.operations.ListCustomFieldsResponse;
import Contractify.ContractifyAPI.models.operations.ListCustomFieldsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListCustomFieldsRequest req = new ListCustomFieldsRequest(149675L);            

            ListCustomFieldsResponse res = sdk.customFields.listCustomFields(req, new ListCustomFieldsSecurity("iste", "dolor") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.customFieldCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [Contractify.ContractifyAPI.models.operations.ListCustomFieldsRequest](../../models/operations/ListCustomFieldsRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [Contractify.ContractifyAPI.models.operations.ListCustomFieldsSecurity](../../models/operations/ListCustomFieldsSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[Contractify.ContractifyAPI.models.operations.ListCustomFieldsResponse](../../models/operations/ListCustomFieldsResponse.md)**

