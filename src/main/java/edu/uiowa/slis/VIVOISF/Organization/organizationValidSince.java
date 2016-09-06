package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationValidSince extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationValidSince currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationValidSince.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationValidSinceIterator theorganization = (organizationValidSinceIterator)findAncestorWithClass(this, organizationValidSinceIterator.class);
			pageContext.getOut().print(theorganization.getValidSince());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for validSince tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for validSince tag ");
		}
		return SKIP_BODY;
	}
}

