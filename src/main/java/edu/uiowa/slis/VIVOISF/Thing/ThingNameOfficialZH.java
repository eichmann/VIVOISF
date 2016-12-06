package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameOfficialZHIterator theThing = (ThingNameOfficialZHIterator)findAncestorWithClass(this, ThingNameOfficialZHIterator.class);
			pageContext.getOut().print(theThing.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

