package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeFAOTERMIterator theConferencePaper = (ConferencePaperCodeFAOTERMIterator)findAncestorWithClass(this, ConferencePaperCodeFAOTERMIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

