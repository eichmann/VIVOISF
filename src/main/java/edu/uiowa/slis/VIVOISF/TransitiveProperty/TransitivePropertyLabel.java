package edu.uiowa.slis.VIVOISF.TransitiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransitivePropertyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TransitivePropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TransitivePropertyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TransitivePropertyLabelIterator theTransitiveProperty = (TransitivePropertyLabelIterator)findAncestorWithClass(this, TransitivePropertyLabelIterator.class);
			pageContext.getOut().print(theTransitiveProperty.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing TransitiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for label tag ");
		}
		return SKIP_BODY;
	}
}

