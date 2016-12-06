package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationHDITotalIterator theOrganization = (OrganizationHDITotalIterator)findAncestorWithClass(this, OrganizationHDITotalIterator.class);
			pageContext.getOut().print(theOrganization.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

