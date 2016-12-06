package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRO_0001025Iterator theDatasetRO_0001025Iterator = (DatasetRO_0001025Iterator)findAncestorWithClass(this, DatasetRO_0001025Iterator.class);
			pageContext.getOut().print(theDatasetRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

