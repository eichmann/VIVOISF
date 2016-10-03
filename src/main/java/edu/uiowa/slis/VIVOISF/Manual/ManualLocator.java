package edu.uiowa.slis.VIVOISF.Manual;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ManualLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ManualLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ManualLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ManualLocatorIterator theManual = (ManualLocatorIterator)findAncestorWithClass(this, ManualLocatorIterator.class);
			pageContext.getOut().print(theManual.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Manual for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Manual for locator tag ");
		}
		return SKIP_BODY;
	}
}

