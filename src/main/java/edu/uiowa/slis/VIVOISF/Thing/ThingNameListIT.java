package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameListITIterator theThing = (ThingNameListITIterator)findAncestorWithClass(this, ThingNameListITIterator.class);
			pageContext.getOut().print(theThing.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

