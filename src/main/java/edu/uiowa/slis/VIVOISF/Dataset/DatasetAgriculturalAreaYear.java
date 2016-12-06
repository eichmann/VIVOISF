package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetAgriculturalAreaYearIterator theDataset = (DatasetAgriculturalAreaYearIterator)findAncestorWithClass(this, DatasetAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theDataset.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

