package edu.uiowa.slis.VIVOISF.DateTimeValue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DateTimeValueCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DateTimeValueCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(DateTimeValueCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DateTimeValueCodeDBPediaIDIterator theDateTimeValue = (DateTimeValueCodeDBPediaIDIterator)findAncestorWithClass(this, DateTimeValueCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theDateTimeValue.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing DateTimeValue for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing DateTimeValue for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

