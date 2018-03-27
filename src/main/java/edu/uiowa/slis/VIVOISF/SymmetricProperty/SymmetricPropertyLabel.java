package edu.uiowa.slis.VIVOISF.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SymmetricPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyLabelIterator theSymmetricProperty = (SymmetricPropertyLabelIterator)findAncestorWithClass(this, SymmetricPropertyLabelIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for label tag ");
		}
		return SKIP_BODY;
	}
}

