package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasNameIterator theOrganizationHasNameIterator = (OrganizationHasNameIterator)findAncestorWithClass(this, OrganizationHasNameIterator.class);
			pageContext.getOut().print(theOrganizationHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasName tag ");
		}
		return SKIP_BODY;
	}
}

