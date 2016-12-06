package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameOfficialZHIterator theDataset = (DatasetNameOfficialZHIterator)findAncestorWithClass(this, DatasetNameOfficialZHIterator.class);
			pageContext.getOut().print(theDataset.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

