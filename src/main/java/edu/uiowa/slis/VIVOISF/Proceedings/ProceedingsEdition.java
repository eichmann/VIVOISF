package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsEditionIterator theProceedings = (ProceedingsEditionIterator)findAncestorWithClass(this, ProceedingsEditionIterator.class);
			pageContext.getOut().print(theProceedings.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for edition tag ");
		}
		return SKIP_BODY;
	}
}

