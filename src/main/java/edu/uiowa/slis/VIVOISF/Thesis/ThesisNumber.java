package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisNumberIterator theThesis = (ThesisNumberIterator)findAncestorWithClass(this, ThesisNumberIterator.class);
			pageContext.getOut().print(theThesis.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for number tag ");
		}
		return SKIP_BODY;
	}
}

