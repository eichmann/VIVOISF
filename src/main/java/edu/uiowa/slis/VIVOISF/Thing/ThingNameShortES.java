package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameShortESIterator theThing = (ThingNameShortESIterator)findAncestorWithClass(this, ThingNameShortESIterator.class);
			pageContext.getOut().print(theThing.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

