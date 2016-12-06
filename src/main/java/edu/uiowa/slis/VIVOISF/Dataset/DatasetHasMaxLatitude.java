package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetHasMaxLatitudeIterator theDataset = (DatasetHasMaxLatitudeIterator)findAncestorWithClass(this, DatasetHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theDataset.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

