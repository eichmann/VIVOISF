package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeISO3Iterator theKind = (KindCodeISO3Iterator)findAncestorWithClass(this, KindCodeISO3Iterator.class);
			pageContext.getOut().print(theKind.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

