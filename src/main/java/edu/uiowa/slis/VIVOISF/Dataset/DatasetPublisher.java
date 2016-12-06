package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetPublisherIterator theDatasetPublisherIterator = (DatasetPublisherIterator)findAncestorWithClass(this, DatasetPublisherIterator.class);
			pageContext.getOut().print(theDatasetPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for publisher tag ");
		}
		return SKIP_BODY;
	}
}

