package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameShortITIterator theOrganization = (OrganizationNameShortITIterator)findAncestorWithClass(this, OrganizationNameShortITIterator.class);
			pageContext.getOut().print(theOrganization.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

