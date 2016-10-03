package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceLocatorIterator theReferenceSource = (ReferenceSourceLocatorIterator)findAncestorWithClass(this, ReferenceSourceLocatorIterator.class);
			pageContext.getOut().print(theReferenceSource.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for locator tag ");
		}
		return SKIP_BODY;
	}
}

