package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameListFRIterator theOrganization = (OrganizationNameListFRIterator)findAncestorWithClass(this, OrganizationNameListFRIterator.class);
			pageContext.getOut().print(theOrganization.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

