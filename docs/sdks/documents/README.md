# documents

### Available Operations

* [deleteDocument](#deletedocument) - Delete a document
* [getDocument](#getdocument) - Get a document
* [listDocuments](#listdocuments) - List documents
* [updateDocument](#updatedocument) - Update a document

## deleteDocument

Delete a document

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.DeleteDocumentRequest;
import Contractify.ContractifyAPI.models.operations.DeleteDocumentResponse;
import Contractify.ContractifyAPI.models.operations.DeleteDocumentSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            DeleteDocumentRequest req = new DeleteDocumentRequest(210382L, 358152L);            

            DeleteDocumentResponse res = sdk.documents.deleteDocument(req, new DeleteDocumentSecurity("explicabo", "nobis") {{
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
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.DeleteDocumentRequest](../../models/operations/DeleteDocumentRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.DeleteDocumentSecurity](../../models/operations/DeleteDocumentSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.DeleteDocumentResponse](../../models/operations/DeleteDocumentResponse.md)**


## getDocument

Get information about a document

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.GetDocumentRequest;
import Contractify.ContractifyAPI.models.operations.GetDocumentResponse;
import Contractify.ContractifyAPI.models.operations.GetDocumentSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            GetDocumentRequest req = new GetDocumentRequest(315428L, 607831L);            

            GetDocumentResponse res = sdk.documents.getDocument(req, new GetDocumentSecurity("nemo", "minima") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.getDocument200ApplicationJSONObject != null) {
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
| `request`                                                                                                          | [Contractify.ContractifyAPI.models.operations.GetDocumentRequest](../../models/operations/GetDocumentRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [Contractify.ContractifyAPI.models.operations.GetDocumentSecurity](../../models/operations/GetDocumentSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[Contractify.ContractifyAPI.models.operations.GetDocumentResponse](../../models/operations/GetDocumentResponse.md)**


## listDocuments

List all the documents within a company

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.ListDocumentsEsigningStatus;
import Contractify.ContractifyAPI.models.operations.ListDocumentsRequest;
import Contractify.ContractifyAPI.models.operations.ListDocumentsResponse;
import Contractify.ContractifyAPI.models.operations.ListDocumentsSecurity;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            ListDocumentsRequest req = new ListDocumentsRequest(570197L) {{
                esigningStatus = ListDocumentsEsigningStatus.NOT_SENT;
                esigningUpdatedAfter = OffsetDateTime.parse("2022-05-14T11:45:33.094Z");
                page = 988374L;
                relationId = 958950L;
                signedAfter = OffsetDateTime.parse("2022-05-07T17:33:24.154Z");
            }};            

            ListDocumentsResponse res = sdk.documents.listDocuments(req, new ListDocumentsSecurity("dolorem", "culpa") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.documentCollection != null) {
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
| `request`                                                                                                              | [Contractify.ContractifyAPI.models.operations.ListDocumentsRequest](../../models/operations/ListDocumentsRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [Contractify.ContractifyAPI.models.operations.ListDocumentsSecurity](../../models/operations/ListDocumentsSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[Contractify.ContractifyAPI.models.operations.ListDocumentsResponse](../../models/operations/ListDocumentsResponse.md)**


## updateDocument

Update a document

### Example Usage

```java
package hello.world;

import Contractify.ContractifyAPI.ContractifyProduction;
import Contractify.ContractifyAPI.models.operations.UpdateDocumentRequest;
import Contractify.ContractifyAPI.models.operations.UpdateDocumentResponse;
import Contractify.ContractifyAPI.models.operations.UpdateDocumentSecurity;
import Contractify.ContractifyAPI.models.shared.CustomFieldValueWrite;
import Contractify.ContractifyAPI.models.shared.DocumentWrite;

public class Application {
    public static void main(String[] args) {
        try {
            ContractifyProduction sdk = ContractifyProduction.builder()
                .build();

            UpdateDocumentRequest req = new UpdateDocumentRequest(161309L, 995300L) {{
                documentWrite = new DocumentWrite("filename.pdf") {{
                    contracts = new Long[]{{
                        add(1L),
                        add(1L),
                        add(1L),
                    }};
                    customFieldValues = new Contractify.ContractifyAPI.models.shared.CustomFieldValueWrite[]{{
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "numquam";
                        }}),
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "commodi";
                        }}),
                        add(new CustomFieldValueWrite() {{
                            customFieldId = 2L;
                            value = "quam";
                        }}),
                    }};
                    description = "Lorem ipsum dolor sit amet.";
                    dossiers = new Long[]{{
                        add(1L),
                        add(1L),
                    }};
                    ownerId = 1L;
                }};;
            }};            

            UpdateDocumentResponse res = sdk.documents.updateDocument(req, new UpdateDocumentSecurity("velit", "error") {{
                oAuth2 = "";
                personalAccessToken = "";
            }});

            if (res.updateDocument200ApplicationJSONObject != null) {
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
| `request`                                                                                                                | [Contractify.ContractifyAPI.models.operations.UpdateDocumentRequest](../../models/operations/UpdateDocumentRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [Contractify.ContractifyAPI.models.operations.UpdateDocumentSecurity](../../models/operations/UpdateDocumentSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[Contractify.ContractifyAPI.models.operations.UpdateDocumentResponse](../../models/operations/UpdateDocumentResponse.md)**

