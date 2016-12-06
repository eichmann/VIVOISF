package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameListFRIterator theThing = (ThingNameListFRIterator)findAncestorWithClass(this, ThingNameListFRIterator.class);
			pageContext.getOut().print(theThing.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

