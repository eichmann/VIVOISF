package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameOfficialITIterator theThing = (ThingNameOfficialITIterator)findAncestorWithClass(this, ThingNameOfficialITIterator.class);
			pageContext.getOut().print(theThing.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

