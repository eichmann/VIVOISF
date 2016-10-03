package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SeriesIssuerIterator theSeriesIssuerIterator = (SeriesIssuerIterator)findAncestorWithClass(this, SeriesIssuerIterator.class);
			pageContext.getOut().print(theSeriesIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for issuer tag ");
		}
		return SKIP_BODY;
	}
}

