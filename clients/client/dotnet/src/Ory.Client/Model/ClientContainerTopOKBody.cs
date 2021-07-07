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
    /// ContainerTopOKBody OK response to ContainerTop operation
    /// </summary>
    [DataContract(Name = "ContainerTopOKBody")]
    public partial class ClientContainerTopOKBody : IEquatable<ClientContainerTopOKBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContainerTopOKBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientContainerTopOKBody()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientContainerTopOKBody" /> class.
        /// </summary>
        /// <param name="processes">Each process running in the container, where each is process is an array of values corresponding to the titles (required).</param>
        /// <param name="titles">The ps column titles (required).</param>
        public ClientContainerTopOKBody(List<List<string>> processes = default(List<List<string>>), List<string> titles = default(List<string>))
        {
            // to ensure "processes" is required (not null)
            this.Processes = processes ?? throw new ArgumentNullException("processes is a required property for ClientContainerTopOKBody and cannot be null");
            // to ensure "titles" is required (not null)
            this.Titles = titles ?? throw new ArgumentNullException("titles is a required property for ClientContainerTopOKBody and cannot be null");
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Each process running in the container, where each is process is an array of values corresponding to the titles
        /// </summary>
        /// <value>Each process running in the container, where each is process is an array of values corresponding to the titles</value>
        [DataMember(Name = "Processes", IsRequired = true, EmitDefaultValue = false)]
        public List<List<string>> Processes { get; set; }

        /// <summary>
        /// The ps column titles
        /// </summary>
        /// <value>The ps column titles</value>
        [DataMember(Name = "Titles", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Titles { get; set; }

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
            sb.Append("class ClientContainerTopOKBody {\n");
            sb.Append("  Processes: ").Append(Processes).Append("\n");
            sb.Append("  Titles: ").Append(Titles).Append("\n");
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
            return this.Equals(input as ClientContainerTopOKBody);
        }

        /// <summary>
        /// Returns true if ClientContainerTopOKBody instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientContainerTopOKBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientContainerTopOKBody input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Processes == input.Processes ||
                    this.Processes != null &&
                    input.Processes != null &&
                    this.Processes.SequenceEqual(input.Processes)
                ) && 
                (
                    this.Titles == input.Titles ||
                    this.Titles != null &&
                    input.Titles != null &&
                    this.Titles.SequenceEqual(input.Titles)
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
                if (this.Processes != null)
                    hashCode = hashCode * 59 + this.Processes.GetHashCode();
                if (this.Titles != null)
                    hashCode = hashCode * 59 + this.Titles.GetHashCode();
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
