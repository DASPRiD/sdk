/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.5
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// NormalizedProject struct for NormalizedProject
type NormalizedProject struct {
	// The Project's Creation Date
	CreatedAt time.Time `json:"created_at"`
	CurrentRevision NormalizedProjectRevision `json:"current_revision"`
	Hosts []string `json:"hosts"`
	// The project's ID.
	Id string `json:"id"`
	// The project's slug
	Slug string `json:"slug"`
	// The state of the project. running Running halted Halted
	State string `json:"state"`
	SubscriptionId NullableString `json:"subscription_id,omitempty"`
	// Last Time Project was Updated
	UpdatedAt time.Time `json:"updated_at"`
}

// NewNormalizedProject instantiates a new NormalizedProject object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNormalizedProject(createdAt time.Time, currentRevision NormalizedProjectRevision, hosts []string, id string, slug string, state string, updatedAt time.Time) *NormalizedProject {
	this := NormalizedProject{}
	this.CreatedAt = createdAt
	this.CurrentRevision = currentRevision
	this.Hosts = hosts
	this.Id = id
	this.Slug = slug
	this.State = state
	this.UpdatedAt = updatedAt
	return &this
}

// NewNormalizedProjectWithDefaults instantiates a new NormalizedProject object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNormalizedProjectWithDefaults() *NormalizedProject {
	this := NormalizedProject{}
	return &this
}

// GetCreatedAt returns the CreatedAt field value
func (o *NormalizedProject) GetCreatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *NormalizedProject) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *NormalizedProject) SetCreatedAt(v time.Time) {
	o.CreatedAt = v
}

// GetCurrentRevision returns the CurrentRevision field value
func (o *NormalizedProject) GetCurrentRevision() NormalizedProjectRevision {
	if o == nil {
		var ret NormalizedProjectRevision
		return ret
	}

	return o.CurrentRevision
}

// GetCurrentRevisionOk returns a tuple with the CurrentRevision field value
// and a boolean to check if the value has been set.
func (o *NormalizedProject) GetCurrentRevisionOk() (*NormalizedProjectRevision, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CurrentRevision, true
}

// SetCurrentRevision sets field value
func (o *NormalizedProject) SetCurrentRevision(v NormalizedProjectRevision) {
	o.CurrentRevision = v
}

// GetHosts returns the Hosts field value
func (o *NormalizedProject) GetHosts() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Hosts
}

// GetHostsOk returns a tuple with the Hosts field value
// and a boolean to check if the value has been set.
func (o *NormalizedProject) GetHostsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Hosts, true
}

// SetHosts sets field value
func (o *NormalizedProject) SetHosts(v []string) {
	o.Hosts = v
}

// GetId returns the Id field value
func (o *NormalizedProject) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *NormalizedProject) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *NormalizedProject) SetId(v string) {
	o.Id = v
}

// GetSlug returns the Slug field value
func (o *NormalizedProject) GetSlug() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Slug
}

// GetSlugOk returns a tuple with the Slug field value
// and a boolean to check if the value has been set.
func (o *NormalizedProject) GetSlugOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Slug, true
}

// SetSlug sets field value
func (o *NormalizedProject) SetSlug(v string) {
	o.Slug = v
}

// GetState returns the State field value
func (o *NormalizedProject) GetState() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.State
}

// GetStateOk returns a tuple with the State field value
// and a boolean to check if the value has been set.
func (o *NormalizedProject) GetStateOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.State, true
}

// SetState sets field value
func (o *NormalizedProject) SetState(v string) {
	o.State = v
}

// GetSubscriptionId returns the SubscriptionId field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *NormalizedProject) GetSubscriptionId() string {
	if o == nil || o.SubscriptionId.Get() == nil {
		var ret string
		return ret
	}
	return *o.SubscriptionId.Get()
}

// GetSubscriptionIdOk returns a tuple with the SubscriptionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *NormalizedProject) GetSubscriptionIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.SubscriptionId.Get(), o.SubscriptionId.IsSet()
}

// HasSubscriptionId returns a boolean if a field has been set.
func (o *NormalizedProject) HasSubscriptionId() bool {
	if o != nil && o.SubscriptionId.IsSet() {
		return true
	}

	return false
}

// SetSubscriptionId gets a reference to the given NullableString and assigns it to the SubscriptionId field.
func (o *NormalizedProject) SetSubscriptionId(v string) {
	o.SubscriptionId.Set(&v)
}
// SetSubscriptionIdNil sets the value for SubscriptionId to be an explicit nil
func (o *NormalizedProject) SetSubscriptionIdNil() {
	o.SubscriptionId.Set(nil)
}

// UnsetSubscriptionId ensures that no value is present for SubscriptionId, not even an explicit nil
func (o *NormalizedProject) UnsetSubscriptionId() {
	o.SubscriptionId.Unset()
}

// GetUpdatedAt returns the UpdatedAt field value
func (o *NormalizedProject) GetUpdatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value
// and a boolean to check if the value has been set.
func (o *NormalizedProject) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UpdatedAt, true
}

// SetUpdatedAt sets field value
func (o *NormalizedProject) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = v
}

func (o NormalizedProject) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["created_at"] = o.CreatedAt
	}
	if true {
		toSerialize["current_revision"] = o.CurrentRevision
	}
	if true {
		toSerialize["hosts"] = o.Hosts
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["slug"] = o.Slug
	}
	if true {
		toSerialize["state"] = o.State
	}
	if o.SubscriptionId.IsSet() {
		toSerialize["subscription_id"] = o.SubscriptionId.Get()
	}
	if true {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	return json.Marshal(toSerialize)
}

type NullableNormalizedProject struct {
	value *NormalizedProject
	isSet bool
}

func (v NullableNormalizedProject) Get() *NormalizedProject {
	return v.value
}

func (v *NullableNormalizedProject) Set(val *NormalizedProject) {
	v.value = val
	v.isSet = true
}

func (v NullableNormalizedProject) IsSet() bool {
	return v.isSet
}

func (v *NullableNormalizedProject) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNormalizedProject(val *NormalizedProject) *NullableNormalizedProject {
	return &NullableNormalizedProject{value: val, isSet: true}
}

func (v NullableNormalizedProject) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNormalizedProject) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


