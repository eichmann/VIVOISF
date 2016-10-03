package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNumberIterator theConferencePoster = (ConferencePosterNumberIterator)findAncestorWithClass(this, ConferencePosterNumberIterator.class);
			pageContext.getOut().print(theConferencePoster.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for number tag ");
		}
		return SKIP_BODY;
	}
}

