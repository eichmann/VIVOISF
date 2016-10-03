package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatasetEanucc13Iterator theDataset = (DatasetEanucc13Iterator)findAncestorWithClass(this, DatasetEanucc13Iterator.class);
			pageContext.getOut().print(theDataset.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

