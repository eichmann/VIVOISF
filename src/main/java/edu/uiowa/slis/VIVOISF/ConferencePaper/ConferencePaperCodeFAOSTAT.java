package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeFAOSTATIterator theConferencePaper = (ConferencePaperCodeFAOSTATIterator)findAncestorWithClass(this, ConferencePaperCodeFAOSTATIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

