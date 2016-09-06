package edu.uiowa.slis.VIVOISF.Dataset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatasetTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatasetTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatasetTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DatasetTranslationOfIterator theDatasetTranslationOfIterator = (DatasetTranslationOfIterator)findAncestorWithClass(this, DatasetTranslationOfIterator.class);
			pageContext.getOut().print(theDatasetTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Dataset for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Dataset for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

