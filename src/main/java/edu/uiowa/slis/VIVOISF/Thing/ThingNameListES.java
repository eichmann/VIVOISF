package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameListESIterator theThing = (ThingNameListESIterator)findAncestorWithClass(this, ThingNameListESIterator.class);
			pageContext.getOut().print(theThing.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

