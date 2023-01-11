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
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.ManagedIdentitySchema;

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
 * NormalizedProjectRevisionIdentitySchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:29:42.038062650Z[Etc/UTC]")
public class NormalizedProjectRevisionIdentitySchema {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IDENTITY_SCHEMA = "identity_schema";
  @SerializedName(SERIALIZED_NAME_IDENTITY_SCHEMA)
  private ManagedIdentitySchema identitySchema;

  public static final String SERIALIZED_NAME_IDENTITY_SCHEMA_ID = "identity_schema_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_SCHEMA_ID)
  private String identitySchemaId;

  public static final String SERIALIZED_NAME_IMPORT_ID = "import_id";
  @SerializedName(SERIALIZED_NAME_IMPORT_ID)
  private String importId;

  public static final String SERIALIZED_NAME_IMPORT_URL = "import_url";
  @SerializedName(SERIALIZED_NAME_IMPORT_URL)
  private String importUrl;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "is_default";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_PRESET = "preset";
  @SerializedName(SERIALIZED_NAME_PRESET)
  private String preset;

  public static final String SERIALIZED_NAME_PROJECT_REVISION_ID = "project_revision_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_REVISION_ID)
  private String projectRevisionId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public NormalizedProjectRevisionIdentitySchema() {
  }

  
  public NormalizedProjectRevisionIdentitySchema(
     OffsetDateTime createdAt, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

   /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Project's Revision Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




  public NormalizedProjectRevisionIdentitySchema id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of this entry.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of this entry.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public NormalizedProjectRevisionIdentitySchema identitySchema(ManagedIdentitySchema identitySchema) {
    
    this.identitySchema = identitySchema;
    return this;
  }

   /**
   * Get identitySchema
   * @return identitySchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ManagedIdentitySchema getIdentitySchema() {
    return identitySchema;
  }


  public void setIdentitySchema(ManagedIdentitySchema identitySchema) {
    this.identitySchema = identitySchema;
  }


  public NormalizedProjectRevisionIdentitySchema identitySchemaId(String identitySchemaId) {
    
    this.identitySchemaId = identitySchemaId;
    return this;
  }

   /**
   * Get identitySchemaId
   * @return identitySchemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentitySchemaId() {
    return identitySchemaId;
  }


  public void setIdentitySchemaId(String identitySchemaId) {
    this.identitySchemaId = identitySchemaId;
  }


  public NormalizedProjectRevisionIdentitySchema importId(String importId) {
    
    this.importId = importId;
    return this;
  }

   /**
   * The imported (named) ID of the Identity Schema referenced in the Ory Kratos config.
   * @return importId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The imported (named) ID of the Identity Schema referenced in the Ory Kratos config.")

  public String getImportId() {
    return importId;
  }


  public void setImportId(String importId) {
    this.importId = importId;
  }


  public NormalizedProjectRevisionIdentitySchema importUrl(String importUrl) {
    
    this.importUrl = importUrl;
    return this;
  }

   /**
   * The ImportURL can be used to import an Identity Schema from a bse64 encoded string. In the future, this key also support HTTPS and other sources!  If you import an Ory Kratos configuration, this would be akin to the &#x60;identity.schemas.#.url&#x60; key.  The configuration will always return the import URL when you fetch it from the API.
   * @return importUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "base64://ey...", value = "The ImportURL can be used to import an Identity Schema from a bse64 encoded string. In the future, this key also support HTTPS and other sources!  If you import an Ory Kratos configuration, this would be akin to the `identity.schemas.#.url` key.  The configuration will always return the import URL when you fetch it from the API.")

  public String getImportUrl() {
    return importUrl;
  }


  public void setImportUrl(String importUrl) {
    this.importUrl = importUrl;
  }


  public NormalizedProjectRevisionIdentitySchema isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * If true sets the default schema for identities  Only one schema can ever be the default schema. If you try to add two schemas with default to true, the request will fail.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true sets the default schema for identities  Only one schema can ever be the default schema. If you try to add two schemas with default to true, the request will fail.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public NormalizedProjectRevisionIdentitySchema preset(String preset) {
    
    this.preset = preset;
    return this;
  }

   /**
   * Use a preset instead of a custom identity schema.
   * @return preset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use a preset instead of a custom identity schema.")

  public String getPreset() {
    return preset;
  }


  public void setPreset(String preset) {
    this.preset = preset;
  }


  public NormalizedProjectRevisionIdentitySchema projectRevisionId(String projectRevisionId) {
    
    this.projectRevisionId = projectRevisionId;
    return this;
  }

   /**
   * The Revision&#39;s ID this schema belongs to
   * @return projectRevisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Revision's ID this schema belongs to")

  public String getProjectRevisionId() {
    return projectRevisionId;
  }


  public void setProjectRevisionId(String projectRevisionId) {
    this.projectRevisionId = projectRevisionId;
  }


   /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last Time Project's Revision was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NormalizedProjectRevisionIdentitySchema normalizedProjectRevisionIdentitySchema = (NormalizedProjectRevisionIdentitySchema) o;
    return Objects.equals(this.createdAt, normalizedProjectRevisionIdentitySchema.createdAt) &&
        Objects.equals(this.id, normalizedProjectRevisionIdentitySchema.id) &&
        Objects.equals(this.identitySchema, normalizedProjectRevisionIdentitySchema.identitySchema) &&
        Objects.equals(this.identitySchemaId, normalizedProjectRevisionIdentitySchema.identitySchemaId) &&
        Objects.equals(this.importId, normalizedProjectRevisionIdentitySchema.importId) &&
        Objects.equals(this.importUrl, normalizedProjectRevisionIdentitySchema.importUrl) &&
        Objects.equals(this.isDefault, normalizedProjectRevisionIdentitySchema.isDefault) &&
        Objects.equals(this.preset, normalizedProjectRevisionIdentitySchema.preset) &&
        Objects.equals(this.projectRevisionId, normalizedProjectRevisionIdentitySchema.projectRevisionId) &&
        Objects.equals(this.updatedAt, normalizedProjectRevisionIdentitySchema.updatedAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, identitySchema, identitySchemaId, importId, importUrl, isDefault, preset, projectRevisionId, updatedAt);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedProjectRevisionIdentitySchema {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    identitySchema: ").append(toIndentedString(identitySchema)).append("\n");
    sb.append("    identitySchemaId: ").append(toIndentedString(identitySchemaId)).append("\n");
    sb.append("    importId: ").append(toIndentedString(importId)).append("\n");
    sb.append("    importUrl: ").append(toIndentedString(importUrl)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
    sb.append("    projectRevisionId: ").append(toIndentedString(projectRevisionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("identity_schema");
    openapiFields.add("identity_schema_id");
    openapiFields.add("import_id");
    openapiFields.add("import_url");
    openapiFields.add("is_default");
    openapiFields.add("preset");
    openapiFields.add("project_revision_id");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NormalizedProjectRevisionIdentitySchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NormalizedProjectRevisionIdentitySchema.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormalizedProjectRevisionIdentitySchema is not found in the empty JSON string", NormalizedProjectRevisionIdentitySchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NormalizedProjectRevisionIdentitySchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NormalizedProjectRevisionIdentitySchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `identity_schema`
      if (jsonObj.get("identity_schema") != null && !jsonObj.get("identity_schema").isJsonNull()) {
        ManagedIdentitySchema.validateJsonObject(jsonObj.getAsJsonObject("identity_schema"));
      }
      if ((jsonObj.get("identity_schema_id") != null && !jsonObj.get("identity_schema_id").isJsonNull()) && !jsonObj.get("identity_schema_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_schema_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_schema_id").toString()));
      }
      if ((jsonObj.get("import_id") != null && !jsonObj.get("import_id").isJsonNull()) && !jsonObj.get("import_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_id").toString()));
      }
      if ((jsonObj.get("import_url") != null && !jsonObj.get("import_url").isJsonNull()) && !jsonObj.get("import_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `import_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("import_url").toString()));
      }
      if ((jsonObj.get("preset") != null && !jsonObj.get("preset").isJsonNull()) && !jsonObj.get("preset").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preset` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preset").toString()));
      }
      if ((jsonObj.get("project_revision_id") != null && !jsonObj.get("project_revision_id").isJsonNull()) && !jsonObj.get("project_revision_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_revision_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_revision_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormalizedProjectRevisionIdentitySchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormalizedProjectRevisionIdentitySchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormalizedProjectRevisionIdentitySchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormalizedProjectRevisionIdentitySchema.class));

       return (TypeAdapter<T>) new TypeAdapter<NormalizedProjectRevisionIdentitySchema>() {
           @Override
           public void write(JsonWriter out, NormalizedProjectRevisionIdentitySchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NormalizedProjectRevisionIdentitySchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NormalizedProjectRevisionIdentitySchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NormalizedProjectRevisionIdentitySchema
  * @throws IOException if the JSON string is invalid with respect to NormalizedProjectRevisionIdentitySchema
  */
  public static NormalizedProjectRevisionIdentitySchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormalizedProjectRevisionIdentitySchema.class);
  }

 /**
  * Convert an instance of NormalizedProjectRevisionIdentitySchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

