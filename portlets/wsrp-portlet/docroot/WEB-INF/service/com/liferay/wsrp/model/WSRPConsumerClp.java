/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.wsrp.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.wsrp.service.WSRPConsumerLocalServiceUtil;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Brian Wing Shun Chan
 */
public class WSRPConsumerClp extends BaseModelImpl<WSRPConsumer>
	implements WSRPConsumer {
	public WSRPConsumerClp() {
	}

	public Class<?> getModelClass() {
		return WSRPConsumer.class;
	}

	public String getModelClassName() {
		return WSRPConsumer.class.getName();
	}

	public long getPrimaryKey() {
		return _wsrpConsumerId;
	}

	public void setPrimaryKey(long primaryKey) {
		setWsrpConsumerId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_wsrpConsumerId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("wsrpConsumerId", getWsrpConsumerId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("url", getUrl());
		attributes.put("wsdl", getWsdl());
		attributes.put("registrationContextString",
			getRegistrationContextString());
		attributes.put("registrationPropertiesString",
			getRegistrationPropertiesString());
		attributes.put("forwardCookies", getForwardCookies());
		attributes.put("forwardHeaders", getForwardHeaders());
		attributes.put("markupCharacterSets", getMarkupCharacterSets());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long wsrpConsumerId = (Long)attributes.get("wsrpConsumerId");

		if (wsrpConsumerId != null) {
			setWsrpConsumerId(wsrpConsumerId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String url = (String)attributes.get("url");

		if (url != null) {
			setUrl(url);
		}

		String wsdl = (String)attributes.get("wsdl");

		if (wsdl != null) {
			setWsdl(wsdl);
		}

		String registrationContextString = (String)attributes.get(
				"registrationContextString");

		if (registrationContextString != null) {
			setRegistrationContextString(registrationContextString);
		}

		String registrationPropertiesString = (String)attributes.get(
				"registrationPropertiesString");

		if (registrationPropertiesString != null) {
			setRegistrationPropertiesString(registrationPropertiesString);
		}

		String forwardCookies = (String)attributes.get("forwardCookies");

		if (forwardCookies != null) {
			setForwardCookies(forwardCookies);
		}

		String forwardHeaders = (String)attributes.get("forwardHeaders");

		if (forwardHeaders != null) {
			setForwardHeaders(forwardHeaders);
		}

		String markupCharacterSets = (String)attributes.get(
				"markupCharacterSets");

		if (markupCharacterSets != null) {
			setMarkupCharacterSets(markupCharacterSets);
		}
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getWsrpConsumerId() {
		return _wsrpConsumerId;
	}

	public void setWsrpConsumerId(long wsrpConsumerId) {
		_wsrpConsumerId = wsrpConsumerId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getUrl() {
		return _url;
	}

	public void setUrl(String url) {
		_url = url;
	}

	public String getWsdl() {
		return _wsdl;
	}

	public void setWsdl(String wsdl) {
		_wsdl = wsdl;
	}

	public String getRegistrationContextString() {
		return _registrationContextString;
	}

	public void setRegistrationContextString(String registrationContextString) {
		_registrationContextString = registrationContextString;
	}

	public String getRegistrationPropertiesString() {
		return _registrationPropertiesString;
	}

	public void setRegistrationPropertiesString(
		String registrationPropertiesString) {
		_registrationPropertiesString = registrationPropertiesString;
	}

	public String getForwardCookies() {
		return _forwardCookies;
	}

	public void setForwardCookies(String forwardCookies) {
		_forwardCookies = forwardCookies;
	}

	public String getForwardHeaders() {
		return _forwardHeaders;
	}

	public void setForwardHeaders(String forwardHeaders) {
		_forwardHeaders = forwardHeaders;
	}

	public String getMarkupCharacterSets() {
		return _markupCharacterSets;
	}

	public void setMarkupCharacterSets(String markupCharacterSets) {
		_markupCharacterSets = markupCharacterSets;
	}

	public void setRegistrationContext(
		oasis.names.tc.wsrp.v2.types.RegistrationContext registrationContext) {
		throw new UnsupportedOperationException();
	}

	public com.liferay.portal.kernel.util.UnicodeProperties getRegistrationProperties() {
		throw new UnsupportedOperationException();
	}

	public void setRegistrationProperties(
		com.liferay.portal.kernel.util.UnicodeProperties registrationProperties) {
		throw new UnsupportedOperationException();
	}

	public oasis.names.tc.wsrp.v2.types.RegistrationContext getRegistrationContext() {
		throw new UnsupportedOperationException();
	}

	public BaseModel<?> getWSRPConsumerRemoteModel() {
		return _wsrpConsumerRemoteModel;
	}

	public void setWSRPConsumerRemoteModel(BaseModel<?> wsrpConsumerRemoteModel) {
		_wsrpConsumerRemoteModel = wsrpConsumerRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			WSRPConsumerLocalServiceUtil.addWSRPConsumer(this);
		}
		else {
			WSRPConsumerLocalServiceUtil.updateWSRPConsumer(this);
		}
	}

	@Override
	public WSRPConsumer toEscapedModel() {
		return (WSRPConsumer)ProxyUtil.newProxyInstance(WSRPConsumer.class.getClassLoader(),
			new Class[] { WSRPConsumer.class }, new AutoEscapeBeanHandler(this));
	}

	public WSRPConsumer toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		WSRPConsumerClp clone = new WSRPConsumerClp();

		clone.setUuid(getUuid());
		clone.setWsrpConsumerId(getWsrpConsumerId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setName(getName());
		clone.setUrl(getUrl());
		clone.setWsdl(getWsdl());
		clone.setRegistrationContextString(getRegistrationContextString());
		clone.setRegistrationPropertiesString(getRegistrationPropertiesString());
		clone.setForwardCookies(getForwardCookies());
		clone.setForwardHeaders(getForwardHeaders());
		clone.setMarkupCharacterSets(getMarkupCharacterSets());

		return clone;
	}

	public int compareTo(WSRPConsumer wsrpConsumer) {
		int value = 0;

		value = getName().compareTo(wsrpConsumer.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		WSRPConsumerClp wsrpConsumer = null;

		try {
			wsrpConsumer = (WSRPConsumerClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = wsrpConsumer.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", wsrpConsumerId=");
		sb.append(getWsrpConsumerId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", url=");
		sb.append(getUrl());
		sb.append(", wsdl=");
		sb.append(getWsdl());
		sb.append(", registrationContextString=");
		sb.append(getRegistrationContextString());
		sb.append(", registrationPropertiesString=");
		sb.append(getRegistrationPropertiesString());
		sb.append(", forwardCookies=");
		sb.append(getForwardCookies());
		sb.append(", forwardHeaders=");
		sb.append(getForwardHeaders());
		sb.append(", markupCharacterSets=");
		sb.append(getMarkupCharacterSets());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.wsrp.model.WSRPConsumer");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wsrpConsumerId</column-name><column-value><![CDATA[");
		sb.append(getWsrpConsumerId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>url</column-name><column-value><![CDATA[");
		sb.append(getUrl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>wsdl</column-name><column-value><![CDATA[");
		sb.append(getWsdl());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationContextString</column-name><column-value><![CDATA[");
		sb.append(getRegistrationContextString());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>registrationPropertiesString</column-name><column-value><![CDATA[");
		sb.append(getRegistrationPropertiesString());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forwardCookies</column-name><column-value><![CDATA[");
		sb.append(getForwardCookies());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>forwardHeaders</column-name><column-value><![CDATA[");
		sb.append(getForwardHeaders());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>markupCharacterSets</column-name><column-value><![CDATA[");
		sb.append(getMarkupCharacterSets());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _uuid;
	private long _wsrpConsumerId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _url;
	private String _wsdl;
	private String _registrationContextString;
	private String _registrationPropertiesString;
	private String _forwardCookies;
	private String _forwardHeaders;
	private String _markupCharacterSets;
	private BaseModel<?> _wsrpConsumerRemoteModel;
}