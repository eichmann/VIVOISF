package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptOclcnumIterator theExcerpt = (ExcerptOclcnumIterator)findAncestorWithClass(this, ExcerptOclcnumIterator.class);
			pageContext.getOut().print(theExcerpt.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

