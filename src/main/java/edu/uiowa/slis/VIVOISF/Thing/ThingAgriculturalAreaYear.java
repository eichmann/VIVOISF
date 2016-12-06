package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingAgriculturalAreaYearIterator theThing = (ThingAgriculturalAreaYearIterator)findAncestorWithClass(this, ThingAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theThing.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

