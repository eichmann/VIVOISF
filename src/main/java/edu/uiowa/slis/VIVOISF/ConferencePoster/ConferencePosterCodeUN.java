package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeUNIterator theConferencePoster = (ConferencePosterCodeUNIterator)findAncestorWithClass(this, ConferencePosterCodeUNIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

