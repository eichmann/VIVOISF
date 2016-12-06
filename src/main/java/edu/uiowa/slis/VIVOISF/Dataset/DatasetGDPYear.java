package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetGDPYearIterator theDataset = (DatasetGDPYearIterator)findAncestorWithClass(this, DatasetGDPYearIterator.class);
			pageContext.getOut().print(theDataset.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

