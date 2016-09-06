package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisStatusIterator theThesisStatusIterator = (ThesisStatusIterator)findAncestorWithClass(this, ThesisStatusIterator.class);
			pageContext.getOut().print(theThesisStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for status tag ");
		}
		return SKIP_BODY;
	}
}

