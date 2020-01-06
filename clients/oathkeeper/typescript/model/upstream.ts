/**
 * ORY Oathkeeper
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.37
 * Contact: hi@ory.am
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
* Upstream Upstream Upstream Upstream Upstream Upstream Upstream upstream
*/
export class Upstream {
    /**
    * PreserveHost, if false (the default), tells ORY Oathkeeper to set the upstream request\'s Host header to the hostname of the API\'s upstream\'s URL. Setting this flag to true instructs ORY Oathkeeper not to do so.
    */
    'preserveHost'?: boolean;
    /**
    * StripPath if set, replaces the provided path prefix when forwarding the requested URL to the upstream URL.
    */
    'stripPath'?: string;
    /**
    * URL is the URL the request will be proxied to.
    */
    'url'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "preserveHost",
            "baseName": "preserve_host",
            "type": "boolean"
        },
        {
            "name": "stripPath",
            "baseName": "strip_path",
            "type": "string"
        },
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return Upstream.attributeTypeMap;
    }
}

