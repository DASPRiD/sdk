// Code generated by go-swagger; DO NOT EDIT.

package public

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"
	"net/http"
	"time"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/runtime"
	cr "github.com/go-openapi/runtime/client"

	strfmt "github.com/go-openapi/strfmt"
)

// NewInitializeRegistrationFlowParams creates a new InitializeRegistrationFlowParams object
// with the default values initialized.
func NewInitializeRegistrationFlowParams() *InitializeRegistrationFlowParams {

	return &InitializeRegistrationFlowParams{

		timeout: cr.DefaultTimeout,
	}
}

// NewInitializeRegistrationFlowParamsWithTimeout creates a new InitializeRegistrationFlowParams object
// with the default values initialized, and the ability to set a timeout on a request
func NewInitializeRegistrationFlowParamsWithTimeout(timeout time.Duration) *InitializeRegistrationFlowParams {

	return &InitializeRegistrationFlowParams{

		timeout: timeout,
	}
}

// NewInitializeRegistrationFlowParamsWithContext creates a new InitializeRegistrationFlowParams object
// with the default values initialized, and the ability to set a context for a request
func NewInitializeRegistrationFlowParamsWithContext(ctx context.Context) *InitializeRegistrationFlowParams {

	return &InitializeRegistrationFlowParams{

		Context: ctx,
	}
}

// NewInitializeRegistrationFlowParamsWithHTTPClient creates a new InitializeRegistrationFlowParams object
// with the default values initialized, and the ability to set a custom HTTPClient for a request
func NewInitializeRegistrationFlowParamsWithHTTPClient(client *http.Client) *InitializeRegistrationFlowParams {

	return &InitializeRegistrationFlowParams{
		HTTPClient: client,
	}
}

/*InitializeRegistrationFlowParams contains all the parameters to send to the API endpoint
for the initialize registration flow operation typically these are written to a http.Request
*/
type InitializeRegistrationFlowParams struct {
	timeout    time.Duration
	Context    context.Context
	HTTPClient *http.Client
}

// WithTimeout adds the timeout to the initialize registration flow params
func (o *InitializeRegistrationFlowParams) WithTimeout(timeout time.Duration) *InitializeRegistrationFlowParams {
	o.SetTimeout(timeout)
	return o
}

// SetTimeout adds the timeout to the initialize registration flow params
func (o *InitializeRegistrationFlowParams) SetTimeout(timeout time.Duration) {
	o.timeout = timeout
}

// WithContext adds the context to the initialize registration flow params
func (o *InitializeRegistrationFlowParams) WithContext(ctx context.Context) *InitializeRegistrationFlowParams {
	o.SetContext(ctx)
	return o
}

// SetContext adds the context to the initialize registration flow params
func (o *InitializeRegistrationFlowParams) SetContext(ctx context.Context) {
	o.Context = ctx
}

// WithHTTPClient adds the HTTPClient to the initialize registration flow params
func (o *InitializeRegistrationFlowParams) WithHTTPClient(client *http.Client) *InitializeRegistrationFlowParams {
	o.SetHTTPClient(client)
	return o
}

// SetHTTPClient adds the HTTPClient to the initialize registration flow params
func (o *InitializeRegistrationFlowParams) SetHTTPClient(client *http.Client) {
	o.HTTPClient = client
}

// WriteToRequest writes these params to a swagger request
func (o *InitializeRegistrationFlowParams) WriteToRequest(r runtime.ClientRequest, reg strfmt.Registry) error {

	if err := r.SetTimeout(o.timeout); err != nil {
		return err
	}
	var res []error

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}
