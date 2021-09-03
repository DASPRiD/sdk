=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.19
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

# Common files
require 'ory-client/api_client'
require 'ory-client/api_error'
require 'ory-client/version'
require 'ory-client/configuration'

# Models
require 'ory-client/models/admin_create_identity_body'
require 'ory-client/models/admin_create_self_service_recovery_link_body'
require 'ory-client/models/admin_update_identity_body'
require 'ory-client/models/authenticate_ok_body'
require 'ory-client/models/authenticator_assurance_level'
require 'ory-client/models/container_change_response_item'
require 'ory-client/models/container_create_created_body'
require 'ory-client/models/container_top_ok_body'
require 'ory-client/models/container_update_ok_body'
require 'ory-client/models/container_wait_ok_body'
require 'ory-client/models/container_wait_ok_body_error'
require 'ory-client/models/error_response'
require 'ory-client/models/generic_error'
require 'ory-client/models/graph_driver_data'
require 'ory-client/models/health_not_ready_status'
require 'ory-client/models/health_status'
require 'ory-client/models/id_response'
require 'ory-client/models/identity'
require 'ory-client/models/identity_credentials'
require 'ory-client/models/identity_credentials_type'
require 'ory-client/models/identity_state'
require 'ory-client/models/image_delete_response_item'
require 'ory-client/models/image_summary'
require 'ory-client/models/inline_response200'
require 'ory-client/models/inline_response2001'
require 'ory-client/models/inline_response503'
require 'ory-client/models/json_error'
require 'ory-client/models/meta'
require 'ory-client/models/plugin'
require 'ory-client/models/plugin_config'
require 'ory-client/models/plugin_config_args'
require 'ory-client/models/plugin_config_interface'
require 'ory-client/models/plugin_config_linux'
require 'ory-client/models/plugin_config_network'
require 'ory-client/models/plugin_config_rootfs'
require 'ory-client/models/plugin_config_user'
require 'ory-client/models/plugin_device'
require 'ory-client/models/plugin_env'
require 'ory-client/models/plugin_interface_type'
require 'ory-client/models/plugin_mount'
require 'ory-client/models/plugin_settings'
require 'ory-client/models/port'
require 'ory-client/models/recovery_address'
require 'ory-client/models/self_service_error'
require 'ory-client/models/self_service_login_flow'
require 'ory-client/models/self_service_logout_url'
require 'ory-client/models/self_service_recovery_flow'
require 'ory-client/models/self_service_recovery_flow_state'
require 'ory-client/models/self_service_recovery_link'
require 'ory-client/models/self_service_registration_flow'
require 'ory-client/models/self_service_settings_flow'
require 'ory-client/models/self_service_settings_flow_state'
require 'ory-client/models/self_service_verification_flow'
require 'ory-client/models/self_service_verification_flow_state'
require 'ory-client/models/service_update_response'
require 'ory-client/models/session'
require 'ory-client/models/session_authentication_method'
require 'ory-client/models/session_device'
require 'ory-client/models/settings_profile_form_config'
require 'ory-client/models/submit_self_service_login_flow_body'
require 'ory-client/models/submit_self_service_login_flow_with_lookup_secret_method_body'
require 'ory-client/models/submit_self_service_login_flow_with_oidc_method_body'
require 'ory-client/models/submit_self_service_login_flow_with_password_method_body'
require 'ory-client/models/submit_self_service_login_flow_with_totp_method_body'
require 'ory-client/models/submit_self_service_login_flow_with_web_authn_method_body'
require 'ory-client/models/submit_self_service_logout_flow_without_browser_body'
require 'ory-client/models/submit_self_service_recovery_flow_body'
require 'ory-client/models/submit_self_service_recovery_flow_with_link_method_body'
require 'ory-client/models/submit_self_service_registration_flow_body'
require 'ory-client/models/submit_self_service_registration_flow_with_oidc_method_body'
require 'ory-client/models/submit_self_service_registration_flow_with_password_method_body'
require 'ory-client/models/submit_self_service_settings_flow_body'
require 'ory-client/models/submit_self_service_settings_flow_with_lookup_method_body'
require 'ory-client/models/submit_self_service_settings_flow_with_oidc_method_body'
require 'ory-client/models/submit_self_service_settings_flow_with_password_method_body'
require 'ory-client/models/submit_self_service_settings_flow_with_profile_method_body'
require 'ory-client/models/submit_self_service_settings_flow_with_totp_method_body'
require 'ory-client/models/submit_self_service_settings_flow_with_web_authn_method_body'
require 'ory-client/models/submit_self_service_verification_flow_body'
require 'ory-client/models/submit_self_service_verification_flow_with_link_method_body'
require 'ory-client/models/successful_self_service_login_without_browser'
require 'ory-client/models/successful_self_service_registration_without_browser'
require 'ory-client/models/ui_container'
require 'ory-client/models/ui_node'
require 'ory-client/models/ui_node_anchor_attributes'
require 'ory-client/models/ui_node_attributes'
require 'ory-client/models/ui_node_image_attributes'
require 'ory-client/models/ui_node_input_attributes'
require 'ory-client/models/ui_node_text_attributes'
require 'ory-client/models/ui_text'
require 'ory-client/models/verifiable_identity_address'
require 'ory-client/models/version'
require 'ory-client/models/volume'
require 'ory-client/models/volume_usage_data'

# APIs
require 'ory-client/api/metadata_api'
require 'ory-client/api/v0alpha2_api'

module OryClient
  class << self
    # Customize default settings for the SDK using block.
    #   OryClient.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
