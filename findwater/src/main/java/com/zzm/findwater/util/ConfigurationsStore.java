/**
 * 
 */
package com.zzm.findwater.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.Validate;

/**
 * @author water 2015-6-28
 *
 */
public class ConfigurationsStore {
	
	private static final Map<String, String> m_props = new ConcurrentHashMap<String, String>();

	public static String getConfigValue(String key){
		
		String configValue = (String)m_props.get(key);
		
		if(null == configValue){
			return null;
		}
		
		return configValue.trim();
	}
	
	/**
	 * Set all the configurations that are loaded on app startup.
	 * @param props
	 */
	protected static void setProperties(ConcurrentHashMap<String, String> props){
	    Validate.notNull(props, "ConfigurationsStore error. Properties cannot be null. Please check bean configuration.");
        if (m_props.isEmpty()) {
            m_props.putAll(props);
        }
        else {
            for(Map.Entry<String, String> entry : props.entrySet()){
                addConfiguration(entry.getKey(), entry.getValue());
            }
        }
	}
	
	public static boolean getConfigValueAsBoolean(String key, boolean defaults) {
		
		String value = ConfigurationsStore.getConfigValue(key);
		return (value == null) ? defaults : ("true").equalsIgnoreCase(value);
		
	}
	
	
	public static void addConfiguration(String key, String value){
		m_props.put(key, value);
	}
	
	
	
}
