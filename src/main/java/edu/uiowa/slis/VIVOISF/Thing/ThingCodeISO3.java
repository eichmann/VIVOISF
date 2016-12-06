package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeISO3Iterator theThing = (ThingCodeISO3Iterator)findAncestorWithClass(this, ThingCodeISO3Iterator.class);
			pageContext.getOut().print(theThing.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

