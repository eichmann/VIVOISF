package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPublisherIterator theProceedingsPublisherIterator = (ProceedingsPublisherIterator)findAncestorWithClass(this, ProceedingsPublisherIterator.class);
			pageContext.getOut().print(theProceedingsPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for publisher tag ");
		}
		return SKIP_BODY;
	}
}

