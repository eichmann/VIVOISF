package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetHasMinLatitudeIterator theDataset = (DatasetHasMinLatitudeIterator)findAncestorWithClass(this, DatasetHasMinLatitudeIterator.class);
			pageContext.getOut().print(theDataset.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

