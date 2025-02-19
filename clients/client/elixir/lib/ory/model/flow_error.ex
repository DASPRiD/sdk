# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.FlowError do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :created_at,
    :error,
    :id,
    :updated_at
  ]

  @type t :: %__MODULE__{
    :created_at => DateTime.t | nil,
    :error => map() | nil,
    :id => String.t,
    :updated_at => DateTime.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.FlowError do
  def decode(value, _options) do
    value
  end
end

