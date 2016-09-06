package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesRO_0000056Iterator theSeriesRO_0000056Iterator = (SeriesRO_0000056Iterator)findAncestorWithClass(this, SeriesRO_0000056Iterator.class);
			pageContext.getOut().print(theSeriesRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

