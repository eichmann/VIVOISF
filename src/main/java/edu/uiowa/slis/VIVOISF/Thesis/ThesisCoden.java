package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisCodenIterator theThesis = (ThesisCodenIterator)findAncestorWithClass(this, ThesisCodenIterator.class);
			pageContext.getOut().print(theThesis.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for coden tag ");
		}
		return SKIP_BODY;
	}
}

