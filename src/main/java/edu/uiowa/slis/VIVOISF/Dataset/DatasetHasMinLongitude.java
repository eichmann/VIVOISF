package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetHasMinLongitudeIterator theDataset = (DatasetHasMinLongitudeIterator)findAncestorWithClass(this, DatasetHasMinLongitudeIterator.class);
			pageContext.getOut().print(theDataset.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

