package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameShortFRIterator theThing = (ThingNameShortFRIterator)findAncestorWithClass(this, ThingNameShortFRIterator.class);
			pageContext.getOut().print(theThing.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

