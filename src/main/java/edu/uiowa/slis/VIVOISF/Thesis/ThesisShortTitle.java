package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisShortTitleIterator theThesis = (ThesisShortTitleIterator)findAncestorWithClass(this, ThesisShortTitleIterator.class);
			pageContext.getOut().print(theThesis.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

