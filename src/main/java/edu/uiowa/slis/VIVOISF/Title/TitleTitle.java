package edu.uiowa.slis.VIVOISF.Title;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TitleTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TitleTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(TitleTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TitleTitleIterator theTitle = (TitleTitleIterator)findAncestorWithClass(this, TitleTitleIterator.class);
			pageContext.getOut().print(theTitle.getTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Title for title tag ", e);
			throw new JspTagException("Error: Can't find enclosing Title for title tag ");
		}
		return SKIP_BODY;
	}
}

