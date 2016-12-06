package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNationalityRUIterator theDataset = (DatasetNationalityRUIterator)findAncestorWithClass(this, DatasetNationalityRUIterator.class);
			pageContext.getOut().print(theDataset.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

