package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisNumPagesIterator theThesis = (ThesisNumPagesIterator)findAncestorWithClass(this, ThesisNumPagesIterator.class);
			pageContext.getOut().print(theThesis.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for numPages tag ");
		}
		return SKIP_BODY;
	}
}

