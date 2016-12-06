package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeFAOSTATIterator theKind = (KindCodeFAOSTATIterator)findAncestorWithClass(this, KindCodeFAOSTATIterator.class);
			pageContext.getOut().print(theKind.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

