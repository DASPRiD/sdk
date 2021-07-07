=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.15
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.1.1

=end

require 'date'
require 'time'

module OryHydraClient
  class PluginConfig
    attr_accessor :args

    # description
    attr_accessor :description

    # Docker Version used to create the plugin
    attr_accessor :docker_version

    # documentation
    attr_accessor :documentation

    # entrypoint
    attr_accessor :entrypoint

    # env
    attr_accessor :env

    attr_accessor :interface

    # ipc host
    attr_accessor :ipc_host

    attr_accessor :linux

    # mounts
    attr_accessor :mounts

    attr_accessor :network

    # pid host
    attr_accessor :pid_host

    # propagated mount
    attr_accessor :propagated_mount

    attr_accessor :user

    # work dir
    attr_accessor :work_dir

    attr_accessor :rootfs

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'args' => :'Args',
        :'description' => :'Description',
        :'docker_version' => :'DockerVersion',
        :'documentation' => :'Documentation',
        :'entrypoint' => :'Entrypoint',
        :'env' => :'Env',
        :'interface' => :'Interface',
        :'ipc_host' => :'IpcHost',
        :'linux' => :'Linux',
        :'mounts' => :'Mounts',
        :'network' => :'Network',
        :'pid_host' => :'PidHost',
        :'propagated_mount' => :'PropagatedMount',
        :'user' => :'User',
        :'work_dir' => :'WorkDir',
        :'rootfs' => :'rootfs'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'args' => :'PluginConfigArgs',
        :'description' => :'String',
        :'docker_version' => :'String',
        :'documentation' => :'String',
        :'entrypoint' => :'Array<String>',
        :'env' => :'Array<PluginEnv>',
        :'interface' => :'PluginConfigInterface',
        :'ipc_host' => :'Boolean',
        :'linux' => :'PluginConfigLinux',
        :'mounts' => :'Array<PluginMount>',
        :'network' => :'PluginConfigNetwork',
        :'pid_host' => :'Boolean',
        :'propagated_mount' => :'String',
        :'user' => :'PluginConfigUser',
        :'work_dir' => :'String',
        :'rootfs' => :'PluginConfigRootfs'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OryHydraClient::PluginConfig` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OryHydraClient::PluginConfig`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'args')
        self.args = attributes[:'args']
      end

      if attributes.key?(:'description')
        self.description = attributes[:'description']
      end

      if attributes.key?(:'docker_version')
        self.docker_version = attributes[:'docker_version']
      end

      if attributes.key?(:'documentation')
        self.documentation = attributes[:'documentation']
      end

      if attributes.key?(:'entrypoint')
        if (value = attributes[:'entrypoint']).is_a?(Array)
          self.entrypoint = value
        end
      end

      if attributes.key?(:'env')
        if (value = attributes[:'env']).is_a?(Array)
          self.env = value
        end
      end

      if attributes.key?(:'interface')
        self.interface = attributes[:'interface']
      end

      if attributes.key?(:'ipc_host')
        self.ipc_host = attributes[:'ipc_host']
      end

      if attributes.key?(:'linux')
        self.linux = attributes[:'linux']
      end

      if attributes.key?(:'mounts')
        if (value = attributes[:'mounts']).is_a?(Array)
          self.mounts = value
        end
      end

      if attributes.key?(:'network')
        self.network = attributes[:'network']
      end

      if attributes.key?(:'pid_host')
        self.pid_host = attributes[:'pid_host']
      end

      if attributes.key?(:'propagated_mount')
        self.propagated_mount = attributes[:'propagated_mount']
      end

      if attributes.key?(:'user')
        self.user = attributes[:'user']
      end

      if attributes.key?(:'work_dir')
        self.work_dir = attributes[:'work_dir']
      end

      if attributes.key?(:'rootfs')
        self.rootfs = attributes[:'rootfs']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @args.nil?
        invalid_properties.push('invalid value for "args", args cannot be nil.')
      end

      if @description.nil?
        invalid_properties.push('invalid value for "description", description cannot be nil.')
      end

      if @documentation.nil?
        invalid_properties.push('invalid value for "documentation", documentation cannot be nil.')
      end

      if @entrypoint.nil?
        invalid_properties.push('invalid value for "entrypoint", entrypoint cannot be nil.')
      end

      if @env.nil?
        invalid_properties.push('invalid value for "env", env cannot be nil.')
      end

      if @interface.nil?
        invalid_properties.push('invalid value for "interface", interface cannot be nil.')
      end

      if @ipc_host.nil?
        invalid_properties.push('invalid value for "ipc_host", ipc_host cannot be nil.')
      end

      if @linux.nil?
        invalid_properties.push('invalid value for "linux", linux cannot be nil.')
      end

      if @mounts.nil?
        invalid_properties.push('invalid value for "mounts", mounts cannot be nil.')
      end

      if @network.nil?
        invalid_properties.push('invalid value for "network", network cannot be nil.')
      end

      if @pid_host.nil?
        invalid_properties.push('invalid value for "pid_host", pid_host cannot be nil.')
      end

      if @propagated_mount.nil?
        invalid_properties.push('invalid value for "propagated_mount", propagated_mount cannot be nil.')
      end

      if @work_dir.nil?
        invalid_properties.push('invalid value for "work_dir", work_dir cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @args.nil?
      return false if @description.nil?
      return false if @documentation.nil?
      return false if @entrypoint.nil?
      return false if @env.nil?
      return false if @interface.nil?
      return false if @ipc_host.nil?
      return false if @linux.nil?
      return false if @mounts.nil?
      return false if @network.nil?
      return false if @pid_host.nil?
      return false if @propagated_mount.nil?
      return false if @work_dir.nil?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          args == o.args &&
          description == o.description &&
          docker_version == o.docker_version &&
          documentation == o.documentation &&
          entrypoint == o.entrypoint &&
          env == o.env &&
          interface == o.interface &&
          ipc_host == o.ipc_host &&
          linux == o.linux &&
          mounts == o.mounts &&
          network == o.network &&
          pid_host == o.pid_host &&
          propagated_mount == o.propagated_mount &&
          user == o.user &&
          work_dir == o.work_dir &&
          rootfs == o.rootfs
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [args, description, docker_version, documentation, entrypoint, env, interface, ipc_host, linux, mounts, network, pid_host, propagated_mount, user, work_dir, rootfs].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OryHydraClient.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
