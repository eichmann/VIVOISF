package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherOrcidIdInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherOrcidIdInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(otherOrcidIdInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			otherOrcidIdInverseIterator theotherOrcidIdInverseIterator = (otherOrcidIdInverseIterator)findAncestorWithClass(this, otherOrcidIdInverseIterator.class);
			pageContext.getOut().print(theotherOrcidIdInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing other for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for orcidId tag ");
		}
		return SKIP_BODY;
	}
}
