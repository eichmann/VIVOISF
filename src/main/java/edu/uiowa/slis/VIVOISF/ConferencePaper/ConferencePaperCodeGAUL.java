package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperCodeGAULIterator theConferencePaper = (ConferencePaperCodeGAULIterator)findAncestorWithClass(this, ConferencePaperCodeGAULIterator.class);
			pageContext.getOut().print(theConferencePaper.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

