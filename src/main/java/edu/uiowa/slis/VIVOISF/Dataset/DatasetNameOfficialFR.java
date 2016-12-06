package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameOfficialFRIterator theDataset = (DatasetNameOfficialFRIterator)findAncestorWithClass(this, DatasetNameOfficialFRIterator.class);
			pageContext.getOut().print(theDataset.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

