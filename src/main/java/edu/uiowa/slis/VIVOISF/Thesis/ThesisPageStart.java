package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisPageStartIterator theThesis = (ThesisPageStartIterator)findAncestorWithClass(this, ThesisPageStartIterator.class);
			pageContext.getOut().print(theThesis.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

