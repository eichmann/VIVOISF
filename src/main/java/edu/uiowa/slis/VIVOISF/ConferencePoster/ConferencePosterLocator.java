package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterLocatorIterator theConferencePoster = (ConferencePosterLocatorIterator)findAncestorWithClass(this, ConferencePosterLocatorIterator.class);
			pageContext.getOut().print(theConferencePoster.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for locator tag ");
		}
		return SKIP_BODY;
	}
}

