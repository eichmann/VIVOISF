package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetProducerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetProducerType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetProducerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetProducerIterator theDatasetProducerIterator = (DatasetProducerIterator)findAncestorWithClass(this, DatasetProducerIterator.class);
			pageContext.getOut().print(theDatasetProducerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for producer tag ");
		}
		return SKIP_BODY;
	}
}

