package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptLocatorIterator theExcerpt = (ExcerptLocatorIterator)findAncestorWithClass(this, ExcerptLocatorIterator.class);
			pageContext.getOut().print(theExcerpt.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for locator tag ");
		}
		return SKIP_BODY;
	}
}

