package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNationalityFRIterator theThing = (ThingNationalityFRIterator)findAncestorWithClass(this, ThingNationalityFRIterator.class);
			pageContext.getOut().print(theThing.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

