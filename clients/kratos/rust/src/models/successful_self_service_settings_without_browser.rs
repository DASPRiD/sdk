/*
 * Ory Kratos API
 *
 * Documentation for all public and administrative Ory Kratos APIs. Public and administrative APIs are exposed on different ports. Public APIs can face the public internet without any protection while administrative APIs should never be exposed without prior authorization. To protect the administative API port you should use something like Nginx, Ory Oathkeeper, or any other technology capable of authorizing incoming requests. 
 *
 * The version of the OpenAPI document: v0.7.6-alpha.4
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// SuccessfulSelfServiceSettingsWithoutBrowser : The Response for Settings Flows via API



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SuccessfulSelfServiceSettingsWithoutBrowser {
    #[serde(rename = "flow")]
    pub flow: Box<crate::models::SelfServiceSettingsFlow>,
    #[serde(rename = "identity")]
    pub identity: Box<crate::models::Identity>,
}

impl SuccessfulSelfServiceSettingsWithoutBrowser {
    /// The Response for Settings Flows via API
    pub fn new(flow: crate::models::SelfServiceSettingsFlow, identity: crate::models::Identity) -> SuccessfulSelfServiceSettingsWithoutBrowser {
        SuccessfulSelfServiceSettingsWithoutBrowser {
            flow: Box::new(flow),
            identity: Box::new(identity),
        }
    }
}


