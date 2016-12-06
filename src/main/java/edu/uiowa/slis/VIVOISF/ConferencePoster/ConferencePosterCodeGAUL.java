package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeGAULIterator theConferencePoster = (ConferencePosterCodeGAULIterator)findAncestorWithClass(this, ConferencePosterCodeGAULIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

