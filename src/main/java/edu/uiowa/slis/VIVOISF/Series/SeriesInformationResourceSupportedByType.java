package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesInformationResourceSupportedByIterator theSeriesInformationResourceSupportedByIterator = (SeriesInformationResourceSupportedByIterator)findAncestorWithClass(this, SeriesInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theSeriesInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

