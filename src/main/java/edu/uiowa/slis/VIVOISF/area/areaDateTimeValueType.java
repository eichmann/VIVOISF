package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(areaDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaDateTimeValueIterator theareaDateTimeValueIterator = (areaDateTimeValueIterator)findAncestorWithClass(this, areaDateTimeValueIterator.class);
			pageContext.getOut().print(theareaDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing area for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

