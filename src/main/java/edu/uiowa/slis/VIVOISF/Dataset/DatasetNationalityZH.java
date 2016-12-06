package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNationalityZHIterator theDataset = (DatasetNationalityZHIterator)findAncestorWithClass(this, DatasetNationalityZHIterator.class);
			pageContext.getOut().print(theDataset.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

