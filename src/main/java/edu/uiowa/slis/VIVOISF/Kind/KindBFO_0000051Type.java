package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(KindBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindBFO_0000051Iterator theKindBFO_0000051Iterator = (KindBFO_0000051Iterator)findAncestorWithClass(this, KindBFO_0000051Iterator.class);
			pageContext.getOut().print(theKindBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

