package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetCountryAreaUnitIterator theDataset = (DatasetCountryAreaUnitIterator)findAncestorWithClass(this, DatasetCountryAreaUnitIterator.class);
			pageContext.getOut().print(theDataset.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

