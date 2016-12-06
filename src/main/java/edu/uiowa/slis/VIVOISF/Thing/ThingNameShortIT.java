package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameShortITIterator theThing = (ThingNameShortITIterator)findAncestorWithClass(this, ThingNameShortITIterator.class);
			pageContext.getOut().print(theThing.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

