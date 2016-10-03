package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterContentIterator theConferencePoster = (ConferencePosterContentIterator)findAncestorWithClass(this, ConferencePosterContentIterator.class);
			pageContext.getOut().print(theConferencePoster.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for content tag ");
		}
		return SKIP_BODY;
	}
}

