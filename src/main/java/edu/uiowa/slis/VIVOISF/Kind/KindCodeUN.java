package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeUNIterator theKind = (KindCodeUNIterator)findAncestorWithClass(this, KindCodeUNIterator.class);
			pageContext.getOut().print(theKind.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

