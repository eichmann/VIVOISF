package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeAGROVOCIterator theThing = (ThingCodeAGROVOCIterator)findAncestorWithClass(this, ThingCodeAGROVOCIterator.class);
			pageContext.getOut().print(theThing.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

