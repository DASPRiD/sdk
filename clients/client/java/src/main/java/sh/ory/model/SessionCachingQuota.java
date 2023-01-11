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
 * Session Caching Quota
 */
@ApiModel(description = "Session Caching Quota")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:29:42.038062650Z[Etc/UTC]")
public class SessionCachingQuota {
  public static final String SERIALIZED_NAME_CAN_USE = "can_use";
  @SerializedName(SERIALIZED_NAME_CAN_USE)
  private Boolean canUse;

  public SessionCachingQuota() {
  }

  public SessionCachingQuota canUse(Boolean canUse) {
    
    this.canUse = canUse;
    return this;
  }

   /**
   * Get canUse
   * @return canUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanUse() {
    return canUse;
  }


  public void setCanUse(Boolean canUse) {
    this.canUse = canUse;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionCachingQuota sessionCachingQuota = (SessionCachingQuota) o;
    return Objects.equals(this.canUse, sessionCachingQuota.canUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionCachingQuota {\n");
    sb.append("    canUse: ").append(toIndentedString(canUse)).append("\n");
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
    openapiFields.add("can_use");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SessionCachingQuota
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SessionCachingQuota.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SessionCachingQuota is not found in the empty JSON string", SessionCachingQuota.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SessionCachingQuota.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SessionCachingQuota` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SessionCachingQuota.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SessionCachingQuota' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SessionCachingQuota> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SessionCachingQuota.class));

       return (TypeAdapter<T>) new TypeAdapter<SessionCachingQuota>() {
           @Override
           public void write(JsonWriter out, SessionCachingQuota value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SessionCachingQuota read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SessionCachingQuota given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SessionCachingQuota
  * @throws IOException if the JSON string is invalid with respect to SessionCachingQuota
  */
  public static SessionCachingQuota fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SessionCachingQuota.class);
  }

 /**
  * Convert an instance of SessionCachingQuota to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

