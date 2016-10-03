package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterHandleIterator theConferencePoster = (ConferencePosterHandleIterator)findAncestorWithClass(this, ConferencePosterHandleIterator.class);
			pageContext.getOut().print(theConferencePoster.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for handle tag ");
		}
		return SKIP_BODY;
	}
}

