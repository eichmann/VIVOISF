package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(KindDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindDateTimeIntervalIterator theKindDateTimeIntervalIterator = (KindDateTimeIntervalIterator)findAncestorWithClass(this, KindDateTimeIntervalIterator.class);
			pageContext.getOut().print(theKindDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

