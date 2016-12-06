package edu.uiowa.slis.VIVOISF.DateTimeInterval;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeIntervalCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeIntervalCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeIntervalCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeIntervalCodeDBPediaIDIterator theDateTimeInterval = (DateTimeIntervalCodeDBPediaIDIterator)findAncestorWithClass(this, DateTimeIntervalCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theDateTimeInterval.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeInterval for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeInterval for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

