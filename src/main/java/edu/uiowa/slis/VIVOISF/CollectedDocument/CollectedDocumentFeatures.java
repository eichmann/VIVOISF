package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentFeaturesIterator theCollectedDocumentFeaturesIterator = (CollectedDocumentFeaturesIterator)findAncestorWithClass(this, CollectedDocumentFeaturesIterator.class);
			pageContext.getOut().print(theCollectedDocumentFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for features tag ");
		}
		return SKIP_BODY;
	}
}

