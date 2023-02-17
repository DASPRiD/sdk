/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.15
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// IdentitySchemaContainer An Identity JSON Schema Container
type IdentitySchemaContainer struct {
	// The ID of the Identity JSON Schema
	Id *string `json:"id,omitempty"`
	// Raw JSON Schema
	Schema map[string]interface{} `json:"schema,omitempty"`
}

// NewIdentitySchemaContainer instantiates a new IdentitySchemaContainer object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIdentitySchemaContainer() *IdentitySchemaContainer {
	this := IdentitySchemaContainer{}
	return &this
}

// NewIdentitySchemaContainerWithDefaults instantiates a new IdentitySchemaContainer object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIdentitySchemaContainerWithDefaults() *IdentitySchemaContainer {
	this := IdentitySchemaContainer{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *IdentitySchemaContainer) GetId() string {
	if o == nil || o.Id == nil {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentitySchemaContainer) GetIdOk() (*string, bool) {
	if o == nil || o.Id == nil {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *IdentitySchemaContainer) HasId() bool {
	if o != nil && o.Id != nil {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *IdentitySchemaContainer) SetId(v string) {
	o.Id = &v
}

// GetSchema returns the Schema field value if set, zero value otherwise.
func (o *IdentitySchemaContainer) GetSchema() map[string]interface{} {
	if o == nil || o.Schema == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Schema
}

// GetSchemaOk returns a tuple with the Schema field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentitySchemaContainer) GetSchemaOk() (map[string]interface{}, bool) {
	if o == nil || o.Schema == nil {
		return nil, false
	}
	return o.Schema, true
}

// HasSchema returns a boolean if a field has been set.
func (o *IdentitySchemaContainer) HasSchema() bool {
	if o != nil && o.Schema != nil {
		return true
	}

	return false
}

// SetSchema gets a reference to the given map[string]interface{} and assigns it to the Schema field.
func (o *IdentitySchemaContainer) SetSchema(v map[string]interface{}) {
	o.Schema = v
}

func (o IdentitySchemaContainer) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Id != nil {
		toSerialize["id"] = o.Id
	}
	if o.Schema != nil {
		toSerialize["schema"] = o.Schema
	}
	return json.Marshal(toSerialize)
}

type NullableIdentitySchemaContainer struct {
	value *IdentitySchemaContainer
	isSet bool
}

func (v NullableIdentitySchemaContainer) Get() *IdentitySchemaContainer {
	return v.value
}

func (v *NullableIdentitySchemaContainer) Set(val *IdentitySchemaContainer) {
	v.value = val
	v.isSet = true
}

func (v NullableIdentitySchemaContainer) IsSet() bool {
	return v.isSet
}

func (v *NullableIdentitySchemaContainer) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIdentitySchemaContainer(val *IdentitySchemaContainer) *NullableIdentitySchemaContainer {
	return &NullableIdentitySchemaContainer{value: val, isSet: true}
}

func (v NullableIdentitySchemaContainer) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIdentitySchemaContainer) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


