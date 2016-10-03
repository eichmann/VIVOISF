package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisLocatorIterator theThesis = (ThesisLocatorIterator)findAncestorWithClass(this, ThesisLocatorIterator.class);
			pageContext.getOut().print(theThesis.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for locator tag ");
		}
		return SKIP_BODY;
	}
}

