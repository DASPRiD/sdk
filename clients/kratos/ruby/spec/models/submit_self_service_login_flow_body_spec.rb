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

# Unit tests for OryKratosClient::SubmitSelfServiceLoginFlowBody
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe OryKratosClient::SubmitSelfServiceLoginFlowBody do
  describe '.openapi_one_of' do
    it 'lists the items referenced in the oneOf array' do
      expect(described_class.openapi_one_of).to_not be_empty
    end
  end

  describe '.openapi_discriminator_name' do
    it 'returns the value of the "discriminator" property' do
      expect(described_class.openapi_discriminator_name).to_not be_empty
    end
  end

  describe '.openapi_discriminator_mapping' do
    it 'returns the key/values of the "mapping" property' do
      expect(described_class.openapi_discriminator_mapping.values.sort).to eq(described_class.openapi_one_of.sort)
    end
  end

  describe '.build' do
    it 'returns the correct model' do
    end
  end
end
