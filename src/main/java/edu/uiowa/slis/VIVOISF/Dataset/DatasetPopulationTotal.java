package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPopulationTotalIterator theDataset = (DatasetPopulationTotalIterator)findAncestorWithClass(this, DatasetPopulationTotalIterator.class);
			pageContext.getOut().print(theDataset.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

