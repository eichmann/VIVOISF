package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameShortARIterator theOrganization = (OrganizationNameShortARIterator)findAncestorWithClass(this, OrganizationNameShortARIterator.class);
			pageContext.getOut().print(theOrganization.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

