package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNationalityITIterator theDataset = (DatasetNationalityITIterator)findAncestorWithClass(this, DatasetNationalityITIterator.class);
			pageContext.getOut().print(theDataset.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

