package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRO_0002353Iterator theDatasetRO_0002353Iterator = (DatasetRO_0002353Iterator)findAncestorWithClass(this, DatasetRO_0002353Iterator.class);
			pageContext.getOut().print(theDatasetRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

