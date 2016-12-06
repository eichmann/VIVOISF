package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRO_0001015Iterator theDatasetRO_0001015Iterator = (DatasetRO_0001015Iterator)findAncestorWithClass(this, DatasetRO_0001015Iterator.class);
			pageContext.getOut().print(theDatasetRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

