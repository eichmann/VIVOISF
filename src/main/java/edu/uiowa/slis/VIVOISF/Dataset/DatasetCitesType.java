package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetCitesIterator theDatasetCitesIterator = (DatasetCitesIterator)findAncestorWithClass(this, DatasetCitesIterator.class);
			pageContext.getOut().print(theDatasetCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for cites tag ");
		}
		return SKIP_BODY;
	}
}

