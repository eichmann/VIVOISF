package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeFAOTERMIterator theDateTimeValue = (DateTimeValueCodeFAOTERMIterator)findAncestorWithClass(this, DateTimeValueCodeFAOTERMIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

