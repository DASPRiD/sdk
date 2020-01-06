/**
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.0.0-alpha.37
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Form } from './form';
import { Identity } from './identity';

/**
* This request is used when an identity wants to update profile information (especially traits) in a selfservice manner.  For more information head over to: https://www.ory.sh/docs/kratos/selfservice/profile
*/
export class ProfileManagementRequest {
    /**
    * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the profile, a new request has to be initiated.
    */
    'expiresAt'?: Date;
    'form'?: Form;
    'id'?: string;
    'identity'?: Identity;
    /**
    * IssuedAt is the time (UTC) when the request occurred.
    */
    'issuedAt'?: Date;
    /**
    * RequestURL is the initial URL that was requested from ORY Kratos. It can be used to forward information contained in the URL\'s path or query for example.
    */
    'requestUrl'?: string;
    /**
    * UpdateSuccessful, if true, indicates that the profile has been updated successfully with the provided data. Done will stay true when repeatedly checking. If set to true, done will revert back to false only when a request with invalid (e.g. \"please use a valid phone number\") data was sent.
    */
    'updateSuccessful'?: boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "expiresAt",
            "baseName": "expires_at",
            "type": "Date"
        },
        {
            "name": "form",
            "baseName": "form",
            "type": "Form"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "identity",
            "baseName": "identity",
            "type": "Identity"
        },
        {
            "name": "issuedAt",
            "baseName": "issued_at",
            "type": "Date"
        },
        {
            "name": "requestUrl",
            "baseName": "request_url",
            "type": "string"
        },
        {
            "name": "updateSuccessful",
            "baseName": "update_successful",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ProfileManagementRequest.attributeTypeMap;
    }
}

