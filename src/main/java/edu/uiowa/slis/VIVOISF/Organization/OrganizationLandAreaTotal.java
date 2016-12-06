package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationLandAreaTotalIterator theOrganization = (OrganizationLandAreaTotalIterator)findAncestorWithClass(this, OrganizationLandAreaTotalIterator.class);
			pageContext.getOut().print(theOrganization.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

