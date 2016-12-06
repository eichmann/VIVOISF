package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameOfficialARIterator theOrganization = (OrganizationNameOfficialARIterator)findAncestorWithClass(this, OrganizationNameOfficialARIterator.class);
			pageContext.getOut().print(theOrganization.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

