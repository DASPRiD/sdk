# CustomDomainQuota

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvailableDomains** | Pointer to **int64** |  | [optional] 
**CanUse** | Pointer to **bool** |  | [optional] 
**UsedDomains** | Pointer to **int64** |  | [optional] 

## Methods

### NewCustomDomainQuota

`func NewCustomDomainQuota() *CustomDomainQuota`

NewCustomDomainQuota instantiates a new CustomDomainQuota object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCustomDomainQuotaWithDefaults

`func NewCustomDomainQuotaWithDefaults() *CustomDomainQuota`

NewCustomDomainQuotaWithDefaults instantiates a new CustomDomainQuota object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvailableDomains

`func (o *CustomDomainQuota) GetAvailableDomains() int64`

GetAvailableDomains returns the AvailableDomains field if non-nil, zero value otherwise.

### GetAvailableDomainsOk

`func (o *CustomDomainQuota) GetAvailableDomainsOk() (*int64, bool)`

GetAvailableDomainsOk returns a tuple with the AvailableDomains field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvailableDomains

`func (o *CustomDomainQuota) SetAvailableDomains(v int64)`

SetAvailableDomains sets AvailableDomains field to given value.

### HasAvailableDomains

`func (o *CustomDomainQuota) HasAvailableDomains() bool`

HasAvailableDomains returns a boolean if a field has been set.

### GetCanUse

`func (o *CustomDomainQuota) GetCanUse() bool`

GetCanUse returns the CanUse field if non-nil, zero value otherwise.

### GetCanUseOk

`func (o *CustomDomainQuota) GetCanUseOk() (*bool, bool)`

GetCanUseOk returns a tuple with the CanUse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCanUse

`func (o *CustomDomainQuota) SetCanUse(v bool)`

SetCanUse sets CanUse field to given value.

### HasCanUse

`func (o *CustomDomainQuota) HasCanUse() bool`

HasCanUse returns a boolean if a field has been set.

### GetUsedDomains

`func (o *CustomDomainQuota) GetUsedDomains() int64`

GetUsedDomains returns the UsedDomains field if non-nil, zero value otherwise.

### GetUsedDomainsOk

`func (o *CustomDomainQuota) GetUsedDomainsOk() (*int64, bool)`

GetUsedDomainsOk returns a tuple with the UsedDomains field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsedDomains

`func (o *CustomDomainQuota) SetUsedDomains(v int64)`

SetUsedDomains sets UsedDomains field to given value.

### HasUsedDomains

`func (o *CustomDomainQuota) HasUsedDomains() bool`

HasUsedDomains returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


