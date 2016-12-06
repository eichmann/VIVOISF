package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNationalityARIterator theThing = (ThingNationalityARIterator)findAncestorWithClass(this, ThingNationalityARIterator.class);
			pageContext.getOut().print(theThing.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

