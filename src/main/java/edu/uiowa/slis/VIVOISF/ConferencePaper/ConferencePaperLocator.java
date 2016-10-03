package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperLocatorIterator theConferencePaper = (ConferencePaperLocatorIterator)findAncestorWithClass(this, ConferencePaperLocatorIterator.class);
			pageContext.getOut().print(theConferencePaper.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for locator tag ");
		}
		return SKIP_BODY;
	}
}

