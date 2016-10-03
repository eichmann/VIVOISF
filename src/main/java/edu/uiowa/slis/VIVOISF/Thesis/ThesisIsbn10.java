package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisIsbn10Iterator theThesis = (ThesisIsbn10Iterator)findAncestorWithClass(this, ThesisIsbn10Iterator.class);
			pageContext.getOut().print(theThesis.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}
