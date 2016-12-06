package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameShortESIterator theOrganization = (OrganizationNameShortESIterator)findAncestorWithClass(this, OrganizationNameShortESIterator.class);
			pageContext.getOut().print(theOrganization.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

