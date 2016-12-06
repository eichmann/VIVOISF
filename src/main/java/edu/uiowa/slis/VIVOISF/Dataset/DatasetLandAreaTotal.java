package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetLandAreaTotalIterator theDataset = (DatasetLandAreaTotalIterator)findAncestorWithClass(this, DatasetLandAreaTotalIterator.class);
			pageContext.getOut().print(theDataset.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

