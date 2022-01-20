/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.56
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
import sh.ory.model.ProjectLookupSecretConfig;
import sh.ory.model.ProjectPasswordConfig;
import sh.ory.model.ProjectRecoveryConfig;
import sh.ory.model.ProjectTotpConfig;
import sh.ory.model.ProjectVerificationConfig;
import sh.ory.model.ProjectWebAuthnConfig;
import sh.ory.model.RedirectionConfig;

/**
 * ProjectPatch
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-20T21:47:26.946019758Z[Etc/UTC]")
public class ProjectPatch {
  public static final String SERIALIZED_NAME_API_URL = "api_url";
  @SerializedName(SERIALIZED_NAME_API_URL)
  private String apiUrl;

  public static final String SERIALIZED_NAME_APPLICATION_URL = "application_url";
  @SerializedName(SERIALIZED_NAME_APPLICATION_URL)
  private String applicationUrl;

  public static final String SERIALIZED_NAME_DEFAULT_IDENTITY_SCHEMA_URL = "default_identity_schema_url";
  @SerializedName(SERIALIZED_NAME_DEFAULT_IDENTITY_SCHEMA_URL)
  private String defaultIdentitySchemaUrl;

  public static final String SERIALIZED_NAME_ERROR_UI_URL = "error_ui_url";
  @SerializedName(SERIALIZED_NAME_ERROR_UI_URL)
  private String errorUiUrl;

  public static final String SERIALIZED_NAME_KRATOS_CUSTOM_SCHEMA_ID = "kratos_custom_schema_id";
  @SerializedName(SERIALIZED_NAME_KRATOS_CUSTOM_SCHEMA_ID)
  private String kratosCustomSchemaId;

  public static final String SERIALIZED_NAME_LOGIN_UI_URL = "login_ui_url";
  @SerializedName(SERIALIZED_NAME_LOGIN_UI_URL)
  private String loginUiUrl;

  public static final String SERIALIZED_NAME_LOOKUP_SECRET = "lookup_secret";
  @SerializedName(SERIALIZED_NAME_LOOKUP_SECRET)
  private ProjectLookupSecretConfig lookupSecret;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private ProjectPasswordConfig password;

  public static final String SERIALIZED_NAME_RECOVERY = "recovery";
  @SerializedName(SERIALIZED_NAME_RECOVERY)
  private ProjectRecoveryConfig recovery;

  public static final String SERIALIZED_NAME_RECOVERY_UI_URL = "recovery_ui_url";
  @SerializedName(SERIALIZED_NAME_RECOVERY_UI_URL)
  private String recoveryUiUrl;

  public static final String SERIALIZED_NAME_REDIRECTION_CONFIG = "redirection_config";
  @SerializedName(SERIALIZED_NAME_REDIRECTION_CONFIG)
  private RedirectionConfig redirectionConfig;

  public static final String SERIALIZED_NAME_REGISTRATION_UI_URL = "registration_ui_url";
  @SerializedName(SERIALIZED_NAME_REGISTRATION_UI_URL)
  private String registrationUiUrl;

  public static final String SERIALIZED_NAME_SESSION_AFTER_SIGN_UP = "session_after_sign_up";
  @SerializedName(SERIALIZED_NAME_SESSION_AFTER_SIGN_UP)
  private Boolean sessionAfterSignUp;

  public static final String SERIALIZED_NAME_SESSION_SOFT2FA = "session_soft_2fa";
  @SerializedName(SERIALIZED_NAME_SESSION_SOFT2FA)
  private Boolean sessionSoft2fa;

  public static final String SERIALIZED_NAME_SETTINGS_PRIVILEGED_SESSION_MAX_AGE_SECONDS = "settings_privileged_session_max_age_seconds";
  @SerializedName(SERIALIZED_NAME_SETTINGS_PRIVILEGED_SESSION_MAX_AGE_SECONDS)
  private Long settingsPrivilegedSessionMaxAgeSeconds;

  public static final String SERIALIZED_NAME_SETTINGS_SOFT2FA = "settings_soft_2fa";
  @SerializedName(SERIALIZED_NAME_SETTINGS_SOFT2FA)
  private Boolean settingsSoft2fa;

  public static final String SERIALIZED_NAME_SETTINGS_UI_URL = "settings_ui_url";
  @SerializedName(SERIALIZED_NAME_SETTINGS_UI_URL)
  private String settingsUiUrl;

  public static final String SERIALIZED_NAME_TOTP = "totp";
  @SerializedName(SERIALIZED_NAME_TOTP)
  private ProjectTotpConfig totp;

  public static final String SERIALIZED_NAME_VERIFICATION = "verification";
  @SerializedName(SERIALIZED_NAME_VERIFICATION)
  private ProjectVerificationConfig verification;

  public static final String SERIALIZED_NAME_VERIFICATION_UI_URL = "verification_ui_url";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_UI_URL)
  private String verificationUiUrl;

  public static final String SERIALIZED_NAME_WEBAUTHN = "webauthn";
  @SerializedName(SERIALIZED_NAME_WEBAUTHN)
  private ProjectWebAuthnConfig webauthn;


  public ProjectPatch apiUrl(String apiUrl) {
    
    this.apiUrl = apiUrl;
    return this;
  }

   /**
   * URL of Project API  In the future will allow to override Kratos project URL. If set, error is returned. If left empty our hosted URL is used
   * @return apiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of Project API  In the future will allow to override Kratos project URL. If set, error is returned. If left empty our hosted URL is used")

  public String getApiUrl() {
    return apiUrl;
  }


  public void setApiUrl(String apiUrl) {
    this.apiUrl = apiUrl;
  }


  public ProjectPatch applicationUrl(String applicationUrl) {
    
    this.applicationUrl = applicationUrl;
    return this;
  }

   /**
   * URL where your application is available.  Your users will be redirected to this URL when they successfully complete a login, logout, verification, recovery, or registration flow. More fine-grained redirection patterns are available for the individual flows (login, registration, ...).  If left empty, our hosted URL will be used instead. It contains technical information on the identities and is useful when developing a new project or trying out Ory Cloud.
   * @return applicationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL where your application is available.  Your users will be redirected to this URL when they successfully complete a login, logout, verification, recovery, or registration flow. More fine-grained redirection patterns are available for the individual flows (login, registration, ...).  If left empty, our hosted URL will be used instead. It contains technical information on the identities and is useful when developing a new project or trying out Ory Cloud.")

  public String getApplicationUrl() {
    return applicationUrl;
  }


  public void setApplicationUrl(String applicationUrl) {
    this.applicationUrl = applicationUrl;
  }


  public ProjectPatch defaultIdentitySchemaUrl(String defaultIdentitySchemaUrl) {
    
    this.defaultIdentitySchemaUrl = defaultIdentitySchemaUrl;
    return this;
  }

   /**
   * Default Identity Schema URL  This represents your Ory Kratos Default Identity Schema. It is your identity&#39;s default schema. This allows setting custom fields such as \&quot;address\&quot;, specifying whether you want to log in using email or a username, and more. For more information on this topic, please check out the identity documentation.  If KratosCustomSchemaID is also added to the payload, it will be preferred and replace the value of DefaultIdentitySchemaURL set by the client.  The value of this field can be either any \&quot;https://\&quot; URL - for example a file hosted at GitHub, or a &#x60;preset://&#x60;-prefixed string.  Available presets are:  preset://email preset://username preset://basic preset://blank
   * @return defaultIdentitySchemaUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default Identity Schema URL  This represents your Ory Kratos Default Identity Schema. It is your identity's default schema. This allows setting custom fields such as \"address\", specifying whether you want to log in using email or a username, and more. For more information on this topic, please check out the identity documentation.  If KratosCustomSchemaID is also added to the payload, it will be preferred and replace the value of DefaultIdentitySchemaURL set by the client.  The value of this field can be either any \"https://\" URL - for example a file hosted at GitHub, or a `preset://`-prefixed string.  Available presets are:  preset://email preset://username preset://basic preset://blank")

  public String getDefaultIdentitySchemaUrl() {
    return defaultIdentitySchemaUrl;
  }


  public void setDefaultIdentitySchemaUrl(String defaultIdentitySchemaUrl) {
    this.defaultIdentitySchemaUrl = defaultIdentitySchemaUrl;
  }


  public ProjectPatch errorUiUrl(String errorUiUrl) {
    
    this.errorUiUrl = errorUiUrl;
    return this;
  }

   /**
   * Self-Service Error UI URL  Sets the UI URL for the error UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return errorUiUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.org/error", required = true, value = "Self-Service Error UI URL  Sets the UI URL for the error UI. If left empty, this will use Ory's hosted pages.")

  public String getErrorUiUrl() {
    return errorUiUrl;
  }


  public void setErrorUiUrl(String errorUiUrl) {
    this.errorUiUrl = errorUiUrl;
  }


  public ProjectPatch kratosCustomSchemaId(String kratosCustomSchemaId) {
    
    this.kratosCustomSchemaId = kratosCustomSchemaId;
    return this;
  }

   /**
   * The Custom Schema ID  The custom schema ID is a preferred field over DefaultIdentitySchemaURL, meaning it will override the DefaultIdentitySchemaURL with the custom schema&#39;s URL instead of accepting it from the client-side. Once this field is set the given custom schema will be associated with this project.
   * @return kratosCustomSchemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Custom Schema ID  The custom schema ID is a preferred field over DefaultIdentitySchemaURL, meaning it will override the DefaultIdentitySchemaURL with the custom schema's URL instead of accepting it from the client-side. Once this field is set the given custom schema will be associated with this project.")

  public String getKratosCustomSchemaId() {
    return kratosCustomSchemaId;
  }


  public void setKratosCustomSchemaId(String kratosCustomSchemaId) {
    this.kratosCustomSchemaId = kratosCustomSchemaId;
  }


  public ProjectPatch loginUiUrl(String loginUiUrl) {
    
    this.loginUiUrl = loginUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the login UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return loginUiUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.org/login", required = true, value = "Self-Service Login UI URL  Sets the UI URL for the login UI. If left empty, this will use Ory's hosted pages.")

  public String getLoginUiUrl() {
    return loginUiUrl;
  }


  public void setLoginUiUrl(String loginUiUrl) {
    this.loginUiUrl = loginUiUrl;
  }


  public ProjectPatch lookupSecret(ProjectLookupSecretConfig lookupSecret) {
    
    this.lookupSecret = lookupSecret;
    return this;
  }

   /**
   * Get lookupSecret
   * @return lookupSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectLookupSecretConfig getLookupSecret() {
    return lookupSecret;
  }


  public void setLookupSecret(ProjectLookupSecretConfig lookupSecret) {
    this.lookupSecret = lookupSecret;
  }


  public ProjectPatch name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The project name.  Helps you identify your project.  in: body
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ACME App", value = "The project name.  Helps you identify your project.  in: body")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectPatch password(ProjectPasswordConfig password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectPasswordConfig getPassword() {
    return password;
  }


  public void setPassword(ProjectPasswordConfig password) {
    this.password = password;
  }


  public ProjectPatch recovery(ProjectRecoveryConfig recovery) {
    
    this.recovery = recovery;
    return this;
  }

   /**
   * Get recovery
   * @return recovery
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectRecoveryConfig getRecovery() {
    return recovery;
  }


  public void setRecovery(ProjectRecoveryConfig recovery) {
    this.recovery = recovery;
  }


  public ProjectPatch recoveryUiUrl(String recoveryUiUrl) {
    
    this.recoveryUiUrl = recoveryUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the recovery UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return recoveryUiUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.org/recover", required = true, value = "Self-Service Login UI URL  Sets the UI URL for the recovery UI. If left empty, this will use Ory's hosted pages.")

  public String getRecoveryUiUrl() {
    return recoveryUiUrl;
  }


  public void setRecoveryUiUrl(String recoveryUiUrl) {
    this.recoveryUiUrl = recoveryUiUrl;
  }


  public ProjectPatch redirectionConfig(RedirectionConfig redirectionConfig) {
    
    this.redirectionConfig = redirectionConfig;
    return this;
  }

   /**
   * Get redirectionConfig
   * @return redirectionConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RedirectionConfig getRedirectionConfig() {
    return redirectionConfig;
  }


  public void setRedirectionConfig(RedirectionConfig redirectionConfig) {
    this.redirectionConfig = redirectionConfig;
  }


  public ProjectPatch registrationUiUrl(String registrationUiUrl) {
    
    this.registrationUiUrl = registrationUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the registration UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return registrationUiUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.org/signup", required = true, value = "Self-Service Login UI URL  Sets the UI URL for the registration UI. If left empty, this will use Ory's hosted pages.")

  public String getRegistrationUiUrl() {
    return registrationUiUrl;
  }


  public void setRegistrationUiUrl(String registrationUiUrl) {
    this.registrationUiUrl = registrationUiUrl;
  }


  public ProjectPatch sessionAfterSignUp(Boolean sessionAfterSignUp) {
    
    this.sessionAfterSignUp = sessionAfterSignUp;
    return this;
  }

   /**
   * Issue Session after Sign Up  If set to true, users will receive a session after they successfully signed up. Enabling this option allows account enumeration during registration flows. Read more: https://www.ory.sh/kratos/docs/self-service/flows/user-registration#successful-registration
   * @return sessionAfterSignUp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Issue Session after Sign Up  If set to true, users will receive a session after they successfully signed up. Enabling this option allows account enumeration during registration flows. Read more: https://www.ory.sh/kratos/docs/self-service/flows/user-registration#successful-registration")

  public Boolean getSessionAfterSignUp() {
    return sessionAfterSignUp;
  }


  public void setSessionAfterSignUp(Boolean sessionAfterSignUp) {
    this.sessionAfterSignUp = sessionAfterSignUp;
  }


  public ProjectPatch sessionSoft2fa(Boolean sessionSoft2fa) {
    
    this.sessionSoft2fa = sessionSoft2fa;
    return this;
  }

   /**
   * Enable Soft 2FA for Login Sessions
   * @return sessionSoft2fa
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Enable Soft 2FA for Login Sessions")

  public Boolean getSessionSoft2fa() {
    return sessionSoft2fa;
  }


  public void setSessionSoft2fa(Boolean sessionSoft2fa) {
    this.sessionSoft2fa = sessionSoft2fa;
  }


  public ProjectPatch settingsPrivilegedSessionMaxAgeSeconds(Long settingsPrivilegedSessionMaxAgeSeconds) {
    
    this.settingsPrivilegedSessionMaxAgeSeconds = settingsPrivilegedSessionMaxAgeSeconds;
    return this;
  }

   /**
   * Duration in Seconds of how long a Session is Privileged  Defines how long a session is considered privileged in seconds. If the session&#39;s authenticated_at is older than the value specified here, the user needs to re-authenticate to perform certain actions (e.g. password change).
   * @return settingsPrivilegedSessionMaxAgeSeconds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "900", required = true, value = "Duration in Seconds of how long a Session is Privileged  Defines how long a session is considered privileged in seconds. If the session's authenticated_at is older than the value specified here, the user needs to re-authenticate to perform certain actions (e.g. password change).")

  public Long getSettingsPrivilegedSessionMaxAgeSeconds() {
    return settingsPrivilegedSessionMaxAgeSeconds;
  }


  public void setSettingsPrivilegedSessionMaxAgeSeconds(Long settingsPrivilegedSessionMaxAgeSeconds) {
    this.settingsPrivilegedSessionMaxAgeSeconds = settingsPrivilegedSessionMaxAgeSeconds;
  }


  public ProjectPatch settingsSoft2fa(Boolean settingsSoft2fa) {
    
    this.settingsSoft2fa = settingsSoft2fa;
    return this;
  }

   /**
   * Enable Soft 2FA for Self-Service Settings Flows
   * @return settingsSoft2fa
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Enable Soft 2FA for Self-Service Settings Flows")

  public Boolean getSettingsSoft2fa() {
    return settingsSoft2fa;
  }


  public void setSettingsSoft2fa(Boolean settingsSoft2fa) {
    this.settingsSoft2fa = settingsSoft2fa;
  }


  public ProjectPatch settingsUiUrl(String settingsUiUrl) {
    
    this.settingsUiUrl = settingsUiUrl;
    return this;
  }

   /**
   * Self-Service Settings UI URL  Sets the UI URL for the settings UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return settingsUiUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.org/settings", required = true, value = "Self-Service Settings UI URL  Sets the UI URL for the settings UI. If left empty, this will use Ory's hosted pages.")

  public String getSettingsUiUrl() {
    return settingsUiUrl;
  }


  public void setSettingsUiUrl(String settingsUiUrl) {
    this.settingsUiUrl = settingsUiUrl;
  }


  public ProjectPatch totp(ProjectTotpConfig totp) {
    
    this.totp = totp;
    return this;
  }

   /**
   * Get totp
   * @return totp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectTotpConfig getTotp() {
    return totp;
  }


  public void setTotp(ProjectTotpConfig totp) {
    this.totp = totp;
  }


  public ProjectPatch verification(ProjectVerificationConfig verification) {
    
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectVerificationConfig getVerification() {
    return verification;
  }


  public void setVerification(ProjectVerificationConfig verification) {
    this.verification = verification;
  }


  public ProjectPatch verificationUiUrl(String verificationUiUrl) {
    
    this.verificationUiUrl = verificationUiUrl;
    return this;
  }

   /**
   * Self-Service Login UI URL  Sets the UI URL for the verification UI. If left empty, this will use Ory&#39;s hosted pages.
   * @return verificationUiUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://example.org/verify", required = true, value = "Self-Service Login UI URL  Sets the UI URL for the verification UI. If left empty, this will use Ory's hosted pages.")

  public String getVerificationUiUrl() {
    return verificationUiUrl;
  }


  public void setVerificationUiUrl(String verificationUiUrl) {
    this.verificationUiUrl = verificationUiUrl;
  }


  public ProjectPatch webauthn(ProjectWebAuthnConfig webauthn) {
    
    this.webauthn = webauthn;
    return this;
  }

   /**
   * Get webauthn
   * @return webauthn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ProjectWebAuthnConfig getWebauthn() {
    return webauthn;
  }


  public void setWebauthn(ProjectWebAuthnConfig webauthn) {
    this.webauthn = webauthn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectPatch projectPatch = (ProjectPatch) o;
    return Objects.equals(this.apiUrl, projectPatch.apiUrl) &&
        Objects.equals(this.applicationUrl, projectPatch.applicationUrl) &&
        Objects.equals(this.defaultIdentitySchemaUrl, projectPatch.defaultIdentitySchemaUrl) &&
        Objects.equals(this.errorUiUrl, projectPatch.errorUiUrl) &&
        Objects.equals(this.kratosCustomSchemaId, projectPatch.kratosCustomSchemaId) &&
        Objects.equals(this.loginUiUrl, projectPatch.loginUiUrl) &&
        Objects.equals(this.lookupSecret, projectPatch.lookupSecret) &&
        Objects.equals(this.name, projectPatch.name) &&
        Objects.equals(this.password, projectPatch.password) &&
        Objects.equals(this.recovery, projectPatch.recovery) &&
        Objects.equals(this.recoveryUiUrl, projectPatch.recoveryUiUrl) &&
        Objects.equals(this.redirectionConfig, projectPatch.redirectionConfig) &&
        Objects.equals(this.registrationUiUrl, projectPatch.registrationUiUrl) &&
        Objects.equals(this.sessionAfterSignUp, projectPatch.sessionAfterSignUp) &&
        Objects.equals(this.sessionSoft2fa, projectPatch.sessionSoft2fa) &&
        Objects.equals(this.settingsPrivilegedSessionMaxAgeSeconds, projectPatch.settingsPrivilegedSessionMaxAgeSeconds) &&
        Objects.equals(this.settingsSoft2fa, projectPatch.settingsSoft2fa) &&
        Objects.equals(this.settingsUiUrl, projectPatch.settingsUiUrl) &&
        Objects.equals(this.totp, projectPatch.totp) &&
        Objects.equals(this.verification, projectPatch.verification) &&
        Objects.equals(this.verificationUiUrl, projectPatch.verificationUiUrl) &&
        Objects.equals(this.webauthn, projectPatch.webauthn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiUrl, applicationUrl, defaultIdentitySchemaUrl, errorUiUrl, kratosCustomSchemaId, loginUiUrl, lookupSecret, name, password, recovery, recoveryUiUrl, redirectionConfig, registrationUiUrl, sessionAfterSignUp, sessionSoft2fa, settingsPrivilegedSessionMaxAgeSeconds, settingsSoft2fa, settingsUiUrl, totp, verification, verificationUiUrl, webauthn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectPatch {\n");
    sb.append("    apiUrl: ").append(toIndentedString(apiUrl)).append("\n");
    sb.append("    applicationUrl: ").append(toIndentedString(applicationUrl)).append("\n");
    sb.append("    defaultIdentitySchemaUrl: ").append(toIndentedString(defaultIdentitySchemaUrl)).append("\n");
    sb.append("    errorUiUrl: ").append(toIndentedString(errorUiUrl)).append("\n");
    sb.append("    kratosCustomSchemaId: ").append(toIndentedString(kratosCustomSchemaId)).append("\n");
    sb.append("    loginUiUrl: ").append(toIndentedString(loginUiUrl)).append("\n");
    sb.append("    lookupSecret: ").append(toIndentedString(lookupSecret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    recovery: ").append(toIndentedString(recovery)).append("\n");
    sb.append("    recoveryUiUrl: ").append(toIndentedString(recoveryUiUrl)).append("\n");
    sb.append("    redirectionConfig: ").append(toIndentedString(redirectionConfig)).append("\n");
    sb.append("    registrationUiUrl: ").append(toIndentedString(registrationUiUrl)).append("\n");
    sb.append("    sessionAfterSignUp: ").append(toIndentedString(sessionAfterSignUp)).append("\n");
    sb.append("    sessionSoft2fa: ").append(toIndentedString(sessionSoft2fa)).append("\n");
    sb.append("    settingsPrivilegedSessionMaxAgeSeconds: ").append(toIndentedString(settingsPrivilegedSessionMaxAgeSeconds)).append("\n");
    sb.append("    settingsSoft2fa: ").append(toIndentedString(settingsSoft2fa)).append("\n");
    sb.append("    settingsUiUrl: ").append(toIndentedString(settingsUiUrl)).append("\n");
    sb.append("    totp: ").append(toIndentedString(totp)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
    sb.append("    verificationUiUrl: ").append(toIndentedString(verificationUiUrl)).append("\n");
    sb.append("    webauthn: ").append(toIndentedString(webauthn)).append("\n");
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

}

