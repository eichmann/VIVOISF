package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsDateTimeValueIterator theProceedingsDateTimeValueIterator = (ProceedingsDateTimeValueIterator)findAncestorWithClass(this, ProceedingsDateTimeValueIterator.class);
			pageContext.getOut().print(theProceedingsDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

