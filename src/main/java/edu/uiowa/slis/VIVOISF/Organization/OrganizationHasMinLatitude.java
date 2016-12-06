package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasMinLatitudeIterator theOrganization = (OrganizationHasMinLatitudeIterator)findAncestorWithClass(this, OrganizationHasMinLatitudeIterator.class);
			pageContext.getOut().print(theOrganization.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

