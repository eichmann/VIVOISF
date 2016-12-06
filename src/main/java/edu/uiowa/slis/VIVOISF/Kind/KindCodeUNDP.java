package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeUNDPIterator theKind = (KindCodeUNDPIterator)findAncestorWithClass(this, KindCodeUNDPIterator.class);
			pageContext.getOut().print(theKind.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

