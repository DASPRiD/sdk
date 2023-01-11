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
import sh.ory.model.IdentityCredentialsType;
import sh.ory.model.OAuth2LoginRequest;
import sh.ory.model.UiContainer;

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
 * RegistrationFlow
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-11T13:29:42.038062650Z[Etc/UTC]")
public class RegistrationFlow {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private IdentityCredentialsType active;

  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUED_AT = "issued_at";
  @SerializedName(SERIALIZED_NAME_ISSUED_AT)
  private OffsetDateTime issuedAt;

  public static final String SERIALIZED_NAME_OAUTH2_LOGIN_CHALLENGE = "oauth2_login_challenge";
  @SerializedName(SERIALIZED_NAME_OAUTH2_LOGIN_CHALLENGE)
  private String oauth2LoginChallenge;

  public static final String SERIALIZED_NAME_OAUTH2_LOGIN_REQUEST = "oauth2_login_request";
  @SerializedName(SERIALIZED_NAME_OAUTH2_LOGIN_REQUEST)
  private OAuth2LoginRequest oauth2LoginRequest;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_RETURN_TO = "return_to";
  @SerializedName(SERIALIZED_NAME_RETURN_TO)
  private String returnTo;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_UI = "ui";
  @SerializedName(SERIALIZED_NAME_UI)
  private UiContainer ui;

  public RegistrationFlow() {
  }

  public RegistrationFlow active(IdentityCredentialsType active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IdentityCredentialsType getActive() {
    return active;
  }


  public void setActive(IdentityCredentialsType active) {
    this.active = active;
  }


  public RegistrationFlow expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.
   * @return expiresAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RegistrationFlow id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID represents the flow&#39;s unique ID. When performing the registration flow, this represents the id in the registration ui&#39;s query parameter: http://&lt;selfservice.flows.registration.ui_url&gt;/?flow&#x3D;&lt;id&gt;
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID represents the flow's unique ID. When performing the registration flow, this represents the id in the registration ui's query parameter: http://<selfservice.flows.registration.ui_url>/?flow=<id>")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RegistrationFlow issuedAt(OffsetDateTime issuedAt) {
    
    this.issuedAt = issuedAt;
    return this;
  }

