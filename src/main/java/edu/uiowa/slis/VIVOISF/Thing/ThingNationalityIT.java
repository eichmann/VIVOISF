package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNationalityITIterator theThing = (ThingNationalityITIterator)findAncestorWithClass(this, ThingNationalityITIterator.class);
			pageContext.getOut().print(theThing.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

