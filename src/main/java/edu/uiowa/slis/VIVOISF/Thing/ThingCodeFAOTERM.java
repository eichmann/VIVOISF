package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingCodeFAOTERMIterator theThing = (ThingCodeFAOTERMIterator)findAncestorWithClass(this, ThingCodeFAOTERMIterator.class);
			pageContext.getOut().print(theThing.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

