package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRelatedByIterator theDatasetRelatedByIterator = (DatasetRelatedByIterator)findAncestorWithClass(this, DatasetRelatedByIterator.class);
			pageContext.getOut().print(theDatasetRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

