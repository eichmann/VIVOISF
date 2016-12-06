package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameListZHIterator theThing = (ThingNameListZHIterator)findAncestorWithClass(this, ThingNameListZHIterator.class);
			pageContext.getOut().print(theThing.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

