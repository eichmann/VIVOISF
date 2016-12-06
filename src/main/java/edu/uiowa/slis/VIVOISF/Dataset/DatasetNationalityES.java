package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNationalityESIterator theDataset = (DatasetNationalityESIterator)findAncestorWithClass(this, DatasetNationalityESIterator.class);
			pageContext.getOut().print(theDataset.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

