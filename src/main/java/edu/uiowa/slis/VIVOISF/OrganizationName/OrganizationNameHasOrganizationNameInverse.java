package edu.uiowa.slis.VIVOISF.OrganizationName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameHasOrganizationNameInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameHasOrganizationNameInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameHasOrganizationNameInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationNameHasOrganizationNameInverseIterator theOrganizationNameHasOrganizationNameInverseIterator = (OrganizationNameHasOrganizationNameInverseIterator)findAncestorWithClass(this, OrganizationNameHasOrganizationNameInverseIterator.class);
			pageContext.getOut().print(theOrganizationNameHasOrganizationNameInverseIterator.getHasOrganizationNameInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationName for hasOrganizationName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for hasOrganizationName tag ");
		}
		return SKIP_BODY;
	}
}

