package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetLandAreaYearIterator theDataset = (DatasetLandAreaYearIterator)findAncestorWithClass(this, DatasetLandAreaYearIterator.class);
			pageContext.getOut().print(theDataset.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

