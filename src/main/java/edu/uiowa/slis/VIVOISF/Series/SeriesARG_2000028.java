package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesARG_2000028Iterator theSeriesARG_2000028Iterator = (SeriesARG_2000028Iterator)findAncestorWithClass(this, SeriesARG_2000028Iterator.class);
			pageContext.getOut().print(theSeriesARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

