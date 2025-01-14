# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.UpdateSettingsFlowWithProfileMethod do
  @moduledoc """
  Update Settings Flow with Profile Method
  """

  @derive [Poison.Encoder]
  defstruct [
    :csrf_token,
    :method,
    :traits
  ]

  @type t :: %__MODULE__{
    :csrf_token => String.t | nil,
    :method => String.t,
    :traits => map()
  }
end

defimpl Poison.Decoder, for: Ory.Model.UpdateSettingsFlowWithProfileMethod do
  def decode(value, _options) do
    value
  end
end

