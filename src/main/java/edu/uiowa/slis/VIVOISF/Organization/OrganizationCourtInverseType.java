package edu.uiowa.slis.VIVOISF.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationCourtInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationCourtInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationCourtInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationCourtInverseIterator theOrganizationCourtInverseIterator = (OrganizationCourtInverseIterator)findAncestorWithClass(this, OrganizationCourtInverseIterator.class);
			pageContext.getOut().print(theOrganizationCourtInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for court tag ");
		}
		return SKIP_BODY;
	}
}

