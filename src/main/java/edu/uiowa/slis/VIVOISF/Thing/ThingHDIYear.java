package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHDIYearIterator theThing = (ThingHDIYearIterator)findAncestorWithClass(this, ThingHDIYearIterator.class);
			pageContext.getOut().print(theThing.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

