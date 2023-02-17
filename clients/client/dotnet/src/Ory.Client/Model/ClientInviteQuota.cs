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
    /// Project invite quota
    /// </summary>
    [DataContract(Name = "inviteQuota")]
    public partial class ClientInviteQuota : IEquatable<ClientInviteQuota>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientInviteQuota" /> class.
        /// </summary>
        /// <param name="projectId">projectId.</param>
        /// <param name="remainingSeats">remainingSeats.</param>
        /// <param name="totalSeats">totalSeats.</param>
        public ClientInviteQuota(string projectId = default(string), long remainingSeats = default(long), long totalSeats = default(long))
        {
            this.ProjectId = projectId;
            this.RemainingSeats = remainingSeats;
            this.TotalSeats = totalSeats;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets ProjectId
        /// </summary>
        [DataMember(Name = "project_id", EmitDefaultValue = false)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets RemainingSeats
        /// </summary>
        [DataMember(Name = "remaining_seats", EmitDefaultValue = false)]
        public long RemainingSeats { get; set; }

        /// <summary>
        /// Gets or Sets TotalSeats
        /// </summary>
        [DataMember(Name = "total_seats", EmitDefaultValue = false)]
        public long TotalSeats { get; set; }

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
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClientInviteQuota {\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  RemainingSeats: ").Append(RemainingSeats).Append("\n");
            sb.Append("  TotalSeats: ").Append(TotalSeats).Append("\n");
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
            return this.Equals(input as ClientInviteQuota);
        }

        /// <summary>
        /// Returns true if ClientInviteQuota instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientInviteQuota to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientInviteQuota input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ProjectId == input.ProjectId ||
                    (this.ProjectId != null &&
                    this.ProjectId.Equals(input.ProjectId))
                ) && 
                (
                    this.RemainingSeats == input.RemainingSeats ||
                    this.RemainingSeats.Equals(input.RemainingSeats)
                ) && 
                (
                    this.TotalSeats == input.TotalSeats ||
                    this.TotalSeats.Equals(input.TotalSeats)
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
                if (this.ProjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.RemainingSeats.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalSeats.GetHashCode();
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
