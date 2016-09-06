package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisDoiIterator theThesis = (ThesisDoiIterator)findAncestorWithClass(this, ThesisDoiIterator.class);
			pageContext.getOut().print(theThesis.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for doi tag ");
		}
		return SKIP_BODY;
	}
}

