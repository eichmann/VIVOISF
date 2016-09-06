package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationHasAddressIterator theOrganizationHasAddressIterator = (OrganizationHasAddressIterator)findAncestorWithClass(this, OrganizationHasAddressIterator.class);
			pageContext.getOut().print(theOrganizationHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

