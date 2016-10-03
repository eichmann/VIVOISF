package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefLocatorIterator theBrief = (BriefLocatorIterator)findAncestorWithClass(this, BriefLocatorIterator.class);
			pageContext.getOut().print(theBrief.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for locator tag ");
		}
		return SKIP_BODY;
	}
}

