package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PatentLocatorIterator thePatent = (PatentLocatorIterator)findAncestorWithClass(this, PatentLocatorIterator.class);
			pageContext.getOut().print(thePatent.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for locator tag ");
		}
		return SKIP_BODY;
	}
}

