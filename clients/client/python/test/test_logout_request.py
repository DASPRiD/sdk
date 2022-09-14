"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.2.0-alpha.40
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.o_auth2_client import OAuth2Client
globals()['OAuth2Client'] = OAuth2Client
from ory_client.model.logout_request import LogoutRequest


class TestLogoutRequest(unittest.TestCase):
    """LogoutRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testLogoutRequest(self):
        """Test LogoutRequest"""
        # FIXME: construct object with mandatory attributes with example values
        # model = LogoutRequest()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()