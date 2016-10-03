package edu.uiowa.slis.VIVOISF.Legislation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LegislationLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LegislationLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(LegislationLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LegislationLocatorIterator theLegislation = (LegislationLocatorIterator)findAncestorWithClass(this, LegislationLocatorIterator.class);
			pageContext.getOut().print(theLegislation.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Legislation for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Legislation for locator tag ");
		}
		return SKIP_BODY;
	}
}

