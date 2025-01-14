# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.InternalProvisionMockSubscription do
  @moduledoc """
  Internal Provision Mock Subscription Request Body
  """

  @derive [Poison.Encoder]
  defstruct [
    :identity_id,
    :plan_or_price
  ]

  @type t :: %__MODULE__{
    :identity_id => String.t,
    :plan_or_price => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.InternalProvisionMockSubscription do
  def decode(value, _options) do
    value
  end
end

