package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameShortARIterator theThing = (ThingNameShortARIterator)findAncestorWithClass(this, ThingNameShortARIterator.class);
			pageContext.getOut().print(theThing.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

