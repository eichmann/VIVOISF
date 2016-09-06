package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationFeaturesIterator theOrganizationFeaturesIterator = (OrganizationFeaturesIterator)findAncestorWithClass(this, OrganizationFeaturesIterator.class);
			pageContext.getOut().print(theOrganizationFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for features tag ");
		}
		return SKIP_BODY;
	}
}

