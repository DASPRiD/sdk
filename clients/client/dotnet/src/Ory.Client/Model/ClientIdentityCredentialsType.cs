/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.15
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// and so on.
    /// </summary>
    /// <value>and so on.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ClientIdentityCredentialsType
    {
        /// <summary>
        /// Enum Password for value: password
        /// </summary>
        [EnumMember(Value = "password")]
        Password = 1,

        /// <summary>
        /// Enum Totp for value: totp
        /// </summary>
        [EnumMember(Value = "totp")]
        Totp = 2,

        /// <summary>
        /// Enum Oidc for value: oidc
        /// </summary>
        [EnumMember(Value = "oidc")]
        Oidc = 3,

        /// <summary>
        /// Enum Webauthn for value: webauthn
        /// </summary>
        [EnumMember(Value = "webauthn")]
        Webauthn = 4,

        /// <summary>
        /// Enum LookupSecret for value: lookup_secret
        /// </summary>
        [EnumMember(Value = "lookup_secret")]
        LookupSecret = 5

    }

}
