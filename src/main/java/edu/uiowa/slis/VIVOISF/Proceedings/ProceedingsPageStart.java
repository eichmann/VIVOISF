package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsPageStartIterator theProceedings = (ProceedingsPageStartIterator)findAncestorWithClass(this, ProceedingsPageStartIterator.class);
			pageContext.getOut().print(theProceedings.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

