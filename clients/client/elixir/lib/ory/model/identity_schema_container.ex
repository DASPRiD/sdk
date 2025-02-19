# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.IdentitySchemaContainer do
  @moduledoc """
  An Identity JSON Schema Container
  """

  @derive [Poison.Encoder]
  defstruct [
    :id,
    :schema
  ]

  @type t :: %__MODULE__{
    :id => String.t | nil,
    :schema => map() | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.IdentitySchemaContainer do
  def decode(value, _options) do
    value
  end
end

