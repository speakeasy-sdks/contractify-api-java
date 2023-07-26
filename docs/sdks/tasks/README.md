# tasks

### Available Operations

* [createTask](#createtask) - Create a task
* [deleteTask](#deletetask) - Delete a task
* [getTask](#gettask) - Get a task
* [listTasks](#listtasks) - List tasks
* [updateTask](#updatetask) - Update a task

## createTask

Create a task

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.CreateTaskRequest;
import Contractify.ContractifyAPI.models.operations.CreateTaskResponse;
import Contractify.ContractifyAPI.models.operations.CreateTaskSecurity;
import Contractify.ContractifyAPI.models.shared.TaskWrite;
import Contractify.ContractifyAPI.models.shared.TaskWriteDueDateDependsOn;
import Contractify.ContractifyAPI.models.shared.TaskWriteStatus;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            CreateTaskRequest req = new CreateTaskRequest(64147L) {{
                taskWrite = new TaskWrite() {{
                    contractId = 1L;
                    description = "Lorem ipsum dolor sit amet.";
                    dueDate = LocalDate.parse("2021-12-31");
                    dueDateDependsOn = TaskWriteDueDateDependsOn.END_DATE;
                    dueDateInterval = "-P10D";
                    ownerId = 1L;
                    reminderDuration = "P1M";
                    repetitionInterval = "P1Y";
                    status = TaskWriteStatus.ACCOMPLISHED;
                    title = "My task";
                }};;
            }};            

            CreateTaskResponse res = sdk.tasks.createTask(req, new CreateTaskSecurity("ipsum", "quidem") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.createTask200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [Contractify.ContractifyAPI.models.operations.CreateTaskRequest](../../models/operations/CreateTaskRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [Contractify.ContractifyAPI.models.operations.CreateTaskSecurity](../../models/operations/CreateTaskSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[Contractify.ContractifyAPI.models.operations.CreateTaskResponse](../../models/operations/CreateTaskResponse.md)**


## deleteTask

Delete a task

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.DeleteTaskRequest;
import Contractify.ContractifyAPI.models.operations.DeleteTaskResponse;
import Contractify.ContractifyAPI.models.operations.DeleteTaskSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            DeleteTaskRequest req = new DeleteTaskRequest(565189L, 566602L);            

            DeleteTaskResponse res = sdk.tasks.deleteTask(req, new DeleteTaskSecurity("pariatur", "modi") {{
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [Contractify.ContractifyAPI.models.operations.DeleteTaskRequest](../../models/operations/DeleteTaskRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [Contractify.ContractifyAPI.models.operations.DeleteTaskSecurity](../../models/operations/DeleteTaskSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[Contractify.ContractifyAPI.models.operations.DeleteTaskResponse](../../models/operations/DeleteTaskResponse.md)**


## getTask

Get a task

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.GetTaskRequest;
import Contractify.ContractifyAPI.models.operations.GetTaskResponse;
import Contractify.ContractifyAPI.models.operations.GetTaskSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            GetTaskRequest req = new GetTaskRequest(508969L, 523248L);            

            GetTaskResponse res = sdk.tasks.getTask(req, new GetTaskSecurity("voluptates", "quasi") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.getTask200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [Contractify.ContractifyAPI.models.operations.GetTaskRequest](../../models/operations/GetTaskRequest.md)   | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [Contractify.ContractifyAPI.models.operations.GetTaskSecurity](../../models/operations/GetTaskSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[Contractify.ContractifyAPI.models.operations.GetTaskResponse](../../models/operations/GetTaskResponse.md)**


## listTasks

List all tasks within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListTasksRequest;
import Contractify.ContractifyAPI.models.operations.ListTasksResponse;
import Contractify.ContractifyAPI.models.operations.ListTasksSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListTasksRequest req = new ListTasksRequest(921158L) {{
                page = 575947L;
            }};            

            ListTasksResponse res = sdk.tasks.listTasks(req, new ListTasksSecurity("veritatis", "itaque") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.taskCollection != null) {
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
| `request`                                                                                                      | [Contractify.ContractifyAPI.models.operations.ListTasksRequest](../../models/operations/ListTasksRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [Contractify.ContractifyAPI.models.operations.ListTasksSecurity](../../models/operations/ListTasksSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[Contractify.ContractifyAPI.models.operations.ListTasksResponse](../../models/operations/ListTasksResponse.md)**


## updateTask

Update a task

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.UpdateTaskRequest;
import Contractify.ContractifyAPI.models.operations.UpdateTaskResponse;
import Contractify.ContractifyAPI.models.operations.UpdateTaskSecurity;
import Contractify.ContractifyAPI.models.shared.TaskUpdate;
import Contractify.ContractifyAPI.models.shared.TaskUpdateDueDateDependsOn;
import Contractify.ContractifyAPI.models.shared.TaskUpdateStatus;
import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            UpdateTaskRequest req = new UpdateTaskRequest(277718L, 318569L) {{
                taskUpdate = new TaskUpdate() {{
                    description = "Lorem ipsum dolor sit amet.";
                    dueDate = LocalDate.parse("2021-12-31");
                    dueDateDependsOn = TaskUpdateDueDateDependsOn.END_DATE;
                    dueDateInterval = "-P10D";
                    ownerId = 1L;
                    reminderDuration = "P1M";
                    repetitionInterval = "P1Y";
                    status = TaskUpdateStatus.ACCOMPLISHED;
                    title = "My task";
                }};;
            }};            

            UpdateTaskResponse res = sdk.tasks.updateTask(req, new UpdateTaskSecurity("consequatur", "est") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.updateTask200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [Contractify.ContractifyAPI.models.operations.UpdateTaskRequest](../../models/operations/UpdateTaskRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [Contractify.ContractifyAPI.models.operations.UpdateTaskSecurity](../../models/operations/UpdateTaskSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[Contractify.ContractifyAPI.models.operations.UpdateTaskResponse](../../models/operations/UpdateTaskResponse.md)**

