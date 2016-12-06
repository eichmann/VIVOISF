package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameOfficialZHIterator theOrganization = (OrganizationNameOfficialZHIterator)findAncestorWithClass(this, OrganizationNameOfficialZHIterator.class);
			pageContext.getOut().print(theOrganization.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

