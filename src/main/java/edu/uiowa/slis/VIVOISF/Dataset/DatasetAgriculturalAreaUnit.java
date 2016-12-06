package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetAgriculturalAreaUnitIterator theDataset = (DatasetAgriculturalAreaUnitIterator)findAncestorWithClass(this, DatasetAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theDataset.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

