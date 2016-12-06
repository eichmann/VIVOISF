package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameOfficialESIterator theThing = (ThingNameOfficialESIterator)findAncestorWithClass(this, ThingNameOfficialESIterator.class);
			pageContext.getOut().print(theThing.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

