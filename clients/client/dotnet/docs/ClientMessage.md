# Ory.Client.Model.ClientMessage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Body** | **string** |  | 
**CreatedAt** | **DateTime** | CreatedAt is a helper struct field for gobuffalo.pop. | 
**Dispatches** | [**List&lt;ClientMessageDispatch&gt;**](ClientMessageDispatch.md) | Dispatches store information about the attempts of delivering a message May contain an error if any happened, or just the &#x60;success&#x60; state. | [optional] 
**Id** | **string** |  | 
**Recipient** | **string** |  | 
**SendCount** | **long** |  | 
**Status** | [**ClientCourierMessageStatus**](ClientCourierMessageStatus.md) |  | 
**Subject** | **string** |  | 
**TemplateType** | **string** |  recovery_invalid TypeRecoveryInvalid recovery_valid TypeRecoveryValid recovery_code_invalid TypeRecoveryCodeInvalid recovery_code_valid TypeRecoveryCodeValid verification_invalid TypeVerificationInvalid verification_valid TypeVerificationValid verification_code_invalid TypeVerificationCodeInvalid verification_code_valid TypeVerificationCodeValid otp TypeOTP stub TypeTestStub | 
**Type** | [**ClientCourierMessageType**](ClientCourierMessageType.md) |  | 
**UpdatedAt** | **DateTime** | UpdatedAt is a helper struct field for gobuffalo.pop. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

