package edu.uiowa.slis.VIVOISF.Excerpt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExcerptPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExcerptPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ExcerptPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ExcerptPresentedAtIterator theExcerptPresentedAtIterator = (ExcerptPresentedAtIterator)findAncestorWithClass(this, ExcerptPresentedAtIterator.class);
			pageContext.getOut().print(theExcerptPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Excerpt for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Excerpt for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

