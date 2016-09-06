package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasGeoIterator theOrganizationHasGeoIterator = (OrganizationHasGeoIterator)findAncestorWithClass(this, OrganizationHasGeoIterator.class);
			pageContext.getOut().print(theOrganizationHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

