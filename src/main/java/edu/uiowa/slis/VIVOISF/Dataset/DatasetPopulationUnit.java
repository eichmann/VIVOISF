package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetPopulationUnitIterator theDataset = (DatasetPopulationUnitIterator)findAncestorWithClass(this, DatasetPopulationUnitIterator.class);
			pageContext.getOut().print(theDataset.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

