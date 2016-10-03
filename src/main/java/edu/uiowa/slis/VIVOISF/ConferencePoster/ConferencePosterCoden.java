package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterCodenIterator theConferencePoster = (ConferencePosterCodenIterator)findAncestorWithClass(this, ConferencePosterCodenIterator.class);
			pageContext.getOut().print(theConferencePoster.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for coden tag ");
		}
		return SKIP_BODY;
	}
}

