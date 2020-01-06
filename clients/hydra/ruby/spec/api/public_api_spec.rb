=begin
#ORY Hydra

#Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.

The version of the OpenAPI document: v0.0.0-alpha.1

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.2.2

=end

require 'spec_helper'
require 'json'

# Unit tests for OryHydraClient::PublicApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'PublicApi' do
  before do
    # run before each test
    @api_instance = OryHydraClient::PublicApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PublicApi' do
    it 'should create an instance of PublicApi' do
      expect(@api_instance).to be_instance_of(OryHydraClient::PublicApi)
    end
  end

  # unit tests for disconnect_user
  # OpenID Connect Front-Backchannel enabled Logout
  # This endpoint initiates and completes user logout at ORY Hydra and initiates OpenID Connect Front-/Back-channel logout:  https://openid.net/specs/openid-connect-frontchannel-1_0.html https://openid.net/specs/openid-connect-backchannel-1_0.html
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'disconnect_user test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for discover_open_id_configuration
  # OpenID Connect Discovery
  # The well known endpoint an be used to retrieve information for OpenID Connect clients. We encourage you to not roll your own OpenID Connect client but to use an OpenID Connect client library instead. You can learn more on this flow at https://openid.net/specs/openid-connect-discovery-1_0.html .  Popular libraries for OpenID Connect clients include oidc-client-js (JavaScript), go-oidc (Golang), and others. For a full list of clients go here: https://openid.net/developers/certified/
  # @param [Hash] opts the optional parameters
  # @return [WellKnown]
  describe 'discover_open_id_configuration test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for is_instance_ready
  # Check readiness status
  # This endpoint returns a 200 status code when the HTTP server is up running and the environment dependencies (e.g. the database) are responsive as well.  If the service supports TLS Edge Termination, this endpoint does not require the &#x60;X-Forwarded-Proto&#x60; header to be set.  Be aware that if you are running multiple nodes of this service, the health status will never refer to the cluster state, only to a single instance.
  # @param [Hash] opts the optional parameters
  # @return [HealthStatus]
  describe 'is_instance_ready test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for oauth2_token
  # The OAuth 2.0 token endpoint
  # The client makes a request to the token endpoint by sending the following parameters using the \&quot;application/x-www-form-urlencoded\&quot; HTTP request entity-body.  &gt; Do not implement a client for this endpoint yourself. Use a library. There are many libraries &gt; available for any programming language. You can find a list of libraries here: https://oauth.net/code/ &gt; &gt; Do not the the Hydra SDK does not implement this endpoint properly. Use one of the libraries listed above!
  # @param grant_type 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :code 
  # @option opts [String] :refresh_token 
  # @option opts [String] :redirect_uri 
  # @option opts [String] :client_id 
  # @return [Oauth2TokenResponse]
  describe 'oauth2_token test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for oauth_auth
  # The OAuth 2.0 authorize endpoint
  # This endpoint is not documented here because you should never use your own implementation to perform OAuth2 flows. OAuth2 is a very popular protocol and a library for your programming language will exists.  To learn more about this flow please refer to the specification: https://tools.ietf.org/html/rfc6749
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'oauth_auth test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for revoke_o_auth2_token
  # Revoke OAuth2 tokens
  # Revoking a token (both access and refresh) means that the tokens will be invalid. A revoked access token can no longer be used to make access requests, and a revoked refresh token can no longer be used to refresh an access token. Revoking a refresh token also invalidates the access token that was created with it. A token may only be revoked by the client the token was generated for.
  # @param token 
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'revoke_o_auth2_token test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for userinfo
  # OpenID Connect Userinfo
  # This endpoint returns the payload of the ID Token, including the idTokenExtra values, of the provided OAuth 2.0 Access Token.  For more information please [refer to the spec](http://openid.net/specs/openid-connect-core-1_0.html#UserInfo).
  # @param [Hash] opts the optional parameters
  # @return [UserinfoResponse]
  describe 'userinfo test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for well_known
  # JSON Web Keys Discovery
  # This endpoint returns JSON Web Keys to be used as public keys for verifying OpenID Connect ID Tokens and, if enabled, OAuth 2.0 JWT Access Tokens. This endpoint can be used with client libraries like [node-jwks-rsa](https://github.com/auth0/node-jwks-rsa) among others.
  # @param [Hash] opts the optional parameters
  # @return [JSONWebKeySet]
  describe 'well_known test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
