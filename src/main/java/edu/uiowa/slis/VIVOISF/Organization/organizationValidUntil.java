package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationValidUntilIterator theorganization = (organizationValidUntilIterator)findAncestorWithClass(this, organizationValidUntilIterator.class);
			pageContext.getOut().print(theorganization.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

