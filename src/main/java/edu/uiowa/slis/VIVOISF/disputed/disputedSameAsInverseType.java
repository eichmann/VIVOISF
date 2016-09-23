package edu.uiowa.slis.VIVOISF.disputed;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class disputedSameAsInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static disputedSameAsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(disputedSameAsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			disputedSameAsInverseIterator thedisputedSameAsInverseIterator = (disputedSameAsInverseIterator)findAncestorWithClass(this, disputedSameAsInverseIterator.class);
			pageContext.getOut().print(thedisputedSameAsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing disputed for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing disputed for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

