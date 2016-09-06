package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterStatusIterator theConferencePosterStatusIterator = (ConferencePosterStatusIterator)findAncestorWithClass(this, ConferencePosterStatusIterator.class);
			pageContext.getOut().print(theConferencePosterStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for status tag ");
		}
		return SKIP_BODY;
	}
}

