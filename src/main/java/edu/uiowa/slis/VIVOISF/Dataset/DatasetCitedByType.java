package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetCitedByIterator theDatasetCitedByIterator = (DatasetCitedByIterator)findAncestorWithClass(this, DatasetCitedByIterator.class);
			pageContext.getOut().print(theDatasetCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

