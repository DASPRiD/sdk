# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.IdentityWithCredentialsOidc do
  @moduledoc """
  Create Identity and Import Social Sign In Credentials
  """

  @derive [Poison.Encoder]
  defstruct [
    :config
  ]

  @type t :: %__MODULE__{
    :config => Ory.Model.IdentityWithCredentialsOidcConfig.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.IdentityWithCredentialsOidc do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:config, :struct, Ory.Model.IdentityWithCredentialsOidcConfig, options)
  end
end

