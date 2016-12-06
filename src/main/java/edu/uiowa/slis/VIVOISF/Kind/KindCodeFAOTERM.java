package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeFAOTERMIterator theKind = (KindCodeFAOTERMIterator)findAncestorWithClass(this, KindCodeFAOTERMIterator.class);
			pageContext.getOut().print(theKind.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

