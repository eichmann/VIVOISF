package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsAsinIterator theProceedings = (ProceedingsAsinIterator)findAncestorWithClass(this, ProceedingsAsinIterator.class);
			pageContext.getOut().print(theProceedings.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for asin tag ");
		}
		return SKIP_BODY;
	}
}

