package edu.uiowa.slis.VIVOISF.Statute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StatuteLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StatuteLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(StatuteLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StatuteLocatorIterator theStatute = (StatuteLocatorIterator)findAncestorWithClass(this, StatuteLocatorIterator.class);
			pageContext.getOut().print(theStatute.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Statute for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Statute for locator tag ");
		}
		return SKIP_BODY;
	}
}

