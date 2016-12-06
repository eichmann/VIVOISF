package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameListESIterator theOrganization = (OrganizationNameListESIterator)findAncestorWithClass(this, OrganizationNameListESIterator.class);
			pageContext.getOut().print(theOrganization.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

