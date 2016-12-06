package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeISO2Iterator theThing = (ThingCodeISO2Iterator)findAncestorWithClass(this, ThingCodeISO2Iterator.class);
			pageContext.getOut().print(theThing.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

