package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsRO_0000056Iterator theProceedingsRO_0000056Iterator = (ProceedingsRO_0000056Iterator)findAncestorWithClass(this, ProceedingsRO_0000056Iterator.class);
			pageContext.getOut().print(theProceedingsRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

