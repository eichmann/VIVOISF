package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNationalityFRIterator theDataset = (DatasetNationalityFRIterator)findAncestorWithClass(this, DatasetNationalityFRIterator.class);
			pageContext.getOut().print(theDataset.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

