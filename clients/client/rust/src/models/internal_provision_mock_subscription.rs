/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.2
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// InternalProvisionMockSubscription : Internal Provision Mock Subscription Request Body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct InternalProvisionMockSubscription {
    /// Identity ID
    #[serde(rename = "identity_id")]
    pub identity_id: String,
    /// Plan or Price
    #[serde(rename = "plan_or_price")]
    pub plan_or_price: String,
}


impl InternalProvisionMockSubscription {
    /// Internal Provision Mock Subscription Request Body
    pub fn new(identity_id: String, plan_or_price: String) -> InternalProvisionMockSubscription {
        InternalProvisionMockSubscription {
                identity_id,
                plan_or_price,
        }
    }
}

