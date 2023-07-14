<!-- Start SDK Example Usage -->


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

            ListContractTypesRequest req = new ListContractTypesRequest(548814L);            

            ListContractTypesResponse res = sdk.contractTypes.listContractTypes(req, new ListContractTypesSecurity("provident", "distinctio") {{
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
<!-- End SDK Example Usage -->