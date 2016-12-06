package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeUNDPIterator theThing = (ThingCodeUNDPIterator)findAncestorWithClass(this, ThingCodeUNDPIterator.class);
			pageContext.getOut().print(theThing.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

