package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsShortDescriptionIterator theProceedings = (ProceedingsShortDescriptionIterator)findAncestorWithClass(this, ProceedingsShortDescriptionIterator.class);
			pageContext.getOut().print(theProceedings.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

