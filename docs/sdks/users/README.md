# users

### Available Operations

* [currentUser](#currentuser) - Current User
* [listUsers](#listusers) - List users

## currentUser

Get the current user details

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.CurrentUserResponse;
import Contractify.ContractifyAPI.models.operations.CurrentUserSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            CurrentUserResponse res = sdk.users.currentUser(new CurrentUserSecurity("quibusdam", "explicabo") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.currentUser200ApplicationJSONObject != null) {
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
| `security`                                                                                                         | [Contractify.ContractifyAPI.models.operations.CurrentUserSecurity](../../models/operations/CurrentUserSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[Contractify.ContractifyAPI.models.operations.CurrentUserResponse](../../models/operations/CurrentUserResponse.md)**


## listUsers

List all the users within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListUsersRequest;
import Contractify.ContractifyAPI.models.operations.ListUsersResponse;
import Contractify.ContractifyAPI.models.operations.ListUsersSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListUsersRequest req = new ListUsersRequest(647174L) {{
                page = 716327L;
            }};            

            ListUsersResponse res = sdk.users.listUsers(req, new ListUsersSecurity("quibusdam", "labore") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.userCollection != null) {
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
| `request`                                                                                                      | [Contractify.ContractifyAPI.models.operations.ListUsersRequest](../../models/operations/ListUsersRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [Contractify.ContractifyAPI.models.operations.ListUsersSecurity](../../models/operations/ListUsersSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[Contractify.ContractifyAPI.models.operations.ListUsersResponse](../../models/operations/ListUsersResponse.md)**

