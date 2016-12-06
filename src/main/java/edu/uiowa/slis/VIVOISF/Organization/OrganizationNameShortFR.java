package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameShortFRIterator theOrganization = (OrganizationNameShortFRIterator)findAncestorWithClass(this, OrganizationNameShortFRIterator.class);
			pageContext.getOut().print(theOrganization.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

