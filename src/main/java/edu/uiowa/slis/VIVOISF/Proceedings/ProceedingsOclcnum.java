package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsOclcnumIterator theProceedings = (ProceedingsOclcnumIterator)findAncestorWithClass(this, ProceedingsOclcnumIterator.class);
			pageContext.getOut().print(theProceedings.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

