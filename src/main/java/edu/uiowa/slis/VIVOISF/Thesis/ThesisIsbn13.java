package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisIsbn13Iterator theThesis = (ThesisIsbn13Iterator)findAncestorWithClass(this, ThesisIsbn13Iterator.class);
			pageContext.getOut().print(theThesis.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

