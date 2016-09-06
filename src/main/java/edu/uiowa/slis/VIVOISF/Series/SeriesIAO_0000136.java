package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIAO_0000136Iterator theSeriesIAO_0000136Iterator = (SeriesIAO_0000136Iterator)findAncestorWithClass(this, SeriesIAO_0000136Iterator.class);
			pageContext.getOut().print(theSeriesIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

