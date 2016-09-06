package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisTheAbstractIterator theThesis = (ThesisTheAbstractIterator)findAncestorWithClass(this, ThesisTheAbstractIterator.class);
			pageContext.getOut().print(theThesis.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

