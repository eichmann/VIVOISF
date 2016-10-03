package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisUriIterator theThesis = (ThesisUriIterator)findAncestorWithClass(this, ThesisUriIterator.class);
			pageContext.getOut().print(theThesis.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for uri tag ");
		}
		return SKIP_BODY;
	}
}

