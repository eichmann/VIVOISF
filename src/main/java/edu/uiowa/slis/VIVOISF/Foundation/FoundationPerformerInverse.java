package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationPerformerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationPerformerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationPerformerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FoundationPerformerInverseIterator theFoundationPerformerInverseIterator = (FoundationPerformerInverseIterator)findAncestorWithClass(this, FoundationPerformerInverseIterator.class);
			pageContext.getOut().print(theFoundationPerformerInverseIterator.getPerformerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for performer tag ");
		}
		return SKIP_BODY;
	}
}

