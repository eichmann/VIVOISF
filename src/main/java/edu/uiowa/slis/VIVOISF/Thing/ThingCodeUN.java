package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeUNIterator theThing = (ThingCodeUNIterator)findAncestorWithClass(this, ThingCodeUNIterator.class);
			pageContext.getOut().print(theThing.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

