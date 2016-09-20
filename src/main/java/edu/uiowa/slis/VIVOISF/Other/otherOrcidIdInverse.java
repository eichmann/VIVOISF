package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherOrcidIdInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherOrcidIdInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(otherOrcidIdInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherOrcidIdInverseIterator theotherOrcidIdInverseIterator = (otherOrcidIdInverseIterator)findAncestorWithClass(this, otherOrcidIdInverseIterator.class);
			pageContext.getOut().print(theotherOrcidIdInverseIterator.getOrcidIdInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing other for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

