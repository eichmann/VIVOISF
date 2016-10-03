package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetProducerIterator theDatasetProducerIterator = (DatasetProducerIterator)findAncestorWithClass(this, DatasetProducerIterator.class);
			pageContext.getOut().print(theDatasetProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for producer tag ");
		}
		return SKIP_BODY;
	}
}

