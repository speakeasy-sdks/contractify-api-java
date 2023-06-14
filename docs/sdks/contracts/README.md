# contracts

### Available Operations

* [createContract](#createcontract) - Create a contract
* [deleteContract](#deletecontract) - Delete a contract
* [getContract](#getcontract) - Get a contract
* [listContracts](#listcontracts) - List contracts
* [updateContract](#updatecontract) - Update a contract

## createContract

Create a contract

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.CreateContractRequest;
import Contractify.ContractifyAPI.models.operations.CreateContractResponse;
import Contractify.ContractifyAPI.models.operations.CreateContractSecurity;
import Contractify.ContractifyAPI.models.shared.ContractAutomaticRenewal;
import Contractify.ContractifyAPI.models.shared.ContractPhase;
import Contractify.ContractifyAPI.models.shared.ContractRenewal;
import Contractify.ContractifyAPI.models.shared.ContractTermination;
import Contractify.ContractifyAPI.models.shared.ContractWrite;
import Contractify.ContractifyAPI.models.shared.CustomFieldValueWrite;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            CreateContractRequest req = new CreateContractRequest(544883L) {{
                contractWrite = new ContractWrite(1L, "Partnership agreement") {{
                    contractTypes = new Long[]{{
                        add(423655L),
                        add(623564L),
                        add(645894L),
                        add(384382L),
                    }};
                    customFieldValues = new Contractify.ContractifyAPI.models.shared.CustomFieldValueWrite[]{{
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "magnam";
                        }}),
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "debitis";
                        }}),
                    }};
                    departments = new Long[]{{
                        add(963663L),
                    }};
                    documents = new Long[]{{
                        add(1L),
                        add(1L),
                    }};
                    duration = "P1Y";
                    endDate = LocalDate.parse("2021-12-31");
                    isOpenEnded = false;
                    legalEntities = new Long[]{{
                        add(477665L),
                        add(791725L),
                    }};
                    offices = new Long[]{{
                        add(528895L),
                        add(479977L),
                        add(568045L),
                        add(392785L),
                    }};
                    ownerId = 1L;
                    phase = ContractPhase.ONGOING;
                    relations = new Long[]{{
                        add(836079L),
                        add(71036L),
                        add(337396L),
                        add(87129L),
                    }};
                    renewal = new ContractRenewal() {{
                        automaticRenewal = new ContractAutomaticRenewal() {{
                            numberOfRenewals = 1L;
                            renewalPeriod = "P3Y";
                        }};;
                        isAutomaticallyRenewed = false;
                    }};;
                    startDate = LocalDate.parse("2021-01-01");
                    termination = new ContractTermination() {{
                        isTerminableAtAnyTime = false;
                        terminationDate = LocalDate.parse("2021-11-30");
                        terminationDuration = "P1M";
                    }};;
                }};;
            }};            

            CreateContractResponse res = sdk.contracts.createContract(req, new CreateContractSecurity("deserunt", "perferendis") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.createContract201ApplicationJSONObject != null) {
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
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.CreateContractRequest](../../models/operations/CreateContractRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.CreateContractSecurity](../../models/operations/CreateContractSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.CreateContractResponse](../../models/operations/CreateContractResponse.md)**


## deleteContract

