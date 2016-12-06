package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNationalityRUIterator theThing = (ThingNationalityRUIterator)findAncestorWithClass(this, ThingNationalityRUIterator.class);
			pageContext.getOut().print(theThing.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

