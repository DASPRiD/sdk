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
	"time"
)

// RecoveryLink struct for RecoveryLink
type RecoveryLink struct {
	// Recovery Link Expires At  The timestamp when the recovery link expires.
	ExpiresAt *time.Time `json:"expires_at,omitempty"`
	// Recovery Link  This link can be used to recover the account.
	RecoveryLink string `json:"recovery_link"`
}

// NewRecoveryLink instantiates a new RecoveryLink object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRecoveryLink(recoveryLink string) *RecoveryLink {
	this := RecoveryLink{}
	this.RecoveryLink = recoveryLink
	return &this
}

// NewRecoveryLinkWithDefaults instantiates a new RecoveryLink object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRecoveryLinkWithDefaults() *RecoveryLink {
	this := RecoveryLink{}
	return &this
}

// GetExpiresAt returns the ExpiresAt field value if set, zero value otherwise.
func (o *RecoveryLink) GetExpiresAt() time.Time {
	if o == nil || o.ExpiresAt == nil {
		var ret time.Time
		return ret
	}
	return *o.ExpiresAt
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecoveryLink) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil || o.ExpiresAt == nil {
		return nil, false
	}
	return o.ExpiresAt, true
}

// HasExpiresAt returns a boolean if a field has been set.
func (o *RecoveryLink) HasExpiresAt() bool {
	if o != nil && o.ExpiresAt != nil {
		return true
	}

	return false
}

// SetExpiresAt gets a reference to the given time.Time and assigns it to the ExpiresAt field.
func (o *RecoveryLink) SetExpiresAt(v time.Time) {
	o.ExpiresAt = &v
}

// GetRecoveryLink returns the RecoveryLink field value
func (o *RecoveryLink) GetRecoveryLink() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RecoveryLink
}

// GetRecoveryLinkOk returns a tuple with the RecoveryLink field value
// and a boolean to check if the value has been set.
func (o *RecoveryLink) GetRecoveryLinkOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.RecoveryLink, true
}

// SetRecoveryLink sets field value
func (o *RecoveryLink) SetRecoveryLink(v string) {
	o.RecoveryLink = v
}

func (o RecoveryLink) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ExpiresAt != nil {
		toSerialize["expires_at"] = o.ExpiresAt
	}
	if true {
		toSerialize["recovery_link"] = o.RecoveryLink
	}
	return json.Marshal(toSerialize)
}

type NullableRecoveryLink struct {
	value *RecoveryLink
	isSet bool
}

func (v NullableRecoveryLink) Get() *RecoveryLink {
	return v.value
}

func (v *NullableRecoveryLink) Set(val *RecoveryLink) {
	v.value = val
	v.isSet = true
}

func (v NullableRecoveryLink) IsSet() bool {
	return v.isSet
}

func (v *NullableRecoveryLink) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRecoveryLink(val *RecoveryLink) *NullableRecoveryLink {
	return &NullableRecoveryLink{value: val, isSet: true}
}

func (v NullableRecoveryLink) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRecoveryLink) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


