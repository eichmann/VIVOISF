package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationHasShortName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationHasShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationHasShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationHasShortNameIterator theorganization = (organizationHasShortNameIterator)findAncestorWithClass(this, organizationHasShortNameIterator.class);
			pageContext.getOut().print(theorganization.getHasShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for hasShortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for hasShortName tag ");
		}
		return SKIP_BODY;
	}
}

