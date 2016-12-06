package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNationalityENIterator theThing = (ThingNationalityENIterator)findAncestorWithClass(this, ThingNationalityENIterator.class);
			pageContext.getOut().print(theThing.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

