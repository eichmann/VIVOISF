package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeGAULIterator theThing = (ThingCodeGAULIterator)findAncestorWithClass(this, ThingCodeGAULIterator.class);
			pageContext.getOut().print(theThing.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

