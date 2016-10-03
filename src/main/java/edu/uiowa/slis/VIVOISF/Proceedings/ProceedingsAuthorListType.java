package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsAuthorListIterator theProceedingsAuthorListIterator = (ProceedingsAuthorListIterator)findAncestorWithClass(this, ProceedingsAuthorListIterator.class);
			pageContext.getOut().print(theProceedingsAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for authorList tag ");
		}
		return SKIP_BODY;
	}
}

