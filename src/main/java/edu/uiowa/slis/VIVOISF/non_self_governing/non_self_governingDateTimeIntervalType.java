package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingDateTimeIntervalIterator thenon_self_governingDateTimeIntervalIterator = (non_self_governingDateTimeIntervalIterator)findAncestorWithClass(this, non_self_governingDateTimeIntervalIterator.class);
			pageContext.getOut().print(thenon_self_governingDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

