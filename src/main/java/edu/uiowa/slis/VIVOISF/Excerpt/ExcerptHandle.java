package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptHandleIterator theExcerpt = (ExcerptHandleIterator)findAncestorWithClass(this, ExcerptHandleIterator.class);
			pageContext.getOut().print(theExcerpt.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for handle tag ");
		}
		return SKIP_BODY;
	}
}

