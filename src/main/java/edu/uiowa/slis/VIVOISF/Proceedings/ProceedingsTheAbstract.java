package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsTheAbstractIterator theProceedings = (ProceedingsTheAbstractIterator)findAncestorWithClass(this, ProceedingsTheAbstractIterator.class);
			pageContext.getOut().print(theProceedings.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

