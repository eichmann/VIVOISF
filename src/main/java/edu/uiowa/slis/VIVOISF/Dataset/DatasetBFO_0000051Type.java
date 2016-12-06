package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetBFO_0000051Iterator theDatasetBFO_0000051Iterator = (DatasetBFO_0000051Iterator)findAncestorWithClass(this, DatasetBFO_0000051Iterator.class);
			pageContext.getOut().print(theDatasetBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

