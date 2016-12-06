package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNationalityARIterator theDataset = (DatasetNationalityARIterator)findAncestorWithClass(this, DatasetNationalityARIterator.class);
			pageContext.getOut().print(theDataset.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

