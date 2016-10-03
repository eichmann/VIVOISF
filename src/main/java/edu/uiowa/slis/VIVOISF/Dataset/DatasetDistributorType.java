package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetDistributorIterator theDatasetDistributorIterator = (DatasetDistributorIterator)findAncestorWithClass(this, DatasetDistributorIterator.class);
			pageContext.getOut().print(theDatasetDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for distributor tag ");
		}
		return SKIP_BODY;
	}
}

