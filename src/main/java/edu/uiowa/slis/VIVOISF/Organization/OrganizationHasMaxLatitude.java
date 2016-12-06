package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasMaxLatitudeIterator theOrganization = (OrganizationHasMaxLatitudeIterator)findAncestorWithClass(this, OrganizationHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theOrganization.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

