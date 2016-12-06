package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingGDPYearIterator theThing = (ThingGDPYearIterator)findAncestorWithClass(this, ThingGDPYearIterator.class);
			pageContext.getOut().print(theThing.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

