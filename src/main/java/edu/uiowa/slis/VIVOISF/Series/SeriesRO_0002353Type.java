package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesRO_0002353Iterator theSeriesRO_0002353Iterator = (SeriesRO_0002353Iterator)findAncestorWithClass(this, SeriesRO_0002353Iterator.class);
			pageContext.getOut().print(theSeriesRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

