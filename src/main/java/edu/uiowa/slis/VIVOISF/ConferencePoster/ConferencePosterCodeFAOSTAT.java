package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeFAOSTATIterator theConferencePoster = (ConferencePosterCodeFAOSTATIterator)findAncestorWithClass(this, ConferencePosterCodeFAOSTATIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

