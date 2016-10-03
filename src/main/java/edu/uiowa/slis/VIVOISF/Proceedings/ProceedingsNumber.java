package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsNumberIterator theProceedings = (ProceedingsNumberIterator)findAncestorWithClass(this, ProceedingsNumberIterator.class);
			pageContext.getOut().print(theProceedings.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for number tag ");
		}
		return SKIP_BODY;
	}
}

