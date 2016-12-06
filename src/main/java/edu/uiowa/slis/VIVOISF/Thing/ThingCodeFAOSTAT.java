package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeFAOSTATIterator theThing = (ThingCodeFAOSTATIterator)findAncestorWithClass(this, ThingCodeFAOSTATIterator.class);
			pageContext.getOut().print(theThing.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

