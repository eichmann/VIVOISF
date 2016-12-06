package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeUNIterator theConferencePaper = (ConferencePaperCodeUNIterator)findAncestorWithClass(this, ConferencePaperCodeUNIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

