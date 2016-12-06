package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCountryAreaTotalIterator theDataset = (DatasetCountryAreaTotalIterator)findAncestorWithClass(this, DatasetCountryAreaTotalIterator.class);
			pageContext.getOut().print(theDataset.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

