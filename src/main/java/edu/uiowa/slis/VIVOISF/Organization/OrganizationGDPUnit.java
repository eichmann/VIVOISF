package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationGDPUnitIterator theOrganization = (OrganizationGDPUnitIterator)findAncestorWithClass(this, OrganizationGDPUnitIterator.class);
			pageContext.getOut().print(theOrganization.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

