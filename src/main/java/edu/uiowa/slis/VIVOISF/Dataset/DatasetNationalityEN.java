package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNationalityENIterator theDataset = (DatasetNationalityENIterator)findAncestorWithClass(this, DatasetNationalityENIterator.class);
			pageContext.getOut().print(theDataset.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

