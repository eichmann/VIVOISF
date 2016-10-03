package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesDistributorIterator theSeriesDistributorIterator = (SeriesDistributorIterator)findAncestorWithClass(this, SeriesDistributorIterator.class);
			pageContext.getOut().print(theSeriesDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for distributor tag ");
		}
		return SKIP_BODY;
	}
}

