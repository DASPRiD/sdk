"""
    Ory Kratos API

    Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests.   # noqa: E501

    The version of the OpenAPI document: v0.7.6-alpha.4
    Contact: hi@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_kratos_client
from ory_kratos_client.model.identity_credentials import IdentityCredentials
from ory_kratos_client.model.identity_state import IdentityState
from ory_kratos_client.model.recovery_address import RecoveryAddress
from ory_kratos_client.model.verifiable_identity_address import VerifiableIdentityAddress
globals()['IdentityCredentials'] = IdentityCredentials
globals()['IdentityState'] = IdentityState
globals()['RecoveryAddress'] = RecoveryAddress
globals()['VerifiableIdentityAddress'] = VerifiableIdentityAddress
from ory_kratos_client.model.identity import Identity


class TestIdentity(unittest.TestCase):
    """Identity unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testIdentity(self):
        """Test Identity"""
        # FIXME: construct object with mandatory attributes with example values
        # model = Identity()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
