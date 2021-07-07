/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.15
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// PluginConfigArgs : PluginConfigArgs plugin config args



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PluginConfigArgs {
    /// description
    #[serde(rename = "Description")]
    pub description: String,
    /// name
    #[serde(rename = "Name")]
    pub name: String,
    /// settable
    #[serde(rename = "Settable")]
    pub settable: Vec<String>,
    /// value
    #[serde(rename = "Value")]
    pub value: Vec<String>,
}

impl PluginConfigArgs {
    /// PluginConfigArgs plugin config args
    pub fn new(description: String, name: String, settable: Vec<String>, value: Vec<String>) -> PluginConfigArgs {
        PluginConfigArgs {
            description,
            name,
            settable,
            value,
        }
    }
}


