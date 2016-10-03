package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisSectionIterator theThesis = (ThesisSectionIterator)findAncestorWithClass(this, ThesisSectionIterator.class);
			pageContext.getOut().print(theThesis.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for section tag ");
		}
		return SKIP_BODY;
	}
}

