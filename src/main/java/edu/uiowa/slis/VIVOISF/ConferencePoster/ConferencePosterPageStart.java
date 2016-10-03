package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterPageStartIterator theConferencePoster = (ConferencePosterPageStartIterator)findAncestorWithClass(this, ConferencePosterPageStartIterator.class);
			pageContext.getOut().print(theConferencePoster.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

