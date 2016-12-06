package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(KindCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindCodeISO2Iterator theKind = (KindCodeISO2Iterator)findAncestorWithClass(this, KindCodeISO2Iterator.class);
			pageContext.getOut().print(theKind.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

