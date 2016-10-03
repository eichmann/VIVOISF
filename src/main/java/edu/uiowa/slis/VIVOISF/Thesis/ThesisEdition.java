package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisEditionIterator theThesis = (ThesisEditionIterator)findAncestorWithClass(this, ThesisEditionIterator.class);
			pageContext.getOut().print(theThesis.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for edition tag ");
		}
		return SKIP_BODY;
	}
}

