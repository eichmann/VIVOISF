package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardLocatorIterator theStandard = (StandardLocatorIterator)findAncestorWithClass(this, StandardLocatorIterator.class);
			pageContext.getOut().print(theStandard.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for locator tag ");
		}
		return SKIP_BODY;
	}
}

