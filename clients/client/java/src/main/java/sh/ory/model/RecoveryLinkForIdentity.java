/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.5
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * Used when an administrator creates a recovery link for an identity.
 */
@ApiModel(description = "Used when an administrator creates a recovery link for an identity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:29:42.038062650Z[Etc/UTC]")
public class RecoveryLinkForIdentity {
  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_RECOVERY_LINK = "recovery_link";
  @SerializedName(SERIALIZED_NAME_RECOVERY_LINK)
  private String recoveryLink;

  public RecoveryLinkForIdentity() {
  }

  public RecoveryLinkForIdentity expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Recovery Link Expires At  The timestamp when the recovery link expires.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recovery Link Expires At  The timestamp when the recovery link expires.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RecoveryLinkForIdentity recoveryLink(String recoveryLink) {
    
    this.recoveryLink = recoveryLink;
    return this;
  }

   /**
   * Recovery Link  This link can be used to recover the account.
   * @return recoveryLink
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Recovery Link  This link can be used to recover the account.")

  public String getRecoveryLink() {
    return recoveryLink;
  }


  public void setRecoveryLink(String recoveryLink) {
    this.recoveryLink = recoveryLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoveryLinkForIdentity recoveryLinkForIdentity = (RecoveryLinkForIdentity) o;
    return Objects.equals(this.expiresAt, recoveryLinkForIdentity.expiresAt) &&
        Objects.equals(this.recoveryLink, recoveryLinkForIdentity.recoveryLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, recoveryLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryLinkForIdentity {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    recoveryLink: ").append(toIndentedString(recoveryLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("expires_at");
    openapiFields.add("recovery_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recovery_link");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecoveryLinkForIdentity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecoveryLinkForIdentity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecoveryLinkForIdentity is not found in the empty JSON string", RecoveryLinkForIdentity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecoveryLinkForIdentity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecoveryLinkForIdentity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecoveryLinkForIdentity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("recovery_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery_link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecoveryLinkForIdentity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecoveryLinkForIdentity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecoveryLinkForIdentity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecoveryLinkForIdentity.class));

       return (TypeAdapter<T>) new TypeAdapter<RecoveryLinkForIdentity>() {
           @Override
           public void write(JsonWriter out, RecoveryLinkForIdentity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecoveryLinkForIdentity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecoveryLinkForIdentity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecoveryLinkForIdentity
  * @throws IOException if the JSON string is invalid with respect to RecoveryLinkForIdentity
  */
  public static RecoveryLinkForIdentity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecoveryLinkForIdentity.class);
  }

 /**
  * Convert an instance of RecoveryLinkForIdentity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

