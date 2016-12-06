package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPopulationYearIterator theDataset = (DatasetPopulationYearIterator)findAncestorWithClass(this, DatasetPopulationYearIterator.class);
			pageContext.getOut().print(theDataset.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

