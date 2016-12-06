package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodeUNDPIterator theConferencePoster = (ConferencePosterCodeUNDPIterator)findAncestorWithClass(this, ConferencePosterCodeUNDPIterator.class);
			pageContext.getOut().print(theConferencePoster.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

