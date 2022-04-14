/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.166
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// JsonError : The standard Ory JSON API error format.



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct JsonError {
    #[serde(rename = "error")]
    pub error: Box<crate::models::GenericError>,
}

impl JsonError {
    /// The standard Ory JSON API error format.
    pub fn new(error: crate::models::GenericError) -> JsonError {
        JsonError {
            error: Box::new(error),
        }
    }
}


