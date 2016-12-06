package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasMinLongitudeIterator theOrganization = (OrganizationHasMinLongitudeIterator)findAncestorWithClass(this, OrganizationHasMinLongitudeIterator.class);
			pageContext.getOut().print(theOrganization.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

