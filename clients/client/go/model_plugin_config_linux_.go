/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.19
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// PluginConfigLinux PluginConfigLinux plugin config linux
type PluginConfigLinux struct {
	// allow all devices
	AllowAllDevices bool `json:"AllowAllDevices"`
	// capabilities
	Capabilities []string `json:"Capabilities"`
	// devices
	Devices []PluginDevice `json:"Devices"`
}

// NewPluginConfigLinux instantiates a new PluginConfigLinux object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPluginConfigLinux(allowAllDevices bool, capabilities []string, devices []PluginDevice) *PluginConfigLinux {
	this := PluginConfigLinux{}
	this.AllowAllDevices = allowAllDevices
	this.Capabilities = capabilities
	this.Devices = devices
	return &this
}

// NewPluginConfigLinuxWithDefaults instantiates a new PluginConfigLinux object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPluginConfigLinuxWithDefaults() *PluginConfigLinux {
	this := PluginConfigLinux{}
	return &this
}

// GetAllowAllDevices returns the AllowAllDevices field value
func (o *PluginConfigLinux) GetAllowAllDevices() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.AllowAllDevices
}

// GetAllowAllDevicesOk returns a tuple with the AllowAllDevices field value
// and a boolean to check if the value has been set.
func (o *PluginConfigLinux) GetAllowAllDevicesOk() (*bool, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.AllowAllDevices, true
}

// SetAllowAllDevices sets field value
func (o *PluginConfigLinux) SetAllowAllDevices(v bool) {
	o.AllowAllDevices = v
}

// GetCapabilities returns the Capabilities field value
func (o *PluginConfigLinux) GetCapabilities() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Capabilities
}

// GetCapabilitiesOk returns a tuple with the Capabilities field value
// and a boolean to check if the value has been set.
func (o *PluginConfigLinux) GetCapabilitiesOk() ([]string, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Capabilities, true
}

// SetCapabilities sets field value
func (o *PluginConfigLinux) SetCapabilities(v []string) {
	o.Capabilities = v
}

// GetDevices returns the Devices field value
func (o *PluginConfigLinux) GetDevices() []PluginDevice {
	if o == nil {
		var ret []PluginDevice
		return ret
	}

	return o.Devices
}

// GetDevicesOk returns a tuple with the Devices field value
// and a boolean to check if the value has been set.
func (o *PluginConfigLinux) GetDevicesOk() ([]PluginDevice, bool) {
	if o == nil  {
		return nil, false
	}
	return o.Devices, true
}

// SetDevices sets field value
func (o *PluginConfigLinux) SetDevices(v []PluginDevice) {
	o.Devices = v
}

func (o PluginConfigLinux) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["AllowAllDevices"] = o.AllowAllDevices
	}
	if true {
		toSerialize["Capabilities"] = o.Capabilities
	}
	if true {
		toSerialize["Devices"] = o.Devices
	}
	return json.Marshal(toSerialize)
}

type NullablePluginConfigLinux struct {
	value *PluginConfigLinux
	isSet bool
}

func (v NullablePluginConfigLinux) Get() *PluginConfigLinux {
	return v.value
}

func (v *NullablePluginConfigLinux) Set(val *PluginConfigLinux) {
	v.value = val
	v.isSet = true
}

func (v NullablePluginConfigLinux) IsSet() bool {
	return v.isSet
}

func (v *NullablePluginConfigLinux) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePluginConfigLinux(val *PluginConfigLinux) *NullablePluginConfigLinux {
	return &NullablePluginConfigLinux{value: val, isSet: true}
}

func (v NullablePluginConfigLinux) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePluginConfigLinux) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


