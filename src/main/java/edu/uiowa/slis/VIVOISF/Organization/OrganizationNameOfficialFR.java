package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameOfficialFRIterator theOrganization = (OrganizationNameOfficialFRIterator)findAncestorWithClass(this, OrganizationNameOfficialFRIterator.class);
			pageContext.getOut().print(theOrganization.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

