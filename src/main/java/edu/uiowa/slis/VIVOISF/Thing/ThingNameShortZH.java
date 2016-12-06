package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameShortZHIterator theThing = (ThingNameShortZHIterator)findAncestorWithClass(this, ThingNameShortZHIterator.class);
			pageContext.getOut().print(theThing.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

