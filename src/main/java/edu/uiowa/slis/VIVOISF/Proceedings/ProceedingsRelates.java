package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsRelatesIterator theProceedingsRelatesIterator = (ProceedingsRelatesIterator)findAncestorWithClass(this, ProceedingsRelatesIterator.class);
			pageContext.getOut().print(theProceedingsRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for relates tag ");
		}
		return SKIP_BODY;
	}
}

