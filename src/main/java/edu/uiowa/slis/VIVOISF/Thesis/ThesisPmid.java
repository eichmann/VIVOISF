package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisPmidIterator theThesis = (ThesisPmidIterator)findAncestorWithClass(this, ThesisPmidIterator.class);
			pageContext.getOut().print(theThesis.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for pmid tag ");
		}
		return SKIP_BODY;
	}
}

