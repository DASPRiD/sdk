# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.UpdateLoginFlowWithWebAuthnMethod do
  @moduledoc """
  Update Login Flow with WebAuthn Method
  """

  @derive [Poison.Encoder]
  defstruct [
    :csrf_token,
    :identifier,
    :method,
    :webauthn_login
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :identifier => String.t,
    :method => String.t,
    :webauthn_login => String.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.UpdateLoginFlowWithWebAuthnMethod do
  def decode(value, _options) do
    value
  end
end

