# departments

### Available Operations

* [createDepartment](#createdepartment) - Create a department
* [deleteDepartment](#deletedepartment) - Delete a department
* [getDepartment](#getdepartment) - Get a department
* [listDepartments](#listdepartments) - List departments
* [updateDepartment](#updatedepartment) - Update a department

## createDepartment

Create a department

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.CreateDepartmentRequest;
import Contractify.ContractifyAPI.models.operations.CreateDepartmentResponse;
import Contractify.ContractifyAPI.models.operations.CreateDepartmentSecurity;
import Contractify.ContractifyAPI.models.shared.DepartmentWrite;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            CreateDepartmentRequest req = new CreateDepartmentRequest(616934L) {{
                departmentWrite = new DepartmentWrite() {{
                    name = "Sales";
                }};;
            }};            

            CreateDepartmentResponse res = sdk.departments.createDepartment(req, new CreateDepartmentSecurity("laboriosam", "hic") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.createDepartment201ApplicationJSONObject != null) {
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
| `request`                                                                                                                    | [Contractify.ContractifyAPI.models.operations.CreateDepartmentRequest](../../models/operations/CreateDepartmentRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [Contractify.ContractifyAPI.models.operations.CreateDepartmentSecurity](../../models/operations/CreateDepartmentSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[Contractify.ContractifyAPI.models.operations.CreateDepartmentResponse](../../models/operations/CreateDepartmentResponse.md)**


## deleteDepartment

Delete a department

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.DeleteDepartmentRequest;
import Contractify.ContractifyAPI.models.operations.DeleteDepartmentResponse;
import Contractify.ContractifyAPI.models.operations.DeleteDepartmentSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            DeleteDepartmentRequest req = new DeleteDepartmentRequest(902599L, 681820L);            

            DeleteDepartmentResponse res = sdk.departments.deleteDepartment(req, new DeleteDepartmentSecurity("in", "corporis") {{
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

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [Contractify.ContractifyAPI.models.operations.DeleteDepartmentRequest](../../models/operations/DeleteDepartmentRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [Contractify.ContractifyAPI.models.operations.DeleteDepartmentSecurity](../../models/operations/DeleteDepartmentSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[Contractify.ContractifyAPI.models.operations.DeleteDepartmentResponse](../../models/operations/DeleteDepartmentResponse.md)**


## getDepartment

Get information about a department

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.GetDepartmentRequest;
import Contractify.ContractifyAPI.models.operations.GetDepartmentResponse;
import Contractify.ContractifyAPI.models.operations.GetDepartmentSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            GetDepartmentRequest req = new GetDepartmentRequest(613064L, 437032L);            

            GetDepartmentResponse res = sdk.departments.getDepartment(req, new GetDepartmentSecurity("saepe", "quidem") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.getDepartment200ApplicationJSONObject != null) {
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
| `request`                                                                                                              | [Contractify.ContractifyAPI.models.operations.GetDepartmentRequest](../../models/operations/GetDepartmentRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [Contractify.ContractifyAPI.models.operations.GetDepartmentSecurity](../../models/operations/GetDepartmentSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[Contractify.ContractifyAPI.models.operations.GetDepartmentResponse](../../models/operations/GetDepartmentResponse.md)**


## listDepartments

List all the departments within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListDepartmentsRequest;
import Contractify.ContractifyAPI.models.operations.ListDepartmentsResponse;
import Contractify.ContractifyAPI.models.operations.ListDepartmentsSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListDepartmentsRequest req = new ListDepartmentsRequest(99280L);            

            ListDepartmentsResponse res = sdk.departments.listDepartments(req, new ListDepartmentsSecurity("ipsa", "reiciendis") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.departmentCollection != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [Contractify.ContractifyAPI.models.operations.ListDepartmentsRequest](../../models/operations/ListDepartmentsRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [Contractify.ContractifyAPI.models.operations.ListDepartmentsSecurity](../../models/operations/ListDepartmentsSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[Contractify.ContractifyAPI.models.operations.ListDepartmentsResponse](../../models/operations/ListDepartmentsResponse.md)**


## updateDepartment

Update a department

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.UpdateDepartmentRequest;
import Contractify.ContractifyAPI.models.operations.UpdateDepartmentResponse;
import Contractify.ContractifyAPI.models.operations.UpdateDepartmentSecurity;
import Contractify.ContractifyAPI.models.shared.DepartmentWrite;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            UpdateDepartmentRequest req = new UpdateDepartmentRequest(666767L, 653140L) {{
                departmentWrite = new DepartmentWrite() {{
                    name = "Sales";
                }};;
            }};            

            UpdateDepartmentResponse res = sdk.departments.updateDepartment(req, new UpdateDepartmentSecurity("laborum", "dolores") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.updateDepartment200ApplicationJSONObject != null) {
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
| `request`                                                                                                                    | [Contractify.ContractifyAPI.models.operations.UpdateDepartmentRequest](../../models/operations/UpdateDepartmentRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [Contractify.ContractifyAPI.models.operations.UpdateDepartmentSecurity](../../models/operations/UpdateDepartmentSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[Contractify.ContractifyAPI.models.operations.UpdateDepartmentResponse](../../models/operations/UpdateDepartmentResponse.md)**

