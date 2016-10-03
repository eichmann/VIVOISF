package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ProceedingsHandleIterator theProceedings = (ProceedingsHandleIterator)findAncestorWithClass(this, ProceedingsHandleIterator.class);
			pageContext.getOut().print(theProceedings.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for handle tag ");
		}
		return SKIP_BODY;
	}
}

