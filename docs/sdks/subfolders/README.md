# subfolders

### Available Operations

* [listSubfolders](#listsubfolders) - List subfolders

## listSubfolders

List all the subfolders within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListSubfoldersRequest;
import Contractify.ContractifyAPI.models.operations.ListSubfoldersResponse;
import Contractify.ContractifyAPI.models.operations.ListSubfoldersSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListSubfoldersRequest req = new ListSubfoldersRequest(880476L);            

            ListSubfoldersResponse res = sdk.subfolders.listSubfolders(req, new ListSubfoldersSecurity("commodi", "repudiandae") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.dossierCollection != null) {
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
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.ListSubfoldersRequest](../../models/operations/ListSubfoldersRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.ListSubfoldersSecurity](../../models/operations/ListSubfoldersSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.ListSubfoldersResponse](../../models/operations/ListSubfoldersResponse.md)**

