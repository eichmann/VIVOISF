package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationRelatedByIterator theOrganizationRelatedByIterator = (OrganizationRelatedByIterator)findAncestorWithClass(this, OrganizationRelatedByIterator.class);
			pageContext.getOut().print(theOrganizationRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

