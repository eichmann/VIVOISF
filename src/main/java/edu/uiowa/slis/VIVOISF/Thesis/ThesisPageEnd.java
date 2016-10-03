package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisPageEndIterator theThesis = (ThesisPageEndIterator)findAncestorWithClass(this, ThesisPageEndIterator.class);
			pageContext.getOut().print(theThesis.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

