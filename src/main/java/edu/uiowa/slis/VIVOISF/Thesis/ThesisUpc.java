package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisUpcIterator theThesis = (ThesisUpcIterator)findAncestorWithClass(this, ThesisUpcIterator.class);
			pageContext.getOut().print(theThesis.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for upc tag ");
		}
		return SKIP_BODY;
	}
}

