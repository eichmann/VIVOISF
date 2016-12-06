package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingDateTimeValueIterator thenon_self_governingDateTimeValueIterator = (non_self_governingDateTimeValueIterator)findAncestorWithClass(this, non_self_governingDateTimeValueIterator.class);
			pageContext.getOut().print(thenon_self_governingDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

