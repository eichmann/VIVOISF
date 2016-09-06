package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesFeaturesIterator theSeriesFeaturesIterator = (SeriesFeaturesIterator)findAncestorWithClass(this, SeriesFeaturesIterator.class);
			pageContext.getOut().print(theSeriesFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for features tag ");
		}
		return SKIP_BODY;
	}
}

