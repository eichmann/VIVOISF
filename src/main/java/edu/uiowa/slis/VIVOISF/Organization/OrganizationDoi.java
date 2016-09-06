package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationDoiIterator theOrganization = (OrganizationDoiIterator)findAncestorWithClass(this, OrganizationDoiIterator.class);
			pageContext.getOut().print(theOrganization.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for doi tag ");
		}
		return SKIP_BODY;
	}
}

