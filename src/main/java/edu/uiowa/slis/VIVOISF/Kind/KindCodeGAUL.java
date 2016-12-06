package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeGAULIterator theKind = (KindCodeGAULIterator)findAncestorWithClass(this, KindCodeGAULIterator.class);
			pageContext.getOut().print(theKind.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

