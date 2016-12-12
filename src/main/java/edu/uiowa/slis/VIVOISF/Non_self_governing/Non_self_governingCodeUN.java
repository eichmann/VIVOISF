package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingCodeUNIterator theNon_self_governing = (Non_self_governingCodeUNIterator)findAncestorWithClass(this, Non_self_governingCodeUNIterator.class);
			pageContext.getOut().print(theNon_self_governing.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

