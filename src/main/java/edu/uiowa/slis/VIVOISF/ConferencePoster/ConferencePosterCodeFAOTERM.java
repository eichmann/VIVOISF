package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeFAOTERMIterator theConferencePoster = (ConferencePosterCodeFAOTERMIterator)findAncestorWithClass(this, ConferencePosterCodeFAOTERMIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

