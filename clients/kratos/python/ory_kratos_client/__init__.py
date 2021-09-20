# flake8: noqa

"""
    Ory Kratos API

    Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests.   # noqa: E501

    The version of the OpenAPI document: v0.7.6-alpha.4
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


__version__ = "v0.7.6-alpha.4"

# import ApiClient
from ory_kratos_client.api_client import ApiClient

# import Configuration
from ory_kratos_client.configuration import Configuration

# import exceptions
from ory_kratos_client.exceptions import OpenApiException
from ory_kratos_client.exceptions import ApiAttributeError
from ory_kratos_client.exceptions import ApiTypeError
from ory_kratos_client.exceptions import ApiValueError
from ory_kratos_client.exceptions import ApiKeyError
from ory_kratos_client.exceptions import ApiException
