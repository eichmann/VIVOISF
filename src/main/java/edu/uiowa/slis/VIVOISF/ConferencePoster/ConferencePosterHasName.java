package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHasNameIterator theConferencePosterHasNameIterator = (ConferencePosterHasNameIterator)findAncestorWithClass(this, ConferencePosterHasNameIterator.class);
			pageContext.getOut().print(theConferencePosterHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for hasName tag ");
		}
		return SKIP_BODY;
	}
}

