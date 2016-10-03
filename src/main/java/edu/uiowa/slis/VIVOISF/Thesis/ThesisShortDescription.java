package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisShortDescriptionIterator theThesis = (ThesisShortDescriptionIterator)findAncestorWithClass(this, ThesisShortDescriptionIterator.class);
			pageContext.getOut().print(theThesis.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

