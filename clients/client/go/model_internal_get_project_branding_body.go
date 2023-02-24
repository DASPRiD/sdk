/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.18
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// InternalGetProjectBrandingBody Get Project Branding Request Body
type InternalGetProjectBrandingBody struct {
	Hostname *string `json:"hostname,omitempty"`
}

// NewInternalGetProjectBrandingBody instantiates a new InternalGetProjectBrandingBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInternalGetProjectBrandingBody() *InternalGetProjectBrandingBody {
	this := InternalGetProjectBrandingBody{}
	return &this
}

// NewInternalGetProjectBrandingBodyWithDefaults instantiates a new InternalGetProjectBrandingBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInternalGetProjectBrandingBodyWithDefaults() *InternalGetProjectBrandingBody {
	this := InternalGetProjectBrandingBody{}
	return &this
}

// GetHostname returns the Hostname field value if set, zero value otherwise.
func (o *InternalGetProjectBrandingBody) GetHostname() string {
	if o == nil || o.Hostname == nil {
		var ret string
		return ret
	}
	return *o.Hostname
}

// GetHostnameOk returns a tuple with the Hostname field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InternalGetProjectBrandingBody) GetHostnameOk() (*string, bool) {
	if o == nil || o.Hostname == nil {
		return nil, false
	}
	return o.Hostname, true
}

// HasHostname returns a boolean if a field has been set.
func (o *InternalGetProjectBrandingBody) HasHostname() bool {
	if o != nil && o.Hostname != nil {
		return true
	}

	return false
}

// SetHostname gets a reference to the given string and assigns it to the Hostname field.
func (o *InternalGetProjectBrandingBody) SetHostname(v string) {
	o.Hostname = &v
}

func (o InternalGetProjectBrandingBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Hostname != nil {
		toSerialize["hostname"] = o.Hostname
	}
	return json.Marshal(toSerialize)
}

type NullableInternalGetProjectBrandingBody struct {
	value *InternalGetProjectBrandingBody
	isSet bool
}

func (v NullableInternalGetProjectBrandingBody) Get() *InternalGetProjectBrandingBody {
	return v.value
}

func (v *NullableInternalGetProjectBrandingBody) Set(val *InternalGetProjectBrandingBody) {
	v.value = val
	v.isSet = true
}

func (v NullableInternalGetProjectBrandingBody) IsSet() bool {
	return v.isSet
}

func (v *NullableInternalGetProjectBrandingBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInternalGetProjectBrandingBody(val *InternalGetProjectBrandingBody) *NullableInternalGetProjectBrandingBody {
	return &NullableInternalGetProjectBrandingBody{value: val, isSet: true}
}

func (v NullableInternalGetProjectBrandingBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInternalGetProjectBrandingBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

