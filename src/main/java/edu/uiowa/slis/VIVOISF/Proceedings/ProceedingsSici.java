package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsSiciIterator theProceedings = (ProceedingsSiciIterator)findAncestorWithClass(this, ProceedingsSiciIterator.class);
			pageContext.getOut().print(theProceedings.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for sici tag ");
		}
		return SKIP_BODY;
	}
}

