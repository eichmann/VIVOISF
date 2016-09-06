package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingCodeUNIterator thenon_self_governing = (non_self_governingCodeUNIterator)findAncestorWithClass(this, non_self_governingCodeUNIterator.class);
			pageContext.getOut().print(thenon_self_governing.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

