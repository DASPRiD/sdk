/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.10.6
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
using OpenAPIDateConverter = Ory.Hydra.Client.Client.OpenAPIDateConverter;

namespace Ory.Hydra.Client.Model
{
    /// <summary>
    /// PluginConfigLinux plugin config linux
    /// </summary>
    [DataContract(Name = "PluginConfigLinux")]
    public partial class HydraPluginConfigLinux : IEquatable<HydraPluginConfigLinux>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraPluginConfigLinux" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected HydraPluginConfigLinux()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraPluginConfigLinux" /> class.
        /// </summary>
        /// <param name="allowAllDevices">allow all devices (required).</param>
        /// <param name="capabilities">capabilities (required).</param>
        /// <param name="devices">devices (required).</param>
        public HydraPluginConfigLinux(bool allowAllDevices = default(bool), List<string> capabilities = default(List<string>), List<HydraPluginDevice> devices = default(List<HydraPluginDevice>))
        {
            this.AllowAllDevices = allowAllDevices;
            // to ensure "capabilities" is required (not null)
            this.Capabilities = capabilities ?? throw new ArgumentNullException("capabilities is a required property for HydraPluginConfigLinux and cannot be null");
            // to ensure "devices" is required (not null)
            this.Devices = devices ?? throw new ArgumentNullException("devices is a required property for HydraPluginConfigLinux and cannot be null");
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// allow all devices
        /// </summary>
        /// <value>allow all devices</value>
        [DataMember(Name = "AllowAllDevices", IsRequired = true, EmitDefaultValue = true)]
        public bool AllowAllDevices { get; set; }

        /// <summary>
        /// capabilities
        /// </summary>
        /// <value>capabilities</value>
        [DataMember(Name = "Capabilities", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Capabilities { get; set; }

        /// <summary>
        /// devices
        /// </summary>
        /// <value>devices</value>
        [DataMember(Name = "Devices", IsRequired = true, EmitDefaultValue = false)]
        public List<HydraPluginDevice> Devices { get; set; }

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
            sb.Append("class HydraPluginConfigLinux {\n");
            sb.Append("  AllowAllDevices: ").Append(AllowAllDevices).Append("\n");
            sb.Append("  Capabilities: ").Append(Capabilities).Append("\n");
            sb.Append("  Devices: ").Append(Devices).Append("\n");
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
            return this.Equals(input as HydraPluginConfigLinux);
        }

        /// <summary>
        /// Returns true if HydraPluginConfigLinux instances are equal
        /// </summary>
        /// <param name="input">Instance of HydraPluginConfigLinux to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HydraPluginConfigLinux input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AllowAllDevices == input.AllowAllDevices ||
                    this.AllowAllDevices.Equals(input.AllowAllDevices)
                ) && 
                (
                    this.Capabilities == input.Capabilities ||
                    this.Capabilities != null &&
                    input.Capabilities != null &&
                    this.Capabilities.SequenceEqual(input.Capabilities)
                ) && 
                (
                    this.Devices == input.Devices ||
                    this.Devices != null &&
                    input.Devices != null &&
                    this.Devices.SequenceEqual(input.Devices)
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
                hashCode = hashCode * 59 + this.AllowAllDevices.GetHashCode();
                if (this.Capabilities != null)
                    hashCode = hashCode * 59 + this.Capabilities.GetHashCode();
                if (this.Devices != null)
                    hashCode = hashCode * 59 + this.Devices.GetHashCode();
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
