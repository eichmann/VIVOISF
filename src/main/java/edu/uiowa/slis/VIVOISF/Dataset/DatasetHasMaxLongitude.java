package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetHasMaxLongitudeIterator theDataset = (DatasetHasMaxLongitudeIterator)findAncestorWithClass(this, DatasetHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theDataset.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

