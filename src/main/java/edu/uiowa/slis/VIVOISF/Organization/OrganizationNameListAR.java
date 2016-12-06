package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameListARIterator theOrganization = (OrganizationNameListARIterator)findAncestorWithClass(this, OrganizationNameListARIterator.class);
			pageContext.getOut().print(theOrganization.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

