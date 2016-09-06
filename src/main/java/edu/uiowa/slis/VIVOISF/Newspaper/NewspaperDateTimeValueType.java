package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NewspaperDateTimeValueIterator theNewspaperDateTimeValueIterator = (NewspaperDateTimeValueIterator)findAncestorWithClass(this, NewspaperDateTimeValueIterator.class);
			pageContext.getOut().print(theNewspaperDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

