/**
 * 
 */
package com.zzm.findwater.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.Validate;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.Resource;

/**
 * @author water 2015-6-28
 *
 */
public class PropertyConfigLoader extends PropertyPlaceholderConfigurer {

	
	
	/* (non-Javadoc)
	 * @see org.springframework.beans.factory.config.PropertyPlaceholderConfigurer#processProperties(org.springframework.beans.factory.config.ConfigurableListableBeanFactory, java.util.Properties)
	 */
	@Override
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties props) throws BeansException {
		
		if (props != null)
		{
			// Put all the entries to configurations store.
			Set<Object> proKeys = props.keySet();
			ConcurrentHashMap<String, String> proStore = new ConcurrentHashMap<String, String>();
			for (Object pkey : proKeys)
			{
				String settingItem = (String) pkey;
				String settingItemValue = props.getProperty(settingItem);
				proStore.put(settingItem, settingItemValue);
			}
			ConfigurationsStore.setProperties(proStore);
		}
		
		super.processProperties(beanFactoryToProcess, props);
	}
	
	
	public void setLocationsList(List<Resource[]> locationsList)
	{
		Validate.notEmpty(locationsList, "Location list should not be empty");
		List<Resource> result = new ArrayList<Resource>();
		for (Resource[] resources : locationsList)
		{
			result.addAll(Arrays.asList(resources));
		}
		setLocations(result.toArray(new Resource[result.size()]));
	}
	
}
