/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.15
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct SubmitSelfServiceBrowserSettingsOidcFlowPayload {
    /// Flow ID is the flow's ID.  in: query
    #[serde(rename = "flow", skip_serializing_if = "Option::is_none")]
    pub flow: Option<String>,
    /// Link this provider  Either this or `unlink` must be set.  type: string in: body
    #[serde(rename = "link", skip_serializing_if = "Option::is_none")]
    pub link: Option<String>,
    /// Unlink this provider  Either this or `link` must be set.  type: string in: body
    #[serde(rename = "unlink", skip_serializing_if = "Option::is_none")]
    pub unlink: Option<String>,
}

impl SubmitSelfServiceBrowserSettingsOidcFlowPayload {
    pub fn new() -> SubmitSelfServiceBrowserSettingsOidcFlowPayload {
        SubmitSelfServiceBrowserSettingsOidcFlowPayload {
            flow: None,
            link: None,
            unlink: None,
        }
    }
}


