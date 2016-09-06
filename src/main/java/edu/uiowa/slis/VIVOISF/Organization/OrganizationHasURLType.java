package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasURLIterator theOrganizationHasURLIterator = (OrganizationHasURLIterator)findAncestorWithClass(this, OrganizationHasURLIterator.class);
			pageContext.getOut().print(theOrganizationHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

