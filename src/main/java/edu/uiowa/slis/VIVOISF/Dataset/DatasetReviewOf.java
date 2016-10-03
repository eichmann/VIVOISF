package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetReviewOfIterator theDatasetReviewOfIterator = (DatasetReviewOfIterator)findAncestorWithClass(this, DatasetReviewOfIterator.class);
			pageContext.getOut().print(theDatasetReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

