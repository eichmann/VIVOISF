package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindDateTimeIntervalType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindDateTimeIntervalType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindDateTimeIntervalType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindDateTimeIntervalIterator theKindDateTimeIntervalIterator = (KindDateTimeIntervalIterator)findAncestorWithClass(this, KindDateTimeIntervalIterator.class);
			pageContext.getOut().print(theKindDateTimeIntervalIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

