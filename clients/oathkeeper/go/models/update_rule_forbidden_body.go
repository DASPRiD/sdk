// Code generated by go-swagger; DO NOT EDIT.

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	strfmt "github.com/go-openapi/strfmt"

	"github.com/go-openapi/swag"
)

// UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody update rule forbidden body
// swagger:model UpdateRuleForbiddenBody
type UpdateRuleForbiddenBody struct {

	// code
	Code int64 `json:"code,omitempty"`

	// details
	Details []map[string]interface{} `json:"details"`

	// message
	Message string `json:"message,omitempty"`

	// reason
	Reason string `json:"reason,omitempty"`

	// request
	Request string `json:"request,omitempty"`

	// status
	Status string `json:"status,omitempty"`
}

// Validate validates this update rule forbidden body
func (m *UpdateRuleForbiddenBody) Validate(formats strfmt.Registry) error {
	return nil
}

// MarshalBinary interface implementation
func (m *UpdateRuleForbiddenBody) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *UpdateRuleForbiddenBody) UnmarshalBinary(b []byte) error {
	var res UpdateRuleForbiddenBody
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
