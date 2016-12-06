package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetNameOfficialARIterator theDataset = (DatasetNameOfficialARIterator)findAncestorWithClass(this, DatasetNameOfficialARIterator.class);
			pageContext.getOut().print(theDataset.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

