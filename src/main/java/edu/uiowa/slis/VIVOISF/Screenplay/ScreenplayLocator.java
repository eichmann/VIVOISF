package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ScreenplayLocatorIterator theScreenplay = (ScreenplayLocatorIterator)findAncestorWithClass(this, ScreenplayLocatorIterator.class);
			pageContext.getOut().print(theScreenplay.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for locator tag ");
		}
		return SKIP_BODY;
	}
}

