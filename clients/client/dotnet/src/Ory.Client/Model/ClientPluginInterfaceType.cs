/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.15
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
    /// PluginInterfaceType plugin interface type
    /// </summary>
    [DataContract(Name = "PluginInterfaceType")]
    public partial class ClientPluginInterfaceType : IEquatable<ClientPluginInterfaceType>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientPluginInterfaceType" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientPluginInterfaceType()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientPluginInterfaceType" /> class.
        /// </summary>
        /// <param name="capability">capability (required).</param>
        /// <param name="prefix">prefix (required).</param>
        /// <param name="version">version (required).</param>
        public ClientPluginInterfaceType(string capability = default(string), string prefix = default(string), string version = default(string))
        {
            // to ensure "capability" is required (not null)
            this.Capability = capability ?? throw new ArgumentNullException("capability is a required property for ClientPluginInterfaceType and cannot be null");
            // to ensure "prefix" is required (not null)
            this.Prefix = prefix ?? throw new ArgumentNullException("prefix is a required property for ClientPluginInterfaceType and cannot be null");
            // to ensure "version" is required (not null)
            this.Version = version ?? throw new ArgumentNullException("version is a required property for ClientPluginInterfaceType and cannot be null");
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// capability
        /// </summary>
        /// <value>capability</value>
        [DataMember(Name = "Capability", IsRequired = true, EmitDefaultValue = false)]
        public string Capability { get; set; }

        /// <summary>
        /// prefix
        /// </summary>
        /// <value>prefix</value>
        [DataMember(Name = "Prefix", IsRequired = true, EmitDefaultValue = false)]
        public string Prefix { get; set; }

        /// <summary>
        /// version
        /// </summary>
        /// <value>version</value>
        [DataMember(Name = "Version", IsRequired = true, EmitDefaultValue = false)]
        public string Version { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientPluginInterfaceType {\n");
            sb.Append("  Capability: ").Append(Capability).Append("\n");
            sb.Append("  Prefix: ").Append(Prefix).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientPluginInterfaceType);
        }

        /// <summary>
        /// Returns true if ClientPluginInterfaceType instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientPluginInterfaceType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientPluginInterfaceType input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Capability == input.Capability ||
                    (this.Capability != null &&
                    this.Capability.Equals(input.Capability))
                ) && 
                (
                    this.Prefix == input.Prefix ||
                    (this.Prefix != null &&
                    this.Prefix.Equals(input.Prefix))
                ) && 
                (
                    this.Version == input.Version ||
                    (this.Version != null &&
                    this.Version.Equals(input.Version))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Capability != null)
                    hashCode = hashCode * 59 + this.Capability.GetHashCode();
                if (this.Prefix != null)
                    hashCode = hashCode * 59 + this.Prefix.GetHashCode();
                if (this.Version != null)
                    hashCode = hashCode * 59 + this.Version.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