Delete a contract

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.DeleteContractRequest;
import Contractify.ContractifyAPI.models.operations.DeleteContractResponse;
import Contractify.ContractifyAPI.models.operations.DeleteContractSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            DeleteContractRequest req = new DeleteContractRequest(368241L, 832620L);            

            DeleteContractResponse res = sdk.contracts.deleteContract(req, new DeleteContractSecurity("sapiente", "quo") {{
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
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.DeleteContractRequest](../../models/operations/DeleteContractRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.DeleteContractSecurity](../../models/operations/DeleteContractSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.DeleteContractResponse](../../models/operations/DeleteContractResponse.md)**


## getContract

Get information about a contract

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.GetContractRequest;
import Contractify.ContractifyAPI.models.operations.GetContractResponse;
import Contractify.ContractifyAPI.models.operations.GetContractSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            GetContractRequest req = new GetContractRequest(140350L, 870013L);            

            GetContractResponse res = sdk.contracts.getContract(req, new GetContractSecurity("at", "maiores") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.getContract200ApplicationJSONObject != null) {
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
| `request`                                                                                                          | [Contractify.ContractifyAPI.models.operations.GetContractRequest](../../models/operations/GetContractRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [Contractify.ContractifyAPI.models.operations.GetContractSecurity](../../models/operations/GetContractSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[Contractify.ContractifyAPI.models.operations.GetContractResponse](../../models/operations/GetContractResponse.md)**


## listContracts

List all the contracts within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListContractsRequest;
import Contractify.ContractifyAPI.models.operations.ListContractsResponse;
import Contractify.ContractifyAPI.models.operations.ListContractsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListContractsRequest req = new ListContractsRequest(473608L) {{
                page = 799159L;
            }};            

            ListContractsResponse res = sdk.contracts.listContracts(req, new ListContractsSecurity("quod", "esse") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.contractCollection != null) {
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
| `request`                                                                                                              | [Contractify.ContractifyAPI.models.operations.ListContractsRequest](../../models/operations/ListContractsRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [Contractify.ContractifyAPI.models.operations.ListContractsSecurity](../../models/operations/ListContractsSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[Contractify.ContractifyAPI.models.operations.ListContractsResponse](../../models/operations/ListContractsResponse.md)**


## updateContract

Update a contract

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.UpdateContractRequest;
import Contractify.ContractifyAPI.models.operations.UpdateContractResponse;
import Contractify.ContractifyAPI.models.operations.UpdateContractSecurity;
import Contractify.ContractifyAPI.models.shared.ContractAutomaticRenewal;
import Contractify.ContractifyAPI.models.shared.ContractPhase;
import Contractify.ContractifyAPI.models.shared.ContractRenewal;
import Contractify.ContractifyAPI.models.shared.ContractTermination;
import Contractify.ContractifyAPI.models.shared.ContractWrite;
import Contractify.ContractifyAPI.models.shared.CustomFieldValueWrite;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            UpdateContractRequest req = new UpdateContractRequest(520478L, 780529L) {{
                contractWrite = new ContractWrite(1L, "Partnership agreement") {{
                    contractTypes = new Long[]{{
                        add(118274L),
                        add(720633L),
                        add(639921L),
                    }};
                    customFieldValues = new Contractify.ContractifyAPI.models.shared.CustomFieldValueWrite[]{{
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "fugit";
                        }}),
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "deleniti";
                        }}),
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "hic";
                        }}),
                    }};
                    departments = new Long[]{{
                        add(521848L),
                        add(105907L),
                        add(414662L),
                        add(473600L),
                    }};
                    documents = new Long[]{{
                        add(1L),
                        add(1L),
                    }};
                    duration = "P1Y";
                    endDate = LocalDate.parse("2021-12-31");
                    isOpenEnded = false;
                    legalEntities = new Long[]{{
                        add(774234L),
                    }};
                    offices = new Long[]{{
                        add(456150L),
                        add(216550L),
                        add(568434L),
                    }};
                    ownerId = 1L;
                    phase = ContractPhase.ONGOING;
                    relations = new Long[]{{
                        add(18789L),
                    }};
                    renewal = new ContractRenewal() {{
                        automaticRenewal = new ContractAutomaticRenewal() {{
                            numberOfRenewals = 1L;
                            renewalPeriod = "P3Y";
                        }};;
                        isAutomaticallyRenewed = false;
                    }};;
                    startDate = LocalDate.parse("2021-01-01");
                    termination = new ContractTermination() {{
                        isTerminableAtAnyTime = false;
                        terminationDate = LocalDate.parse("2021-11-30");
                        terminationDuration = "P1M";
                    }};;
                }};;
            }};            

            UpdateContractResponse res = sdk.contracts.updateContract(req, new UpdateContractSecurity("ad", "natus") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.updateContract200ApplicationJSONObject != null) {
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
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.UpdateContractRequest](../../models/operations/UpdateContractRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.UpdateContractSecurity](../../models/operations/UpdateContractSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.UpdateContractResponse](../../models/operations/UpdateContractResponse.md)**

