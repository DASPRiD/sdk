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
	"fmt"
)

// SubmitSelfServiceRegistrationFlow - struct for SubmitSelfServiceRegistrationFlow
type SubmitSelfServiceRegistrationFlow struct {
	SubmitSelfServiceRegistrationFlowWithPasswordMethod *SubmitSelfServiceRegistrationFlowWithPasswordMethod
}

// SubmitSelfServiceRegistrationFlowWithPasswordMethodAsSubmitSelfServiceRegistrationFlow is a convenience function that returns SubmitSelfServiceRegistrationFlowWithPasswordMethod wrapped in SubmitSelfServiceRegistrationFlow
func SubmitSelfServiceRegistrationFlowWithPasswordMethodAsSubmitSelfServiceRegistrationFlow(v *SubmitSelfServiceRegistrationFlowWithPasswordMethod) SubmitSelfServiceRegistrationFlow {
	return SubmitSelfServiceRegistrationFlow{
		SubmitSelfServiceRegistrationFlowWithPasswordMethod: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *SubmitSelfServiceRegistrationFlow) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into SubmitSelfServiceRegistrationFlowWithPasswordMethod
	err = newStrictDecoder(data).Decode(&dst.SubmitSelfServiceRegistrationFlowWithPasswordMethod)
	if err == nil {
		jsonSubmitSelfServiceRegistrationFlowWithPasswordMethod, _ := json.Marshal(dst.SubmitSelfServiceRegistrationFlowWithPasswordMethod)
		if string(jsonSubmitSelfServiceRegistrationFlowWithPasswordMethod) == "{}" { // empty struct
			dst.SubmitSelfServiceRegistrationFlowWithPasswordMethod = nil
		} else {
			match++
		}
	} else {
		dst.SubmitSelfServiceRegistrationFlowWithPasswordMethod = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.SubmitSelfServiceRegistrationFlowWithPasswordMethod = nil

		return fmt.Errorf("Data matches more than one schema in oneOf(SubmitSelfServiceRegistrationFlow)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("Data failed to match schemas in oneOf(SubmitSelfServiceRegistrationFlow)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src SubmitSelfServiceRegistrationFlow) MarshalJSON() ([]byte, error) {
	if src.SubmitSelfServiceRegistrationFlowWithPasswordMethod != nil {
		return json.Marshal(&src.SubmitSelfServiceRegistrationFlowWithPasswordMethod)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *SubmitSelfServiceRegistrationFlow) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.SubmitSelfServiceRegistrationFlowWithPasswordMethod != nil {
		return obj.SubmitSelfServiceRegistrationFlowWithPasswordMethod
	}

	// all schemas are nil
	return nil
}

type NullableSubmitSelfServiceRegistrationFlow struct {
	value *SubmitSelfServiceRegistrationFlow
	isSet bool
}

func (v NullableSubmitSelfServiceRegistrationFlow) Get() *SubmitSelfServiceRegistrationFlow {
	return v.value
}

func (v *NullableSubmitSelfServiceRegistrationFlow) Set(val *SubmitSelfServiceRegistrationFlow) {
	v.value = val
	v.isSet = true
}

func (v NullableSubmitSelfServiceRegistrationFlow) IsSet() bool {
	return v.isSet
}

func (v *NullableSubmitSelfServiceRegistrationFlow) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubmitSelfServiceRegistrationFlow(val *SubmitSelfServiceRegistrationFlow) *NullableSubmitSelfServiceRegistrationFlow {
	return &NullableSubmitSelfServiceRegistrationFlow{value: val, isSet: true}
}

func (v NullableSubmitSelfServiceRegistrationFlow) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubmitSelfServiceRegistrationFlow) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