   /**
   * IssuedAt is the time (UTC) when the flow occurred.
   * @return issuedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "IssuedAt is the time (UTC) when the flow occurred.")

  public OffsetDateTime getIssuedAt() {
    return issuedAt;
  }


  public void setIssuedAt(OffsetDateTime issuedAt) {
    this.issuedAt = issuedAt;
  }


  public RegistrationFlow oauth2LoginChallenge(String oauth2LoginChallenge) {
    
    this.oauth2LoginChallenge = oauth2LoginChallenge;
    return this;
  }

   /**
   * Get oauth2LoginChallenge
   * @return oauth2LoginChallenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOauth2LoginChallenge() {
    return oauth2LoginChallenge;
  }


  public void setOauth2LoginChallenge(String oauth2LoginChallenge) {
    this.oauth2LoginChallenge = oauth2LoginChallenge;
  }


  public RegistrationFlow oauth2LoginRequest(OAuth2LoginRequest oauth2LoginRequest) {
    
    this.oauth2LoginRequest = oauth2LoginRequest;
    return this;
  }

   /**
   * Get oauth2LoginRequest
   * @return oauth2LoginRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2LoginRequest getOauth2LoginRequest() {
    return oauth2LoginRequest;
  }


  public void setOauth2LoginRequest(OAuth2LoginRequest oauth2LoginRequest) {
    this.oauth2LoginRequest = oauth2LoginRequest;
  }


  public RegistrationFlow requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
   * @return requestUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL's path or query for example.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public RegistrationFlow returnTo(String returnTo) {
    
    this.returnTo = returnTo;
    return this;
  }

   /**
   * ReturnTo contains the requested return_to URL.
   * @return returnTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReturnTo contains the requested return_to URL.")

  public String getReturnTo() {
    return returnTo;
  }


  public void setReturnTo(String returnTo) {
    this.returnTo = returnTo;
  }


  public RegistrationFlow type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The flow type can either be `api` or `browser`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public RegistrationFlow ui(UiContainer ui) {
    
    this.ui = ui;
    return this;
  }

   /**
   * Get ui
   * @return ui
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UiContainer getUi() {
    return ui;
  }


  public void setUi(UiContainer ui) {
    this.ui = ui;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationFlow registrationFlow = (RegistrationFlow) o;
    return Objects.equals(this.active, registrationFlow.active) &&
        Objects.equals(this.expiresAt, registrationFlow.expiresAt) &&
        Objects.equals(this.id, registrationFlow.id) &&
        Objects.equals(this.issuedAt, registrationFlow.issuedAt) &&
        Objects.equals(this.oauth2LoginChallenge, registrationFlow.oauth2LoginChallenge) &&
        Objects.equals(this.oauth2LoginRequest, registrationFlow.oauth2LoginRequest) &&
        Objects.equals(this.requestUrl, registrationFlow.requestUrl) &&
        Objects.equals(this.returnTo, registrationFlow.returnTo) &&
        Objects.equals(this.type, registrationFlow.type) &&
        Objects.equals(this.ui, registrationFlow.ui);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, expiresAt, id, issuedAt, oauth2LoginChallenge, oauth2LoginRequest, requestUrl, returnTo, type, ui);
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
    sb.append("class RegistrationFlow {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedAt: ").append(toIndentedString(issuedAt)).append("\n");
    sb.append("    oauth2LoginChallenge: ").append(toIndentedString(oauth2LoginChallenge)).append("\n");
    sb.append("    oauth2LoginRequest: ").append(toIndentedString(oauth2LoginRequest)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    returnTo: ").append(toIndentedString(returnTo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    ui: ").append(toIndentedString(ui)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("expires_at");
    openapiFields.add("id");
    openapiFields.add("issued_at");
    openapiFields.add("oauth2_login_challenge");
    openapiFields.add("oauth2_login_request");
    openapiFields.add("request_url");
    openapiFields.add("return_to");
    openapiFields.add("type");
    openapiFields.add("ui");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expires_at");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issued_at");
    openapiRequiredFields.add("request_url");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("ui");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RegistrationFlow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RegistrationFlow.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RegistrationFlow is not found in the empty JSON string", RegistrationFlow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RegistrationFlow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RegistrationFlow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RegistrationFlow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("oauth2_login_challenge") != null && !jsonObj.get("oauth2_login_challenge").isJsonNull()) && !jsonObj.get("oauth2_login_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oauth2_login_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oauth2_login_challenge").toString()));
      }
      // validate the optional field `oauth2_login_request`
      if (jsonObj.get("oauth2_login_request") != null && !jsonObj.get("oauth2_login_request").isJsonNull()) {
        OAuth2LoginRequest.validateJsonObject(jsonObj.getAsJsonObject("oauth2_login_request"));
      }
      if (!jsonObj.get("request_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_url").toString()));
      }
      if ((jsonObj.get("return_to") != null && !jsonObj.get("return_to").isJsonNull()) && !jsonObj.get("return_to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `return_to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("return_to").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `ui`
      UiContainer.validateJsonObject(jsonObj.getAsJsonObject("ui"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RegistrationFlow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RegistrationFlow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RegistrationFlow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RegistrationFlow.class));

       return (TypeAdapter<T>) new TypeAdapter<RegistrationFlow>() {
           @Override
           public void write(JsonWriter out, RegistrationFlow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RegistrationFlow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RegistrationFlow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RegistrationFlow
  * @throws IOException if the JSON string is invalid with respect to RegistrationFlow
  */
  public static RegistrationFlow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RegistrationFlow.class);
  }

 /**
  * Convert an instance of RegistrationFlow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

