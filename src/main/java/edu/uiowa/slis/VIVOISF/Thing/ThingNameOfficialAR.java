package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameOfficialARIterator theThing = (ThingNameOfficialARIterator)findAncestorWithClass(this, ThingNameOfficialARIterator.class);
			pageContext.getOut().print(theThing.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

