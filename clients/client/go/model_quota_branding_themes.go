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
)

// QuotaBrandingThemes struct for QuotaBrandingThemes
type QuotaBrandingThemes struct {
	CanAdd *bool `json:"can_add,omitempty"`
}

// NewQuotaBrandingThemes instantiates a new QuotaBrandingThemes object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewQuotaBrandingThemes() *QuotaBrandingThemes {
	this := QuotaBrandingThemes{}
	return &this
}

// NewQuotaBrandingThemesWithDefaults instantiates a new QuotaBrandingThemes object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewQuotaBrandingThemesWithDefaults() *QuotaBrandingThemes {
	this := QuotaBrandingThemes{}
	return &this
}

// GetCanAdd returns the CanAdd field value if set, zero value otherwise.
func (o *QuotaBrandingThemes) GetCanAdd() bool {
	if o == nil || o.CanAdd == nil {
		var ret bool
		return ret
	}
	return *o.CanAdd
}

// GetCanAddOk returns a tuple with the CanAdd field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *QuotaBrandingThemes) GetCanAddOk() (*bool, bool) {
	if o == nil || o.CanAdd == nil {
		return nil, false
	}
	return o.CanAdd, true
}

// HasCanAdd returns a boolean if a field has been set.
func (o *QuotaBrandingThemes) HasCanAdd() bool {
	if o != nil && o.CanAdd != nil {
		return true
	}

	return false
}

// SetCanAdd gets a reference to the given bool and assigns it to the CanAdd field.
func (o *QuotaBrandingThemes) SetCanAdd(v bool) {
	o.CanAdd = &v
}

func (o QuotaBrandingThemes) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.CanAdd != nil {
		toSerialize["can_add"] = o.CanAdd
	}
	return json.Marshal(toSerialize)
}

type NullableQuotaBrandingThemes struct {
	value *QuotaBrandingThemes
	isSet bool
}

func (v NullableQuotaBrandingThemes) Get() *QuotaBrandingThemes {
	return v.value
}

func (v *NullableQuotaBrandingThemes) Set(val *QuotaBrandingThemes) {
	v.value = val
	v.isSet = true
}

func (v NullableQuotaBrandingThemes) IsSet() bool {
	return v.isSet
}

func (v *NullableQuotaBrandingThemes) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableQuotaBrandingThemes(val *QuotaBrandingThemes) *NullableQuotaBrandingThemes {
	return &NullableQuotaBrandingThemes{value: val, isSet: true}
}

func (v NullableQuotaBrandingThemes) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableQuotaBrandingThemes) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


