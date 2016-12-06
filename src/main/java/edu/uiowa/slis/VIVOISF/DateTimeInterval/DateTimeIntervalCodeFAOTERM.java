package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeFAOTERMIterator theDateTimeInterval = (DateTimeIntervalCodeFAOTERMIterator)findAncestorWithClass(this, DateTimeIntervalCodeFAOTERMIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

