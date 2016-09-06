package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsDoiIterator theProceedings = (ProceedingsDoiIterator)findAncestorWithClass(this, ProceedingsDoiIterator.class);
			pageContext.getOut().print(theProceedings.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for doi tag ");
		}
		return SKIP_BODY;
	}
}

