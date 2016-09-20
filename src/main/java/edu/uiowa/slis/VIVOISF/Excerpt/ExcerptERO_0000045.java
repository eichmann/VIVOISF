package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExcerptERO_0000045Iterator theExcerpt = (ExcerptERO_0000045Iterator)findAncestorWithClass(this, ExcerptERO_0000045Iterator.class);
			pageContext.getOut().print(theExcerpt.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

