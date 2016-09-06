package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPageEndIterator theProceedings = (ProceedingsPageEndIterator)findAncestorWithClass(this, ProceedingsPageEndIterator.class);
			pageContext.getOut().print(theProceedings.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

