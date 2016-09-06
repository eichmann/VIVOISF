package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetTranslatorIterator theDatasetTranslatorIterator = (DatasetTranslatorIterator)findAncestorWithClass(this, DatasetTranslatorIterator.class);
			pageContext.getOut().print(theDatasetTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for translator tag ");
		}
		return SKIP_BODY;
	}
}

