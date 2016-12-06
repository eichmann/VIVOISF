package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(KindRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindRO_0002353Iterator theKindRO_0002353Iterator = (KindRO_0002353Iterator)findAncestorWithClass(this, KindRO_0002353Iterator.class);
			pageContext.getOut().print(theKindRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

