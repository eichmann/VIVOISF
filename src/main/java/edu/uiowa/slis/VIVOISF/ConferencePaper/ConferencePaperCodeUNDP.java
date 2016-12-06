package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeUNDPIterator theConferencePaper = (ConferencePaperCodeUNDPIterator)findAncestorWithClass(this, ConferencePaperCodeUNDPIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

