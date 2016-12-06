package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(KindBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindBFO_0000050Iterator theKindBFO_0000050Iterator = (KindBFO_0000050Iterator)findAncestorWithClass(this, KindBFO_0000050Iterator.class);
			pageContext.getOut().print(theKindBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

