package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationAgriculturalAreaTotalIterator theOrganization = (OrganizationAgriculturalAreaTotalIterator)findAncestorWithClass(this, OrganizationAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theOrganization.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

