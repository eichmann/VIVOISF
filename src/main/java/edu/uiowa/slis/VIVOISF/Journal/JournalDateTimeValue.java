package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalDateTimeValueIterator theJournalDateTimeValueIterator = (JournalDateTimeValueIterator)findAncestorWithClass(this, JournalDateTimeValueIterator.class);
			pageContext.getOut().print(theJournalDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}
