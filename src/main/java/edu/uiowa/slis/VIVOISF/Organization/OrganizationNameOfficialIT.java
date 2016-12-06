package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameOfficialITIterator theOrganization = (OrganizationNameOfficialITIterator)findAncestorWithClass(this, OrganizationNameOfficialITIterator.class);
			pageContext.getOut().print(theOrganization.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

