/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.15
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// ContainerWaitOKBody ContainerWaitOKBody OK response to ContainerWait operation
type ContainerWaitOKBody struct {
	Error ContainerWaitOKBodyError `json:"Error"`
	// Exit code of the container
	StatusCode int64 `json:"StatusCode"`
}

// NewContainerWaitOKBody instantiates a new ContainerWaitOKBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewContainerWaitOKBody(error_ ContainerWaitOKBodyError, statusCode int64) *ContainerWaitOKBody {
	this := ContainerWaitOKBody{}
	this.Error = error_
	this.StatusCode = statusCode
	return &this
}

// NewContainerWaitOKBodyWithDefaults instantiates a new ContainerWaitOKBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewContainerWaitOKBodyWithDefaults() *ContainerWaitOKBody {
	this := ContainerWaitOKBody{}
	return &this
}

// GetError returns the Error field value
func (o *ContainerWaitOKBody) GetError() ContainerWaitOKBodyError {
	if o == nil {
		var ret ContainerWaitOKBodyError
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *ContainerWaitOKBody) GetErrorOk() (*ContainerWaitOKBodyError, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *ContainerWaitOKBody) SetError(v ContainerWaitOKBodyError) {
	o.Error = v
}

// GetStatusCode returns the StatusCode field value
func (o *ContainerWaitOKBody) GetStatusCode() int64 {
	if o == nil {
		var ret int64
		return ret
	}

	return o.StatusCode
}

// GetStatusCodeOk returns a tuple with the StatusCode field value
// and a boolean to check if the value has been set.
func (o *ContainerWaitOKBody) GetStatusCodeOk() (*int64, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.StatusCode, true
}

// SetStatusCode sets field value
func (o *ContainerWaitOKBody) SetStatusCode(v int64) {
	o.StatusCode = v
}

func (o ContainerWaitOKBody) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["Error"] = o.Error
	}
	if true {
		toSerialize["StatusCode"] = o.StatusCode
	}
	return json.Marshal(toSerialize)
}

type NullableContainerWaitOKBody struct {
	value *ContainerWaitOKBody
	isSet bool
}

func (v NullableContainerWaitOKBody) Get() *ContainerWaitOKBody {
	return v.value
}

func (v *NullableContainerWaitOKBody) Set(val *ContainerWaitOKBody) {
	v.value = val
	v.isSet = true
}

func (v NullableContainerWaitOKBody) IsSet() bool {
	return v.isSet
}

func (v *NullableContainerWaitOKBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableContainerWaitOKBody(val *ContainerWaitOKBody) *NullableContainerWaitOKBody {
	return &NullableContainerWaitOKBody{value: val, isSet: true}
}

func (v NullableContainerWaitOKBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableContainerWaitOKBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


