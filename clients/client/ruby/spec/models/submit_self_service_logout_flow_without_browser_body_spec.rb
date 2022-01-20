=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.56
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryClient::SubmitSelfServiceLogoutFlowWithoutBrowserBody
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryClient::SubmitSelfServiceLogoutFlowWithoutBrowserBody do
  let(:instance) { OryClient::SubmitSelfServiceLogoutFlowWithoutBrowserBody.new }

  describe 'test an instance of SubmitSelfServiceLogoutFlowWithoutBrowserBody' do
    it 'should create an instance of SubmitSelfServiceLogoutFlowWithoutBrowserBody' do
      expect(instance).to be_instance_of(OryClient::SubmitSelfServiceLogoutFlowWithoutBrowserBody)
    end
  end
  describe 'test attribute "session_token"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
