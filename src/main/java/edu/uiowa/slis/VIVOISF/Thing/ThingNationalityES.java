package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNationalityESIterator theThing = (ThingNationalityESIterator)findAncestorWithClass(this, ThingNationalityESIterator.class);
			pageContext.getOut().print(theThing.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

