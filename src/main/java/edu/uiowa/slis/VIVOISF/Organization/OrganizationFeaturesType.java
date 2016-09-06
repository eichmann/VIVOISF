package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationFeaturesIterator theOrganizationFeaturesIterator = (OrganizationFeaturesIterator)findAncestorWithClass(this, OrganizationFeaturesIterator.class);
			pageContext.getOut().print(theOrganizationFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for features tag ");
		}
		return SKIP_BODY;
	}
}

