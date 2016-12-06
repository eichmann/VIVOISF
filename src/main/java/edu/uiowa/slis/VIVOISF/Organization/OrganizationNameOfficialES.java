package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameOfficialESIterator theOrganization = (OrganizationNameOfficialESIterator)findAncestorWithClass(this, OrganizationNameOfficialESIterator.class);
			pageContext.getOut().print(theOrganization.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

