package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameShortZHIterator theOrganization = (OrganizationNameShortZHIterator)findAncestorWithClass(this, OrganizationNameShortZHIterator.class);
			pageContext.getOut().print(theOrganization.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

