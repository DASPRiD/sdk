/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.166
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// IdentityCredentialsOidcProvider struct for IdentityCredentialsOidcProvider
type IdentityCredentialsOidcProvider struct {
	InitialAccessToken *string `json:"initial_access_token,omitempty"`
	InitialIdToken *string `json:"initial_id_token,omitempty"`
	InitialRefreshToken *string `json:"initial_refresh_token,omitempty"`
	Provider *string `json:"provider,omitempty"`
	Subject *string `json:"subject,omitempty"`
}

// NewIdentityCredentialsOidcProvider instantiates a new IdentityCredentialsOidcProvider object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewIdentityCredentialsOidcProvider() *IdentityCredentialsOidcProvider {
	this := IdentityCredentialsOidcProvider{}
	return &this
}

// NewIdentityCredentialsOidcProviderWithDefaults instantiates a new IdentityCredentialsOidcProvider object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewIdentityCredentialsOidcProviderWithDefaults() *IdentityCredentialsOidcProvider {
	this := IdentityCredentialsOidcProvider{}
	return &this
}

// GetInitialAccessToken returns the InitialAccessToken field value if set, zero value otherwise.
func (o *IdentityCredentialsOidcProvider) GetInitialAccessToken() string {
	if o == nil || o.InitialAccessToken == nil {
		var ret string
		return ret
	}
	return *o.InitialAccessToken
}

// GetInitialAccessTokenOk returns a tuple with the InitialAccessToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentialsOidcProvider) GetInitialAccessTokenOk() (*string, bool) {
	if o == nil || o.InitialAccessToken == nil {
		return nil, false
	}
	return o.InitialAccessToken, true
}

// HasInitialAccessToken returns a boolean if a field has been set.
func (o *IdentityCredentialsOidcProvider) HasInitialAccessToken() bool {
	if o != nil && o.InitialAccessToken != nil {
		return true
	}

	return false
}

// SetInitialAccessToken gets a reference to the given string and assigns it to the InitialAccessToken field.
func (o *IdentityCredentialsOidcProvider) SetInitialAccessToken(v string) {
	o.InitialAccessToken = &v
}

// GetInitialIdToken returns the InitialIdToken field value if set, zero value otherwise.
func (o *IdentityCredentialsOidcProvider) GetInitialIdToken() string {
	if o == nil || o.InitialIdToken == nil {
		var ret string
		return ret
	}
	return *o.InitialIdToken
}

// GetInitialIdTokenOk returns a tuple with the InitialIdToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentialsOidcProvider) GetInitialIdTokenOk() (*string, bool) {
	if o == nil || o.InitialIdToken == nil {
		return nil, false
	}
	return o.InitialIdToken, true
}

// HasInitialIdToken returns a boolean if a field has been set.
func (o *IdentityCredentialsOidcProvider) HasInitialIdToken() bool {
	if o != nil && o.InitialIdToken != nil {
		return true
	}

	return false
}

// SetInitialIdToken gets a reference to the given string and assigns it to the InitialIdToken field.
func (o *IdentityCredentialsOidcProvider) SetInitialIdToken(v string) {
	o.InitialIdToken = &v
}

// GetInitialRefreshToken returns the InitialRefreshToken field value if set, zero value otherwise.
func (o *IdentityCredentialsOidcProvider) GetInitialRefreshToken() string {
	if o == nil || o.InitialRefreshToken == nil {
		var ret string
		return ret
	}
	return *o.InitialRefreshToken
}

// GetInitialRefreshTokenOk returns a tuple with the InitialRefreshToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentialsOidcProvider) GetInitialRefreshTokenOk() (*string, bool) {
	if o == nil || o.InitialRefreshToken == nil {
		return nil, false
	}
	return o.InitialRefreshToken, true
}

// HasInitialRefreshToken returns a boolean if a field has been set.
func (o *IdentityCredentialsOidcProvider) HasInitialRefreshToken() bool {
	if o != nil && o.InitialRefreshToken != nil {
		return true
	}

	return false
}

// SetInitialRefreshToken gets a reference to the given string and assigns it to the InitialRefreshToken field.
func (o *IdentityCredentialsOidcProvider) SetInitialRefreshToken(v string) {
	o.InitialRefreshToken = &v
}

// GetProvider returns the Provider field value if set, zero value otherwise.
func (o *IdentityCredentialsOidcProvider) GetProvider() string {
	if o == nil || o.Provider == nil {
		var ret string
		return ret
	}
	return *o.Provider
}

// GetProviderOk returns a tuple with the Provider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentialsOidcProvider) GetProviderOk() (*string, bool) {
	if o == nil || o.Provider == nil {
		return nil, false
	}
	return o.Provider, true
}

// HasProvider returns a boolean if a field has been set.
func (o *IdentityCredentialsOidcProvider) HasProvider() bool {
	if o != nil && o.Provider != nil {
		return true
	}

	return false
}

// SetProvider gets a reference to the given string and assigns it to the Provider field.
func (o *IdentityCredentialsOidcProvider) SetProvider(v string) {
	o.Provider = &v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *IdentityCredentialsOidcProvider) GetSubject() string {
	if o == nil || o.Subject == nil {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *IdentityCredentialsOidcProvider) GetSubjectOk() (*string, bool) {
	if o == nil || o.Subject == nil {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *IdentityCredentialsOidcProvider) HasSubject() bool {
	if o != nil && o.Subject != nil {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *IdentityCredentialsOidcProvider) SetSubject(v string) {
	o.Subject = &v
}

func (o IdentityCredentialsOidcProvider) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.InitialAccessToken != nil {
		toSerialize["initial_access_token"] = o.InitialAccessToken
	}
	if o.InitialIdToken != nil {
		toSerialize["initial_id_token"] = o.InitialIdToken
	}
	if o.InitialRefreshToken != nil {
		toSerialize["initial_refresh_token"] = o.InitialRefreshToken
	}
	if o.Provider != nil {
		toSerialize["provider"] = o.Provider
	}
	if o.Subject != nil {
		toSerialize["subject"] = o.Subject
	}
	return json.Marshal(toSerialize)
}

type NullableIdentityCredentialsOidcProvider struct {
	value *IdentityCredentialsOidcProvider
	isSet bool
}

func (v NullableIdentityCredentialsOidcProvider) Get() *IdentityCredentialsOidcProvider {
	return v.value
}

func (v *NullableIdentityCredentialsOidcProvider) Set(val *IdentityCredentialsOidcProvider) {
	v.value = val
	v.isSet = true
}

func (v NullableIdentityCredentialsOidcProvider) IsSet() bool {
	return v.isSet
}

func (v *NullableIdentityCredentialsOidcProvider) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIdentityCredentialsOidcProvider(val *IdentityCredentialsOidcProvider) *NullableIdentityCredentialsOidcProvider {
	return &NullableIdentityCredentialsOidcProvider{value: val, isSet: true}
}

func (v NullableIdentityCredentialsOidcProvider) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIdentityCredentialsOidcProvider) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


