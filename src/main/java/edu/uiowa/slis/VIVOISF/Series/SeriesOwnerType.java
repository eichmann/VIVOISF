package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesOwnerIterator theSeriesOwnerIterator = (SeriesOwnerIterator)findAncestorWithClass(this, SeriesOwnerIterator.class);
			pageContext.getOut().print(theSeriesOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for owner tag ");
		}
		return SKIP_BODY;
	}
}
