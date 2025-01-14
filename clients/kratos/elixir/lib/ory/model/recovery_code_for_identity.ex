# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.RecoveryCodeForIdentity do
  @moduledoc """
  Used when an administrator creates a recovery code for an identity.
  """

  @derive [Poison.Encoder]
  defstruct [
    :expires_at,
    :recovery_code,
    :recovery_link
  ]

  @type t :: %__MODULE__{
    :expires_at => DateTime.t | nil,
    :recovery_code => String.t,
    :recovery_link => String.t
  }
end

defimpl Poison.Decoder, for: Ory.Model.RecoveryCodeForIdentity do
  def decode(value, _options) do
    value
  end
end

