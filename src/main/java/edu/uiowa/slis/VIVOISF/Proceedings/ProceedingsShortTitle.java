package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsShortTitleIterator theProceedings = (ProceedingsShortTitleIterator)findAncestorWithClass(this, ProceedingsShortTitleIterator.class);
			pageContext.getOut().print(theProceedings.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

