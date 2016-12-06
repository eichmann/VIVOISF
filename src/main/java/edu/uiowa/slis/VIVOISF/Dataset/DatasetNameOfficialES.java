package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameOfficialESIterator theDataset = (DatasetNameOfficialESIterator)findAncestorWithClass(this, DatasetNameOfficialESIterator.class);
			pageContext.getOut().print(theDataset.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

