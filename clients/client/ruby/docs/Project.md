# OryClient::Project

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | The project&#39;s ID. | [readonly] |
| **name** | **String** | The name of the project. |  |
| **revision_id** | **String** | The configuration revision ID. | [readonly] |
| **services** | [**ProjectServices**](ProjectServices.md) |  |  |
| **slug** | **String** | The project&#39;s slug | [readonly] |
| **state** | **String** | The state of the project. running Running halted Halted | [readonly] |

## Example

```ruby
require 'ory-client'

instance = OryClient::Project.new(
  id: null,
  name: null,
  revision_id: null,
  services: null,
  slug: null,
  state: null
)
```

