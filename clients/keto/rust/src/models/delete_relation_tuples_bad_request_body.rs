/*
 * Ory Oathkeeper API
 *
 * Documentation for all of Ory Oathkeeper's APIs. 
 *
 * The version of the OpenAPI document: v0.8.0-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// DeleteRelationTuplesBadRequestBody : DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody delete relation tuples bad request body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct DeleteRelationTuplesBadRequestBody {
    /// code
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<i64>,
    /// details
    #[serde(rename = "details", skip_serializing_if = "Option::is_none")]
    pub details: Option<Vec<serde_json::Value>>,
    /// message
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
    /// reason
    #[serde(rename = "reason", skip_serializing_if = "Option::is_none")]
    pub reason: Option<String>,
    /// request
    #[serde(rename = "request", skip_serializing_if = "Option::is_none")]
    pub request: Option<String>,
    /// status
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<String>,
}

impl DeleteRelationTuplesBadRequestBody {
    /// DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody DeleteRelationTuplesBadRequestBody delete relation tuples bad request body
    pub fn new() -> DeleteRelationTuplesBadRequestBody {
        DeleteRelationTuplesBadRequestBody {
            code: None,
            details: None,
            message: None,
            reason: None,
            request: None,
            status: None,
        }
    }
}

