package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsStatusIterator theProceedingsStatusIterator = (ProceedingsStatusIterator)findAncestorWithClass(this, ProceedingsStatusIterator.class);
			pageContext.getOut().print(theProceedingsStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for status tag ");
		}
		return SKIP_BODY;
	}
}

