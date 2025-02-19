# NOTE: This file is auto generated by OpenAPI Generator 6.2.1 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.Relationships do
  @moduledoc """
  Paginated Relationship List
  """

  @derive [Poison.Encoder]
  defstruct [
    :next_page_token,
    :relation_tuples
  ]

  @type t :: %__MODULE__{
    :next_page_token => String.t | nil,
    :relation_tuples => [Ory.Model.Relationship.t] | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.Relationships do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:relation_tuples, :list, Ory.Model.Relationship, options)
  end
end

