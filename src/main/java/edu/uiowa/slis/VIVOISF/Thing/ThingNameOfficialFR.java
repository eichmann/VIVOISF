package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameOfficialFRIterator theThing = (ThingNameOfficialFRIterator)findAncestorWithClass(this, ThingNameOfficialFRIterator.class);
			pageContext.getOut().print(theThing.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

