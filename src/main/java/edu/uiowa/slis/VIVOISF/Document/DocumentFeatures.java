package edu.uiowa.slis.VIVOISF.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentFeaturesIterator theDocumentFeaturesIterator = (DocumentFeaturesIterator)findAncestorWithClass(this, DocumentFeaturesIterator.class);
			pageContext.getOut().print(theDocumentFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for features tag ");
		}
		return SKIP_BODY;
	}
}

