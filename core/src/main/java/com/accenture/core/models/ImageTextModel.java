package com.accenture.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

/**
 * Model for component Image+Text
 * 
 * @author alfredo.a.zipperer
 */
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageTextModel {

	@SlingObject
	private ResourceResolver resourceResolver;

	@Inject
	private String text;

	@Inject
	private String image;

	private String imageAlt;

	private String imageTitle;

	@PostConstruct
	public void init() {
		ValueMap imageMetadata = getImageMetadata(image);
		if (imageMetadata != null) {
			this.imageAlt = imageMetadata.get("dc:title", String.class);
			this.imageTitle = imageMetadata.get("dc:description", String.class);
		}
	}

	public String getText() {
		return this.text;
	}

	public String getImage() {
		return image;
	}

	public String getImageAlt() {
		return imageAlt;
	}

	public String getImageTitle() {
		return imageTitle;
	}

	private ValueMap getImageMetadata(String resourcePath) {
		Resource resource = resourceResolver.getResource(resourcePath + "/jcr:content/metadata");
		if (resource != null) {
			return resource.getValueMap();
		}

		return null;
	}

}
