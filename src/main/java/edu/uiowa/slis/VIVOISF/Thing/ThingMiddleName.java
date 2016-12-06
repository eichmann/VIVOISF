package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingMiddleNameIterator theThing = (ThingMiddleNameIterator)findAncestorWithClass(this, ThingMiddleNameIterator.class);
			pageContext.getOut().print(theThing.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for middleName tag ");
		}
		return SKIP_BODY;
	}
}

