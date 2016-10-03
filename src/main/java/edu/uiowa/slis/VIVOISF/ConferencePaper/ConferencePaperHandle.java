package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHandleIterator theConferencePaper = (ConferencePaperHandleIterator)findAncestorWithClass(this, ConferencePaperHandleIterator.class);
			pageContext.getOut().print(theConferencePaper.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for handle tag ");
		}
		return SKIP_BODY;
	}
}

