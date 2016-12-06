package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetAgriculturalAreaTotalIterator theDataset = (DatasetAgriculturalAreaTotalIterator)findAncestorWithClass(this, DatasetAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theDataset.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

