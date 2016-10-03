package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisAsinIterator theThesis = (ThesisAsinIterator)findAncestorWithClass(this, ThesisAsinIterator.class);
			pageContext.getOut().print(theThesis.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for asin tag ");
		}
		return SKIP_BODY;
	}
}
