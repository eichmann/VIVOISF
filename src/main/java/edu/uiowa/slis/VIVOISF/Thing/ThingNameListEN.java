package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameListENIterator theThing = (ThingNameListENIterator)findAncestorWithClass(this, ThingNameListENIterator.class);
			pageContext.getOut().print(theThing.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

