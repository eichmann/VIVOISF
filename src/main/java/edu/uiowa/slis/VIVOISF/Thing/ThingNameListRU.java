package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameListRUIterator theThing = (ThingNameListRUIterator)findAncestorWithClass(this, ThingNameListRUIterator.class);
			pageContext.getOut().print(theThing.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

