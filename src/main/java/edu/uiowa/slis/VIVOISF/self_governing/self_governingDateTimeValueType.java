package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingDateTimeValueIterator theself_governingDateTimeValueIterator = (self_governingDateTimeValueIterator)findAncestorWithClass(this, self_governingDateTimeValueIterator.class);
			pageContext.getOut().print(theself_governingDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

