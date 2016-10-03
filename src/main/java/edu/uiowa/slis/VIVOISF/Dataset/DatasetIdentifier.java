package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetIdentifierIterator theDataset = (DatasetIdentifierIterator)findAncestorWithClass(this, DatasetIdentifierIterator.class);
			pageContext.getOut().print(theDataset.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for identifier tag ");
		}
		return SKIP_BODY;
	}
}

