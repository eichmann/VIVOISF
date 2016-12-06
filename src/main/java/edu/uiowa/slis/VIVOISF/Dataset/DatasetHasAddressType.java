package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetHasAddressIterator theDatasetHasAddressIterator = (DatasetHasAddressIterator)findAncestorWithClass(this, DatasetHasAddressIterator.class);
			pageContext.getOut().print(theDatasetHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

