package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCountryAreaYearIterator theDataset = (DatasetCountryAreaYearIterator)findAncestorWithClass(this, DatasetCountryAreaYearIterator.class);
			pageContext.getOut().print(theDataset.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

