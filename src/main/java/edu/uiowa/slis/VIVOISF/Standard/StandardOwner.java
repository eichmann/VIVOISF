package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardOwnerIterator theStandardOwnerIterator = (StandardOwnerIterator)findAncestorWithClass(this, StandardOwnerIterator.class);
			pageContext.getOut().print(theStandardOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for owner tag ");
		}
		return SKIP_BODY;
	}
}

