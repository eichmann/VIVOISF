package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterDateTimeValueIterator theConferencePosterDateTimeValueIterator = (ConferencePosterDateTimeValueIterator)findAncestorWithClass(this, ConferencePosterDateTimeValueIterator.class);
			pageContext.getOut().print(theConferencePosterDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

