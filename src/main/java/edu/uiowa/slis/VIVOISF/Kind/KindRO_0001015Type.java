package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(KindRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindRO_0001015Iterator theKindRO_0001015Iterator = (KindRO_0001015Iterator)findAncestorWithClass(this, KindRO_0001015Iterator.class);
			pageContext.getOut().print(theKindRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

