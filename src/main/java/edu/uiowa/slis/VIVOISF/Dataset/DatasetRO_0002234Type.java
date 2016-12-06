package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetRO_0002234Iterator theDatasetRO_0002234Iterator = (DatasetRO_0002234Iterator)findAncestorWithClass(this, DatasetRO_0002234Iterator.class);
			pageContext.getOut().print(theDatasetRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

