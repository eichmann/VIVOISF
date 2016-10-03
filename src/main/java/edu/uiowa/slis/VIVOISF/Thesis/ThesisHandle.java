package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisHandleIterator theThesis = (ThesisHandleIterator)findAncestorWithClass(this, ThesisHandleIterator.class);
			pageContext.getOut().print(theThesis.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for handle tag ");
		}
		return SKIP_BODY;
	}
}

