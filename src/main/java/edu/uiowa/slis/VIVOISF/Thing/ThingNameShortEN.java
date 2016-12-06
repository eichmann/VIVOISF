package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameShortENIterator theThing = (ThingNameShortENIterator)findAncestorWithClass(this, ThingNameShortENIterator.class);
			pageContext.getOut().print(theThing.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

