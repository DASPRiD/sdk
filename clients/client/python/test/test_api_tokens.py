"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.0.1-alpha.37
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.api_token import ApiToken
globals()['ApiToken'] = ApiToken
from ory_client.model.api_tokens import ApiTokens


class TestApiTokens(unittest.TestCase):
    """ApiTokens unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testApiTokens(self):
        """Test ApiTokens"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ApiTokens()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()