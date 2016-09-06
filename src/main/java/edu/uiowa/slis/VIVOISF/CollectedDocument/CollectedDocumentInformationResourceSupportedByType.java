package edu.uiowa.slis.VIVOISF.CollectedDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectedDocumentInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollectedDocumentInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectedDocumentInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollectedDocumentInformationResourceSupportedByIterator theCollectedDocumentInformationResourceSupportedByIterator = (CollectedDocumentInformationResourceSupportedByIterator)findAncestorWithClass(this, CollectedDocumentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theCollectedDocumentInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CollectedDocument for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing CollectedDocument for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

