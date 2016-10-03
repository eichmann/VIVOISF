package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPageEndIterator theConferencePoster = (ConferencePosterPageEndIterator)findAncestorWithClass(this, ConferencePosterPageEndIterator.class);
			pageContext.getOut().print(theConferencePoster.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

