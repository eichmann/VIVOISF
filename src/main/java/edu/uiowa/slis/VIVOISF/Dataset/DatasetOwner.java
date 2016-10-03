package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetOwnerIterator theDatasetOwnerIterator = (DatasetOwnerIterator)findAncestorWithClass(this, DatasetOwnerIterator.class);
			pageContext.getOut().print(theDatasetOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for owner tag ");
		}
		return SKIP_BODY;
	}
}

