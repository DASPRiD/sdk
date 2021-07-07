/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.15
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// ImageSummary : ImageSummary image summary



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct ImageSummary {
    /// containers
    #[serde(rename = "Containers")]
    pub containers: i64,
    /// created
    #[serde(rename = "Created")]
    pub created: i64,
    /// Id
    #[serde(rename = "Id")]
    pub id: String,
    /// labels
    #[serde(rename = "Labels")]
    pub labels: ::std::collections::HashMap<String, String>,
    /// parent Id
    #[serde(rename = "ParentId")]
    pub parent_id: String,
    /// repo digests
    #[serde(rename = "RepoDigests")]
    pub repo_digests: Vec<String>,
    /// repo tags
    #[serde(rename = "RepoTags")]
    pub repo_tags: Vec<String>,
    /// shared size
    #[serde(rename = "SharedSize")]
    pub shared_size: i64,
    /// size
    #[serde(rename = "Size")]
    pub size: i64,
    /// virtual size
    #[serde(rename = "VirtualSize")]
    pub virtual_size: i64,
}

impl ImageSummary {
    /// ImageSummary image summary
    pub fn new(containers: i64, created: i64, id: String, labels: ::std::collections::HashMap<String, String>, parent_id: String, repo_digests: Vec<String>, repo_tags: Vec<String>, shared_size: i64, size: i64, virtual_size: i64) -> ImageSummary {
        ImageSummary {
            containers,
            created,
            id,
            labels,
            parent_id,
            repo_digests,
            repo_tags,
            shared_size,
            size,
            virtual_size,
        }
    }
}


