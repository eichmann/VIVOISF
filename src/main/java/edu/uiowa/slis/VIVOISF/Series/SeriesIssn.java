package edu.uiowa.slis.VIVOISF.Series;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeriesIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeriesIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(SeriesIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SeriesIssnIterator theSeries = (SeriesIssnIterator)findAncestorWithClass(this, SeriesIssnIterator.class);
			pageContext.getOut().print(theSeries.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Series for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Series for issn tag ");
		}
		return SKIP_BODY;
	}
}

