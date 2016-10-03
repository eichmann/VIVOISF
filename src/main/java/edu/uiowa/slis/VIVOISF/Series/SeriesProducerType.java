package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesProducerIterator theSeriesProducerIterator = (SeriesProducerIterator)findAncestorWithClass(this, SeriesProducerIterator.class);
			pageContext.getOut().print(theSeriesProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for producer tag ");
		}
		return SKIP_BODY;
	}
}

