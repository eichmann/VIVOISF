package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsLccnIterator theProceedings = (ProceedingsLccnIterator)findAncestorWithClass(this, ProceedingsLccnIterator.class);
			pageContext.getOut().print(theProceedings.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for lccn tag ");
		}
		return SKIP_BODY;
	}
}

