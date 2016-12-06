package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameListITIterator theOrganization = (OrganizationNameListITIterator)findAncestorWithClass(this, OrganizationNameListITIterator.class);
			pageContext.getOut().print(theOrganization.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

