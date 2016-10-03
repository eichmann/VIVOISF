package edu.uiowa.slis.VIVOISF.organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class organizationHasListName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static organizationHasListName currentInstance = null;
	private static final Log log = LogFactory.getLog(organizationHasListName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			organizationHasListNameIterator theorganization = (organizationHasListNameIterator)findAncestorWithClass(this, organizationHasListNameIterator.class);
			pageContext.getOut().print(theorganization.getHasListName());
		} catch (Exception e) {
			log.error("Can't find enclosing organization for hasListName tag ", e);
			throw new JspTagException("Error: Can't find enclosing organization for hasListName tag ");
		}
		return SKIP_BODY;
	}
}

