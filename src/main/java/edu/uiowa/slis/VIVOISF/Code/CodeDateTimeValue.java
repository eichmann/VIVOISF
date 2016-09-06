package edu.uiowa.slis.VIVOISF.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CodeDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeDateTimeValueIterator theCodeDateTimeValueIterator = (CodeDateTimeValueIterator)findAncestorWithClass(this, CodeDateTimeValueIterator.class);
			pageContext.getOut().print(theCodeDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

