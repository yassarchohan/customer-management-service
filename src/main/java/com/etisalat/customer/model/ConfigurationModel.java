package com.etisalat.customer.model;

public class ConfigurationModel extends BaseModel implements java.io.Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2503498511869323334L;
	
	/**
	 * configKey contains key against which ConfigValue will be retrieved and ConfigKey act as a primary key for CONIFIGURATION table.
	 */
	private String configKey;
	
	/**
	 * configValue contains value against configKey.
	 */
	private String configValue;

	/**
	 * No arg constructor.
	 */
	public ConfigurationModel()
	{
	}

	/**
	 * Constructor used to set configKey and ConfigValue.
	 */
	
	public ConfigurationModel(String configKey, String configValue)
	{
		this.configKey = configKey;
		this.configValue = configValue;
	}

	public String getConfigKey()
	{
		return this.configKey;
	}

	public void setConfigKey(String configKey)
	{
		this.configKey = configKey;
	}

	public String getConfigValue()
	{
		return this.configValue;
	}

	public void setConfigValue(String configValue)
	{
		this.configValue = configValue;
	}

}
