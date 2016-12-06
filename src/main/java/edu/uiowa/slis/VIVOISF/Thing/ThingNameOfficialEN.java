package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameOfficialENIterator theThing = (ThingNameOfficialENIterator)findAncestorWithClass(this, ThingNameOfficialENIterator.class);
			pageContext.getOut().print(theThing.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

