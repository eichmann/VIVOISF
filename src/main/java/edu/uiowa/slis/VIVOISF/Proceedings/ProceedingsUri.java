package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsUriIterator theProceedings = (ProceedingsUriIterator)findAncestorWithClass(this, ProceedingsUriIterator.class);
			pageContext.getOut().print(theProceedings.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for uri tag ");
		}
		return SKIP_BODY;
	}
}

