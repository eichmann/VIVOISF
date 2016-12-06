package edu.uiowa.slis.VIVOISF.Communication;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CommunicationRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CommunicationRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(CommunicationRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CommunicationRelatedByIterator theCommunicationRelatedByIterator = (CommunicationRelatedByIterator)findAncestorWithClass(this, CommunicationRelatedByIterator.class);
			pageContext.getOut().print(theCommunicationRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Communication for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Communication for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

