# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CustomDomainQuota do
  @moduledoc """
  Custom Domain Quota
  """

  @derive [Poison.Encoder]
  defstruct [
    :available_domains,
    :can_use,
    :used_domains
  ]

  @type t :: %__MODULE__{
    :available_domains => integer() | nil,
    :can_use => boolean() | nil,
    :used_domains => integer() | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.CustomDomainQuota do
  def decode(value, _options) do
    value
  end
end

