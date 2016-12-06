package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameOfficialRUIterator theThing = (ThingNameOfficialRUIterator)findAncestorWithClass(this, ThingNameOfficialRUIterator.class);
			pageContext.getOut().print(theThing.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

