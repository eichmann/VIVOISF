package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindDateTimeValueIterator theKindDateTimeValueIterator = (KindDateTimeValueIterator)findAncestorWithClass(this, KindDateTimeValueIterator.class);
			pageContext.getOut().print(theKindDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

