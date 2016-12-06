package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameShortRUIterator theThing = (ThingNameShortRUIterator)findAncestorWithClass(this, ThingNameShortRUIterator.class);
			pageContext.getOut().print(theThing.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

