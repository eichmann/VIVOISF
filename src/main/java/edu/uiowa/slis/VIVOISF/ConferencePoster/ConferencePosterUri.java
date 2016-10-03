package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterUriIterator theConferencePoster = (ConferencePosterUriIterator)findAncestorWithClass(this, ConferencePosterUriIterator.class);
			pageContext.getOut().print(theConferencePoster.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for uri tag ");
		}
		return SKIP_BODY;
	}
}

