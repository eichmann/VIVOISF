package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionDateTimeValueIterator thegeographical_regionDateTimeValueIterator = (geographical_regionDateTimeValueIterator)findAncestorWithClass(this, geographical_regionDateTimeValueIterator.class);
			pageContext.getOut().print(thegeographical_regionDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

