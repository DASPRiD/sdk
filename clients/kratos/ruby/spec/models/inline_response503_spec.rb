=begin
#Ory Kratos API

#Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 

The version of the OpenAPI document: v0.7.6-alpha.4
Contact: hi@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for OryKratosClient::InlineResponse503
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryKratosClient::InlineResponse503 do
  let(:instance) { OryKratosClient::InlineResponse503.new }

  describe 'test an instance of InlineResponse503' do
    it 'should create an instance of InlineResponse503' do
      expect(instance).to be_instance_of(OryKratosClient::InlineResponse503)
    end
  end
  describe 'test attribute "errors"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
