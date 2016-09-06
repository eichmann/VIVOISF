package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingCodeUNIterator theself_governing = (self_governingCodeUNIterator)findAncestorWithClass(this, self_governingCodeUNIterator.class);
			pageContext.getOut().print(theself_governing.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

