package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameListARIterator theThing = (ThingNameListARIterator)findAncestorWithClass(this, ThingNameListARIterator.class);
			pageContext.getOut().print(theThing.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

