package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationLandAreaUnitIterator theOrganization = (OrganizationLandAreaUnitIterator)findAncestorWithClass(this, OrganizationLandAreaUnitIterator.class);
			pageContext.getOut().print(theOrganization.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

