package edu.uiowa.slis.VIVOISF.DocumentPart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPartFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DocumentPartFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPartFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPartFeaturesIterator theDocumentPartFeaturesIterator = (DocumentPartFeaturesIterator)findAncestorWithClass(this, DocumentPartFeaturesIterator.class);
			pageContext.getOut().print(theDocumentPartFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing DocumentPart for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing DocumentPart for features tag ");
		}
		return SKIP_BODY;
	}
}

