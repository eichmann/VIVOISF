package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsUpcIterator theProceedings = (ProceedingsUpcIterator)findAncestorWithClass(this, ProceedingsUpcIterator.class);
			pageContext.getOut().print(theProceedings.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for upc tag ");
		}
		return SKIP_BODY;
	}
}

